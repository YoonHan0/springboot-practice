package ex03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/*
 * Configuration -> SpringBootConfiguration
 * ComponentScan은 따로 package를 설정하지 않아도 아래를 알아서 Scanning한다
 * 
 * */

@SpringBootConfiguration
@ComponentScan
public class MyApplication {
	public static void main(String[] args) {
		try(ConfigurableApplicationContext ac = SpringApplication.run(MyApplication.class, args)){}
	}
}
