package learn_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Learn_Stream {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,483,48384,3493,49304,1,94,434,100,100,100);
		
       
		list.forEach(n -> {
			int count =0;
        	if (n < 100) {
			 count++;	
			}
        	
        	
        });
		
		
		
		
		
		
		
		
		//      Stream<Integer> sorted = nums.stream()
//      .sorted();
//      
//     
//      sorted.forEach(n -> System.out.println(n));
		
		
		
		
//      Collections.sort(nums);
//      
//      System.out.println(nums);
		
//		     Integer reduce = nums.stream()
//     .filter(n -> n%2==0)
//     .map(n -> n*2)
//     .reduce(0,(c,e) -> c+e); 
//     
//     
//     System.out.println(reduce);
		
		
		
		
		
		
		//		Stream<Integer> s1 = nums.stream();
//		
//		Stream<Integer> s2 = s1.filter(n -> n%2==0);
//		
//		Stream<Integer> s3 = s2.map(n -> n*2);
//		
//		s3.forEach(n -> System.out.println(n));
		
//		Predicate<Integer> pre = new Predicate<Integer>() {
//		
//		@Override
//		public boolean test(Integer n) {
//			
//			return n%2==0;
//		}
//	};
		
		
//		s1.forEach(n -> System.out.println(n));

		
		
	}
	
	

}
