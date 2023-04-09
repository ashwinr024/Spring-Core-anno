package com.a.anno;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;



@Component
public class cricketcoach implements Coach {

	@Autowired
	private fortuneservice fortuneservice;
	@Value("${foo.email}")
	private String email;
	
	@PreDestroy
	public void ddd()
	{
		System.out.println("DDDDDDDDDD");
	}
	@PostConstruct
	public void sss()
	{
		System.out.println("SSSSSSSSS");
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public cricketcoach()
	{
		
	}
//public void setfortuneservice(fortuneservice fortuneservice) {
//		this.fortuneservice = fortuneservice;
//	}

//		public cricketcoach(fortuneservice fortuneservice)
//	{
//		this.fortuneservice=fortuneservice;
//	}
	public String getCoach() {
		// TODO Auto-generated method stub
		return "Play defencive shots";
	}

	public String getFotune() {
		// TODO Auto-generated method stub
		return fortuneservice.getFotune();
	}
	public void ema()
	{
		System.out.println(this.email);
	}
	
}
