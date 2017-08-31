package com.blog.samples.actuator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class HealthCheck implements HealthIndicator {
	
	@Override
	public Health health() {
	
		if(isRemoteServiceUp()){
			return Health.up()
					 .withDetail("remote service", "online")
					 .build();		
		}
		
		return Health.down()
				 .withDetail("remote service", "offline")
				 .build();				
	}
	
	private boolean isRemoteServiceUp(){
		
		// perform call out to remote service to check if its up
		return true;
	}
}
