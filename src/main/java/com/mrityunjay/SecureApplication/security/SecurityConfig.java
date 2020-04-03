package com.mrityunjay.SecureApplication.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Bean
	PasswordEncoder passwordEncoder() {
		return new CustomNoOpPasswordEncoder();
	};
	
//	@Override
//	public void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.inMemoryAuthentication()
//		.withUser("sam").password("Sam@123").roles("ADMIN")
//		.and().withUser("john").password("John@123").roles("USER")
//		.and().withUser("bob").password("Bob@123").roles("EMPLOYEE");
//	}
	
	@Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) 
            throws Exception 
    {
		System.out.println("In configureGlobal");
        auth.inMemoryAuthentication()
		.withUser("sam").password("Sam@123").roles("ADMIN")
		.and().withUser("john").password("John@123").roles("USER")
		.and().withUser("bob").password("Bob@123").roles("EMPLOYEE")
		;
    }

	@Override
	public void configure(HttpSecurity http) throws Exception {
		http
		.csrf().disable()
		.authorizeRequests()
		.antMatchers(HttpMethod.OPTIONS,"/**").permitAll()
		.antMatchers("/SecureApplication**").hasAnyRole("ADMIN", "USER")
		.anyRequest().authenticated()
//		.and().formLogin()
		.and().httpBasic()
//		.authenticationEntryPoint(authenticationEntryPoint) 
		.and().logout()
	    .logoutSuccessUrl("/")
			.invalidateHttpSession(true)
			.deleteCookies("JSESSIONID")
		.and().requiresChannel().anyRequest().requiresSecure()
		.and().sessionManagement().maximumSessions(1)
		
		;
	}
}
