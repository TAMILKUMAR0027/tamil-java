package TKSCJC;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class bufferedStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader bufinp=new BufferedReader(new FileReader(args[0]));
			BufferedWriter op=new BufferedWriter(new FileWriter(args[1]));
			String line="";
			while((line=bufinp.readLine())!=null) {
				op.write(line);Nc
				op.newLine();
			}
			
			bufinp.close();
			op.close();
		}catch (FileNotFoundException f) {
			System.out.println("File not found"+f);
		}catch(IOException e) {
			System.out.println("Execption "+e);
		}
	}

}
