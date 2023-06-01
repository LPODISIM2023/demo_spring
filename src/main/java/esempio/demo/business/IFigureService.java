package esempio.demo.business;

import java.util.List;

import org.springframework.stereotype.Service;

import esempio.demo.data.ColoredFigure;

@Service
public interface IFigureService <T extends ColoredFigure>{
	public List<T> getAll();
}
