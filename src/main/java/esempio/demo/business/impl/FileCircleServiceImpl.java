package esempio.demo.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import esempio.demo.business.IFigureService;
import esempio.demo.data.Circle;

@Component
@Qualifier("File")
@Primary
public class FileCircleServiceImpl implements IFigureService<Circle> {

	@Override
	public List<Circle> getAll() {
		List<Circle> results =  null;
		//TODO
		return results;
	}

}
