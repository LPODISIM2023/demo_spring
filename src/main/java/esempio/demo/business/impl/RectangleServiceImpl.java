package esempio.demo.business.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import esempio.demo.business.IFigureService;
import esempio.demo.data.Rectangle;
import esempio.demo.data.Triangle;

@Component
public class RectangleServiceImpl implements IFigureService<Rectangle> {

	

	@Override
	public List<Rectangle> getAll() {
		List<Rectangle> results =  List.of(new Rectangle(3, 4), new Rectangle(5 ,8), new Rectangle(6, 10));
		return results;
	}

}
