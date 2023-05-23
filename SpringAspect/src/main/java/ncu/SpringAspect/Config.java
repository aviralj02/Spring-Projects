package ncu.SpringAspect;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import ncu.SpringAspect.entity.Account;

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass=true)
@ComponentScan("ncu.SpringAspect")
public class Config {
	
	@Bean("accountBean")
	public Account getAccount() {
		return new Account();
	}
}
