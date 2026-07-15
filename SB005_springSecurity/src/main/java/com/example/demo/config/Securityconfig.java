package com.example.demo.config;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class Securityconfig {
	

	    @Bean
	    PasswordEncoder passwordEncoder() {
	        return new BCryptPasswordEncoder();
	    }

	  	@Bean
	    InMemoryUserDetailsManager userDetailsService(PasswordEncoder encoder) {

	        UserDetails user = User.builder()
	                .username("user")
	                .password(encoder.encode("user123"))
	                .roles("USER")
	                .build();

	        UserDetails admin = User.builder()
	                .username("admin")
	                .password(encoder.encode("admin123"))
	                .roles("ADMIN")
	                .build();

	        return new InMemoryUserDetailsManager(user, admin);
	    }
	  	
	  	@Bean
	  	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

	  	    http
	  	  .csrf(csrf -> csrf.disable())
	  	        .authorizeHttpRequests(auth -> auth
	  	            .requestMatchers("/loginpage", "/home","/doLogin/**", "/css/**","/WEB-INF/**").permitAll()
	  	            .requestMatchers("/admin/**").hasRole("ADMIN")
	  	            .requestMatchers("/user/**").hasRole("USER")
	  	            .anyRequest().authenticated()
	  	        )

	  	        .formLogin(form -> form
	  	            .loginPage("/loginpage")
	  	            .loginProcessingUrl("/doLogin")
	  	            .defaultSuccessUrl("/home", true)
	  	            .failureUrl("/loginpage?error")
	  	            .permitAll()
	  	        )

	  	        .logout(logout -> logout
	  	            .logoutUrl("/logout")
	  	            .logoutSuccessUrl("/loginpage?logout")
	  	            .invalidateHttpSession(true)
	  	            .deleteCookies("JSESSIONID")
	  	        );

	  	    return http.build();
	  	}
	
//	    @Bean
//	    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//
//	        http
//	                .csrf(csrf -> csrf.disable())
//
//	                .authorizeHttpRequests(auth -> auth
//
//	                        .requestMatchers("/admin/**").hasRole("ADMIN")
//
//	                        .requestMatchers("/user/**").hasAnyRole("USER")
//
//	                        .requestMatchers("/","/home").permitAll()
//
//	                        .anyRequest().authenticated()
//	                )
//
//	                .httpBasic(Customizer.withDefaults());
//
//	        return http.build();
//	    }
	
}
