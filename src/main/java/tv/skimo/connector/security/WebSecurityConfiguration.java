package tv.skimo.connector.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {
   @Override
   protected void configure(HttpSecurity http) throws Exception {
	   
       String[] resources = new String[]{
               "/","/css/**","/js/**","/img/**","favicon.ico","logo.png","favicon.ico",
               "/**/skimo.html","/skimo/**","/about.html", "/**/*.css", 
               "/**/*.png", "/**/*.js","/**/*.mp4", "/**/skimo.html","**/*.sub",
               "/copyright.html", "/privacy.html", "/plans.html", "/terms.html","/SkimoLongView.pdf"
       };

      http
         .csrf()
         .disable()
         .antMatcher("/**")
         .authorizeRequests()
         .antMatchers(resources)
         .permitAll()
         .anyRequest()
         .authenticated()   
        .and()
        .oauth2Login();
   }

}