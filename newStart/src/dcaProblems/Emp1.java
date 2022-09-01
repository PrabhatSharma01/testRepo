package dcaProblems;

import java.util.Arrays;
import java.util.List;

public class Emp1 {
	
	public static void main(String args[]) { 
		List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13);
		
		int primeGreaterThanFive = primes.stream() 
				.peek(num -> System.out.println("will filter " + num)) 
				.filter(x -> x > 5) .findFirst() .get();
		
		System.out.println(primeGreaterThanFive); 
	}

}
