package esempio.demo.business;

import org.springframework.stereotype.Service;

import esempio.demo.data.Point;

@Service
public interface IMyService {
	public void printami(Point s);
	public Point getPoint(String x, String y);
}
