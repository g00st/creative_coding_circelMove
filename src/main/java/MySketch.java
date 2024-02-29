import processing.core.PApplet;
import processing.opengl.PShader;
import controlP5.*;


public class MySketch extends PApplet {
	ControlP5 cp5;

	int forgrundradius = 20;
	int backgroundradius = 30;
	int xcount = 10;
			int ycount = 10;
	public void setup() {
		this.getSurface().setResizable(true);
		randomSeed(1000);
	}

	public void settings() {
		size(500, 500);
	}

	public void frameResized(int w, int h) {

	}

	public void draw(){
		background(255);
		randomSeed(100);
		noStroke();

		for (int i =0 ;  i <ycount ; i++){
			for (int j = 0; j  < xcount ; j++){
				fill(0, 0, 0);
				var xb = backgroundradius+( (float)j*(width-backgroundradius)/xcount)+random(-1,1)*0.1f*(mouseX+mouseY);
				var yb = backgroundradius+((float)i* (height-backgroundradius)/ycount)+random(-1,1)*0.1f*(mouseX+mouseY);
				var fx= backgroundradius+( (float)j*(width-backgroundradius)/xcount);
				var fy= backgroundradius+((float)i* (height-backgroundradius)/ycount);
				ellipse(xb,yb, backgroundradius, backgroundradius);
				stroke(0);
				line(fx, fy, xb, yb);
				//line (xb, yb, mouseX, mouseY);
				noStroke();
				fill(255,255 , 255);
				ellipse(fx ,fy, forgrundradius, forgrundradius);
			}
		}




		ellipse(mouseX, mouseY, 20, 20);
	}
}
