package learn_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Learn_Stream {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(4,3,64,2,46,53);
		
    Stream<Integer> s1 =  list.stream();
  
    
    Stream<Integer> s2 =s1.filter(n -> n%2==0);
    
  Stream<Integer> s3 = s2.map(n->n*2);
		
		
		s3.forEach(n->System.out.println(n));
		
		
		
		//		list.forEach(n -> System.out.println(n));
		
		
	}
	
	

}
