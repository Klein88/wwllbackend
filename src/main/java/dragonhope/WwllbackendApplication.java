package dragonhope;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("dragonhope.mapper")
public class WwllbackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(WwllbackendApplication.class, args);
	}

}
