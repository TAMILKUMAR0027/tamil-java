package TKSCJC;
import java.util.*;
public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]jagged={{1,2,3,4},{5,6},{7,8,9},{10}};
		System.out.println("JAgged Array");
		for(int i=0;i<jagged.length;i++) {
			for(int j=0;j<jagged[i].length;j++) {
				System.out.print(jagged[i][j]+" ");
			}
			System.out.println();  
		}
	}

}
