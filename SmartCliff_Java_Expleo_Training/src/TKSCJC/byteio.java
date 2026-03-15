package TKSCJC;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class byteio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] b=new char[3];
		try {
			FileReader fr=new FileReader(args[0]);
			FileWriter fw=new FileWriter(args[1]);
			int count=0;
			int read=0;
			while((read=fr.read(b))!=-1) {
				fw.write(b);
			    System.out.println(Arrays.toString(b));
				count+=read;
			}
			System.out.println("Total Count: "+count+" character");
		}catch(FileNotFoundException f) {
			System.out.println("File "+args[0]+"not founmd");
		}catch(IOException e) {
			System.out.println("IOException"+e);
		}
	}

}
