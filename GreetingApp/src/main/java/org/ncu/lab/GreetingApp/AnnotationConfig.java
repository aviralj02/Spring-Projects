package org.ncu.lab.GreetingApp;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScans({ @ComponentScan("org.ncu.lab"), @ComponentScan("sportsCoach")})
public class AnnotationConfig {
	
}
