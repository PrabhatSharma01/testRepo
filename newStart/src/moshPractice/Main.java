package moshPractice;

public class Main {

	public static void main(String[] args) {
		Array a = new Array(5);
		a.insert(10);
		a.insert(20);
		a.insert(30);
		a.insert(40);
		a.insert(50);
		a.insert(60);
		
		a.removeAt(2);
		
		System.out.println(a.indexOf(40));
		
		a.print();
	}

}
