package dcaProblems;

import java.util.Scanner;

public class UNOnum {
	
	static int sum(int num) {
		int sum = 0;
		while(num > 0 || sum > 9) {
			if(num == 0) {
				num = sum;
				sum = 0;
			}
			sum += num % 10;
			num /= 10; ;
		}
		return sum;
	}
	
	static int Sum(int n) {
		if(n == 0) return 0;
		return (n % 9 == 0) ? 9 : (n % 9);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		s.close();
		
		int digitSum = sum(num);
		if(digitSum == 1) {
			System.out.println("UNO");
		}else {
			System.out.println("NOT UNO");
		}
		
		int numSum = Sum(num);
		if(numSum == 1) {
			System.out.println("UNO");
		}else {
			System.out.println("NOT UNO");
		}
	}

}
