package com.blog.samples.actuator;

import org.springframework.boot.actuate.info.Info.Builder;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

@Component
public class CustomInfoContributor implements InfoContributor {

	@Override
	public void contribute(Builder builder) {
		
		builder.withDetail("remoteServiceVersion", getRemoteServiceVersion());
	}
	
	private String getRemoteServiceVersion(){
		return "1.2.3";
	}
}