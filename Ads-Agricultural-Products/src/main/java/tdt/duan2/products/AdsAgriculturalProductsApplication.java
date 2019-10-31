package tdt.duan2.products;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages= {"tdt.duan2.controller"})
@SpringBootApplication
public class AdsAgriculturalProductsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdsAgriculturalProductsApplication.class, args);
	}

}
