package esempio.demo.business.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import esempio.demo.business.IMyService;
import esempio.demo.data.Point;
import lombok.extern.java.Log;

@Component
@Log
@Qualifier("Lorenzo")
public class LorenzoServiceIImpl implements IMyService {

	@Override
	public void printami(Point s) {
		log.info(s.getX() + " Lorenzo");
	}

	@Override
	public Point getPoint(String x, String y) {
		return new Point(x + "Lorenzo", y + "Lorenzo");
	}

}
