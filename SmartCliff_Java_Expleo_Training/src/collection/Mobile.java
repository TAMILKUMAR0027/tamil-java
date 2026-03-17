package collection;
import java.util.*;
public class Mobile implements Comparable<Mobile> {
	String name;
	int ram;
	int price;
	public Mobile(String name, int ram, int price) {
		this.name = name;
		this.ram = ram;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public int compareTo(Mobile o) {
		// TODO Auto-generated method stub
		if(this.ram<o.getRam())
			return 1;
		else
			return -1;
	}
	public static void main(String[] args) {
		List<Mobile>ml=new ArrayList<Mobile>();
		ml.add(new Mobile("Redmi",16,800));
		ml.add(new Mobile("Apple",8,100));
		ml.add(new Mobile("Samsung",4,600));
		Collections.sort(ml);
		System.out.println("Mobiles after sorting");
		System.out.println("Name "+"\t"+"Ram"+"\t"+"Price");
		for(Mobile m:ml) {
			System.out.println(m.getName()+"\t"+m.getRam()+"\t"+m.getPrice());
		}
	}
	
}
