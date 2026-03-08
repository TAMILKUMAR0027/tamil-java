package TKSCJC;

class person {
	int age = 21;
	static int weight = 45;

	static class gender {
		void nonStaticDisplay() {
			System.out.println("In non static display method");
			System.out.println("Weight value : " + weight);
		}

		static void staticDisplay() {
			System.out.println("In static display method");
			System.out.println("Weight value : " + weight);
		}
	}

	gender g = new gender();
}

public class Mainclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person p=new person();
		p.g.nonStaticDisplay();
		person.gender.staticDisplay();
	}

}
