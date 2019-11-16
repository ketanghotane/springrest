package com.lti.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


import com.lti.model.Address;

@Configuration
@ComponentScan(basePackages="com.lti.model")
public class JavaConfig {
	@Bean(name="address3")                    
	public Address getAddress(){
		Address address= new Address("pune","nigdi","452152");
		return address;				
	}
	
	@Bean(name="address2")
	public Address getAddress2(){
		Address address= new Address("pune","nigdi","452152");
		return address;				
	}
	
	
	

}
