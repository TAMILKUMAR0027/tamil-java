package TKSCJC;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rectangle rec=new rectangle(10, 12);
		rec.area();
		rec.perimeter();
		square sq=new square(4);
		sq.area();
		sq.perimeter();
		circle cir=new circle(3);
		cir.area();
		cir.perimeter();
		cir.draw();
	}

}
