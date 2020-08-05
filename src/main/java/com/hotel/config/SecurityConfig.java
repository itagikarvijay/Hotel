/**
 * 
 */
package com.hotel.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

/**
 * @author User
 *
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	AuthManager authenticationProvider;

	protected void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.authenticationProvider(authenticationProvider);
	}

	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
//		http.httpBasic();
//		http.authorizeRequests().antMatchers("**/public/**").permitAll();
//		http.authorizeRequests().antMatchers("**/private/**").authenticated();

//		http.authorizeRequests().antMatchers("**/api/users/authenticateUser").permitAll();
//		http.authorizeRequests().antMatchers("**/api/users/logout").permitAll();
//		http.authorizeRequests().antMatchers("**/api/users/invalidateSessionUrl").permitAll();

		http.authorizeRequests().antMatchers("/", "/login").permitAll() 
				.anyRequest().authenticated() 
				.and().formLogin() 
				.loginPage("/login") 
				.defaultSuccessUrl("/home").failureUrl("/login?error=true").permitAll()
				.and().logout().logoutRequestMatcher(new AntPathRequestMatcher("/logoutUrl")) 
				.logoutSuccessUrl("/login?logout=true").invalidateHttpSession(true).permitAll()
				.and().httpBasic(); 

		http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED).maximumSessions(1)
				.expiredUrl("/logoutUrl").and().invalidSessionUrl("/invalidateSessionUrl");
		
//		http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED).maximumSessions(1)
//		.and().invalidSessionUrl("/invalidateSessionUrl");

		http.sessionManagement().sessionFixation().migrateSession();
	}
//
//	@Bean
//	public HttpSessionEventPublisher httpSessionEventPublisher() {
//		return new HttpSessionEventPublisher();
//	}

}
