package esempio.demo.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import esempio.demo.business.IFigureService;
import esempio.demo.data.Circle;
import esempio.demo.data.Rectangle;

@Component
@Qualifier("Memory")
public class MemoryCircleServiceImpl implements IFigureService<Circle> {
	@Autowired
	private IFigureService<Rectangle> rectangleService;
	@Override
	public List<Circle> getAll() {
		rectangleService.getAll().forEach(z -> System.out.println(z));;
		List<Circle> results =  List.of(new Circle(13), new Circle(2), new Circle(32));
		return results;
	}
}
