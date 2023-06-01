package esempio.demo.business.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import esempio.demo.business.IFigureService;
import esempio.demo.data.Triangle;

@Component
public class TriangoloServiceImpl implements IFigureService<Triangle> {

	@Override
	public List<Triangle> getAll() {
		List<Triangle> results =  List.of(new Triangle(3, 4), new Triangle(5 ,8), new Triangle(6, 10));
		return results;
	}
}
