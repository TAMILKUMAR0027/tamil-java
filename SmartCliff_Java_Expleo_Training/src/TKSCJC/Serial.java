package TKSCJC;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employe object=new Employe(1,"Tamil");
		String filename="file.ser";
		try {
			FileOutputStream file=new FileOutputStream(filename);
			ObjectOutputStream out=new ObjectOutputStream(file);
			out.writeObject(object);
			out.close();
			file.close();
			System.out.println("Object has been serialized");
		}catch (IOException e) {
			System.out.println("IOException is caught");
		}
		Employe object1=null;
		try {
			FileInputStream file=new FileInputStream(filename);
			ObjectInputStream in=new ObjectInputStream(file);
			object1=(Employe)in.readObject();
			in.close();
			file.close();
			System.out.println("object is Deserialized");
			System.out.println("Employee ID : "+object1.id+" Name : "+object1.name);
		}catch (IOException e) {
			System.out.println("Is caught");
		}catch(ClassNotFoundException ex) {
			System.out.println("Classnot found");
		}
	}

}
