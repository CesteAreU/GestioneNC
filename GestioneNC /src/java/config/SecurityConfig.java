/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

/**
 *
 * @author FSEVERI\frasson3479
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
	  auth.inMemoryAuthentication().withUser("R000000010").password("123456").roles("RESP");
	  auth.inMemoryAuthentication().withUser("admin").password("123456").roles("ADMIN");
	  auth.inMemoryAuthentication().withUser("dba").password("123456").roles("DBA");
	}

	@Override
	protected void configure(HttpSecurity http) throws java.lang.Exception {

	  http.authorizeRequests()
		.antMatchers("/resp/**").access("hasRole('ROLE_ADMIN')")
		.antMatchers("/dba/**").access("hasRole('ROLE_ADMIN') or hasRole('ROLE_DBA')")
		.and().formLogin();

	}
    
        /*@Autowired
        public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception{
            auth
                    .inMemoryAuthentication()
                    .withUser("R0000000010").password("123456").roles("RESP").and()
                    .withUser("admin").password("123456").roles("ADMIN").and()
                    .withUser("dba").password("123456").roles("DBA");
        }
        
        @Override
        protected void configure(HttpSecurity http) throws Exception{
            http.authorizeRequest()
                    .antMAtchers("/resp/**").access("hasRole('ADMIN')").and()
                    .antMatchers("/dba/**").access("hasRole('ADMIN')").and()
                    .antMatchers("/dba/**").access("hasRole('DBA')")      
                    .and().formLogin();
                    
            http.csrf().disable();
        }*/
}
