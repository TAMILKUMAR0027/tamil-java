package TKSCJC;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class byteIoStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] b=new byte[128];
		try {
			FileInputStream fs=new FileInputStream("C:\\Users\\tamil\\git\\repository7\\SmartCliff_Java_Expleo_Training\\src\\input.txt.txt");
			FileOutputStream fos=new FileOutputStream("C:\\Users\\tamil\\git\\repository7\\SmartCliff_Java_Expleo_Training\\src\\Output.txt");
			System.out.println("Bytes available : "+fs.available());
			int count =0;
			int read=0;
			while((read=fs.read(b))!=-1) {
				fos.write(b);
				count+=read;
				
			}
			System.out.println("Total count : "+count);
		}catch (FileNotFoundException f) {
			System.out.println("File not found : "+f);
		}catch (IOException e) {
			System.out.println("IOException : "+e);
		}
	}

}
