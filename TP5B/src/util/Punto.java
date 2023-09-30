package util;

public class Punto {

	private Integer x;
	private Integer y;

	public Punto(Integer x, Integer y) {
		this.x = x;
		this.y = y;
	}

	public void setX(Integer x) {
		this.x = x;
	}

	public void setY(Integer y) {
		this.y = y;
	}

	public Integer getX() {
		return x;
	}

	public Integer getY() {
		return y;
	}

	public String getCoordenadas() {
		return "X= " + x + ", Y= " + y;
	}

}
