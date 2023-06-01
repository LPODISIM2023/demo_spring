package esempio.demo.data;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
public @Data class  Rectangle extends ColoredFigure {
	private double width;
	private double height;
}
