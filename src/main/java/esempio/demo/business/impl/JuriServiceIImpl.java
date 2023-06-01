package esempio.demo.business.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import esempio.demo.business.IMyService;
import esempio.demo.data.Point;
import lombok.extern.slf4j.Slf4j;

@Component
@Qualifier("Juri")
@Slf4j
public class JuriServiceIImpl implements IMyService {

	@Value("${test.application.name}")
	String value;

	@Override
	public void printami(Point s) {
		log.info("x= " + s.getX() + "  y=" + s.getY() + " JURI");
		log.info(value);
	}

	@Override
	public Point getPoint(String x, String s) {
		return new Point(x, s);
	}

}
