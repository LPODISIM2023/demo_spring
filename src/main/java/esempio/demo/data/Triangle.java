package esempio.demo.data;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
public @Data class Triangle extends ColoredFigure {
	private double base;
	private double height;
}
