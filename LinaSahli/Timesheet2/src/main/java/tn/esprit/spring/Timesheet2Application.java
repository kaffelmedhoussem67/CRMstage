package tn.esprit.spring;

import java.util.Arrays;
import java.util.EnumSet;

import javax.servlet.DispatcherType;

import org.ocpsoft.rewrite.servlet.RewriteFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.example.demo.util.RoleEnum;

import tn.esprit.spring.Repository.ContactRepository;
import tn.esprit.spring.Repository.RoleRepository;
import tn.esprit.spring.Repository.UserRepository;
import tn.esprit.spring.entity.Contact;
import tn.esprit.spring.entity.Role;
import tn.esprit.spring.entity.User;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })

@EnableAutoConfiguration
@ComponentScan({"tn.esprit.spring.Controller,tn.esprit.spring.Service"})

public class Timesheet2Application {
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
	    auth.inMemoryAuthentication().withUser("john").password("$2a$04$AjFEmZeX7mN8zSn57PUEZeJgBeoKMvwteZMBiP57Jb4AGFsUORmLC").roles("USER");
	}
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx= SpringApplication.run(Timesheet2Application.class, args);
		ContactRepository FicheRepository= ctx.getBean(ContactRepository.class);
	    FicheRepository.save(new Contact());


		RoleRepository RoleRepository= ctx.getBean(RoleRepository.class);
		Role roleUser=new Role(RoleEnum.ROLE_USER);
		Role roleAdmin=new Role(RoleEnum.ROLE_ADMIN);
		 RoleRepository.save(roleUser);
		 RoleRepository.save(roleAdmin);
		 
		UserRepository UserRepository = ctx.getBean(UserRepository .class);
		User  user = new User("user","0000",true);
		user.setRoles(Arrays.asList(roleUser));
		UserRepository.save(user);
		
		User  admin = new User("admin","0000",true);
		admin.setRoles(Arrays.asList(roleAdmin,roleUser));
		UserRepository.save(admin);
		
}
	
	@Bean
	public BCryptPasswordEncoder encoder() {
	    return new BCryptPasswordEncoder();
	}
	

}