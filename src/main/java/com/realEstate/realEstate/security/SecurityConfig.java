package com.realEstate.realEstate.security;

import com.realEstate.realEstate.security.handlers.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.Arrays;

@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter{
//    @Autowired
//    private UserDetailsService userDetailsServiceImpl;

    @Autowired
    private AuthenticationEntryPointImpl authenticationEntryPointImpl;

    @Autowired
    private AccessDeniedHandlerImpl accessDeniedHandlerImpl;

    @Autowired
    private AuthenticationSuccessHandlerImpl authenticationSuccessHandlerImpl;

    @Autowired
    private AuthenticationFailureHandlerImpl authenticationFailureHandlerImpl;

    @Autowired
    private LogoutSuccessHandlerImpl logoutSuccessHandlerImpl;

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.cors();
        http.csrf().disable();
        http.authorizeRequests((requests)
                        -> requests
                        .anyRequest().permitAll()
        );
        http.exceptionHandling()
                .accessDeniedHandler(accessDeniedHandlerImpl)
                .authenticationEntryPoint(authenticationEntryPointImpl);

        http.formLogin()
                .usernameParameter("username")
                .passwordParameter("password")
                .successHandler(authenticationSuccessHandlerImpl)
                .failureHandler(authenticationFailureHandlerImpl);
        http.logout()
                .permitAll()
                .logoutUrl("/logout")
                .logoutSuccessHandler(logoutSuccessHandlerImpl);
        http.httpBasic();
    }
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder(11);
    }

//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(userDetailsServiceImpl).passwordEncoder(new BCryptPasswordEncoder(11));
//    }

    @Bean
    public CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration configuration = new CorsConfiguration();
        configuration.addAllowedOriginPattern("*"); // You should only set trusted site here. e.g. http://localhost:4200 means only this site can access.
        configuration.setAllowedMethods(Arrays.asList("GET","POST","PUT","DELETE","HEAD","OPTIONS"));
        configuration.addAllowedHeader("*");
        configuration.setAllowCredentials(true);
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration);
        return source;
    }
}
