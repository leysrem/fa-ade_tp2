package fr.mds.façade_tp2.tp1;

public class ShapeMaker {
	
	public static final String CIRCLE = "";

	public ShapeMaker() {
		
	}
	
	public ShapeMaker(String circle) {
		
	}

	public void drawCircle() {
		Shape myCircle = new Circle();
		
		myCircle.draw();
	}

	public void drawRectangle() {
		Shape myRectangle = new Rectangle();
		
		myRectangle.draw();
		
	}

	public void drawSquare() {
		Shape mySquare = new Square();
		
		mySquare.draw();
		
	}
	
}
