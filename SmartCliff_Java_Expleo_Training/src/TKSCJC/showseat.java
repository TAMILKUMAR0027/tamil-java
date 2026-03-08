package TKSCJC;
import java.util.*;
public class showseat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int max=5,count=0;
		do {
			System.out.println("Current seat availability : "+(max-count));
			count++;
		}while(count<max);
		System.out.println("seats are filled");
	}

}
