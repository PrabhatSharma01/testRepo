package dcaProblems;

import java.util.Scanner;

public class NSEW {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		s.close();
		
		int n = 0, so = 0, e = 0, w=0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == 'N') {
				n++; 
			}else if(str.charAt(i) == 'S') {
				so++; 
			}else if(str.charAt(i) == 'E') {
				e++;
			}else {
				w++;
			}
		}
		
		if(n == so && e == w) {
			System.out.println("returned successfully");
		}else {
			System.out.println("Not returned successfully");
		}
	}

}
