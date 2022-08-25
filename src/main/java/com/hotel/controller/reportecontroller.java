/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotel.controller;


import com.hotel.entity.reservatour;
import com.hotel.service.IreservatourService;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.List;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author XLight
 */
@RestController
public class reportecontroller {
    
        @Autowired
    private IreservatourService reservatourService;
    @GetMapping("/pdf")
    public String generatePDF(Model model1) throws Exception, JRException {
        
        List<reservatour> listareservatour = reservatourService.getAllreservatour();
        
        JRBeanCollectionDataSource beanCollectionDataSource = new JRBeanCollectionDataSource(listareservatour);
        JasperReport compileReport = JasperCompileManager.compileReport(new FileInputStream("src/main/java/com/hotel/report1.jrxml"));
        
        HashMap<String, Object> map = new HashMap<>();
        JasperPrint report = JasperFillManager.fillReport(compileReport, map, beanCollectionDataSource);
        JasperExportManager.exportReportToPdfFile(report, "invoice.pdf");
        
        return "generated";
    }
}
