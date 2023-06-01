package esempio.demo.data;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
public @Data class Circle extends ColoredFigure {
	private double radius;
}
