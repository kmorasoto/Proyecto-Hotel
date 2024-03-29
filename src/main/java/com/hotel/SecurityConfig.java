/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotel;

import com.hotel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

/**
 *
 * @author Daniela
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserService userDetailsService;

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public UserService getUserService() {
        return new UserService();
    }

    //Se crea un objeto al que se le va a pasar la contraseña con el método bcrypt
    @Bean
    DaoAuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
        daoAuthenticationProvider.setPasswordEncoder(passwordEncoder());
        daoAuthenticationProvider.setUserDetailsService(getUserService());
        return daoAuthenticationProvider;
    }

    //qué hago si mi autenticación fue correcta?
    @Bean
    public AuthenticationSuccessHandler appAuthenticationSuccessHandler() {
        return new AppAuthenticationSuccessHandler();

    }

    public SecurityConfig(UserService userPrincipalDetailsService) {
        this.userDetailsService = userPrincipalDetailsService;
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) {
        auth.authenticationProvider(authenticationProvider());
    }

    //El siguiente método funciona para hacer la autenticación del usuario
    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.authorizeRequests()
                .antMatchers("/Inicio", "/inicioAdmin", "/registro", "/reservaevento",
                        "/reservasakura", "/reservaquattro", "/reservatour",
                        "menusakuraAdmin", "/menuquattroAdmin", "/habitacion",
                        "/reservahabitacion", "habitacionesAdmin") //tiene acceso a  estos enpoints si tiene el role de ADMIN
                .hasRole("ADMIN")
                .antMatchers("/Inicio", "/login", "/habitaciones1", "/habitacion",
                        "/reservahabitacionN", "/restauranteSakura", "/menusakura",
                        "/restauranteQuattro", "/menuquattro", "/reservasakuraN",
                        "/reservaquattroN", "/eventos", "/reservaeventoN", "/preguntasFrecuentes",
                        "/nosotros", "/toursS", "/reservatour") //a estos enpoints pueden ir cualquiera que tengan los siguientes roles
                .hasAnyRole("USER", "ADMIN")
                //.anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login").permitAll().defaultSuccessUrl("/Inicio", true) //esto es porque queremos utilizar nuestro propio login
        
                .and()
                .logout().logoutSuccessUrl("/login");        
    }

}
