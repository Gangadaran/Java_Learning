package Learn_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Learn_Comparator {
	public static void main(String[] args) {
		
//				List<Student> list = new ArrayList<>();
//		list.add(new Student(43,"Ganga"));
//		list.add(new Student(53,"Anu"));
//		list.add(new Student(543,"Nithi"));
//		list.add(new Student(54247,"Bharath")); 
//		
//		
//		Collections.sort(list);
//		
//		System.out.println(list);
		
		
		
		
		
		
		
		//		List<Student> list = new ArrayList<>();
//		list.add(new Student(43,"Ganga"));
//		list.add(new Student(53,"Anu"));
//		list.add(new Student(543,"Nithi"));
//		list.add(new Student(54247,"Bharath"));
//		
//		
//		 Comparator<Student> com = new Comparator<Student>() {
//
//			@Override
//			public int compare(Student i, Student j) {
//				if (i.age > j.age) {
//					return 1;
//				}else {
//					return -1;
//				}
//			}
//			 
//		 };
//		 
//		 Collections.sort(list,com);
//		 System.out.println(list);
		
		

//		 Map<Integer,String> map = new HashMap<>();
//	     map.put(43, "Ganga Daran");
//	     map.put(45, "Anu Mohan");
//	     map.put(44, "Bharath Banner");
//	     map.put(443, "Jaya Raman");
	     
//	     
//	     Comparator<Map.Entry<Integer, String>> com = (entry1,entry2) -> {
//	    	 return entry1.getKey().compareTo(entry2.getKey());
//	     };
//		
//	    
//		
//		List<Map.Entry<Integer, String>> list = new ArrayList<>(map.entrySet());
//		
//		Collections.sort(list,com);
//		
//		System.out.println(list);
	     
	     
//	     Map<Integer,String> map = new HashMap<>();
//	     map.put(43, "Ganga Daran");
//	     map.put(45, "Anu Mohan");
//	     map.put(44, "Bharath Banner");
//	     map.put(443, "Jaya Raman");
//	     
//	     
//	     ArrayList<Entry<Integer, String>> list = new ArrayList<>(map.entrySet());
//		
//		
//		
//	Comparator<Map.Entry<Integer, String>> com = (entry1, entry2) -> entry1.getKey().compareTo(entry2.getKey()); 
//			
//			
//     Collections.sort(list,com);
//     
//     System.out.println(list);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//		 Map<Integer,String> map = new HashMap<>();
//	     map.put(43, "Ganga Daran");
//	     map.put(45, "Anu Mohan");
//	     map.put(44, "Bharath Banner");
//	     map.put(443, "Jaya Raman");
//	     
//	     
//	     Comparator<Map.Entry<Integer,String>> com  = (entry1,entry2) -> {
//	    	 return entry1.getValue().compareTo(entry2.getValue());
//	    	 
//	    	 
//	    	 
//	     };
//	     
//	     List<Map.Entry<Integer,String>> list = new ArrayList<>(map.entrySet());
//	     
//	     Collections.sort(list,com);
//	     
//	     System.out.println(list);
	     
	     
	     
		
     Map<Integer,String> map = new HashMap<>();
     map.put(43, "Ganga Daran");
     map.put(45, "Anu Mohan");
     map.put(44, "Bharath Banner");
     map.put(443, "Jaya Raman");
     
     Comparator<Map.Entry<Integer,String>> com = (entry1,entry2) -> {
		  String lastName1 = getLastWord(entry1.getValue());
		  String lastName2 = getLastWord(entry2.getValue());
		  
		  return lastName1.compareTo(lastName2);
	
    	 
     };
     
     
     List<Map.Entry<Integer,String>> entryList= new ArrayList<>(map.entrySet());
     
     Collections.sort(entryList,com);
     
     System.out.println(entryList);
     
     
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//		List<String> list = new ArrayList<>();
//		list.add("Gangadaran");
//		list.add("Anu");
//		list.add("Radhakrishnan");
//		list.add("Sarangam");
//		
//		Comparator<String> com = new Comparator <String>() {
//
//			@Override
//			public int compare(String i, String j) {
//				if (i.length() > j.length()) {
//					return 1;
//				}else {
//					return -1;
//				}
//			}
//			
//		};
//		
//		
//		Collections.sort(list,com);
//		System.out.println(list);
		
	}
	
	
	private static String getLastWord(String fullName) {
		String[] words = fullName.split(" ");
		
		return words[words.length-1];
	}

}
