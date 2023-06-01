package esempio.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import esempio.demo.business.IFigureService;
import esempio.demo.data.Circle;
import esempio.demo.data.Triangle;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class RunnerFigure implements ApplicationRunner{
	
	@Autowired
	IFigureService<Triangle> triangleService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		log.info("secondo esempio");
		List<Triangle> triangleAreas = triangleService.getAll();		
		triangleAreas.forEach(z -> log.info(z.toString()));
		
	
	}
}
