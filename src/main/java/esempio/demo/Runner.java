package esempio.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import esempio.demo.business.IMyService;
import esempio.demo.data.Point;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class Runner implements ApplicationRunner{
	
	@Autowired
	@Qualifier("Lorenzo")
	IMyService mioServizio;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		log.info("First example");
		mioServizio.printami(new Point("10", "20"));		
	}
}
