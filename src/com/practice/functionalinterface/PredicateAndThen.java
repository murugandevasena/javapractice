package com.practice.functionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class PredicateAndThen {
	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(1);
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(2);
		list2.add(2);
		list2.add(1);
		//list2.add(3);
		
		BiConsumer<List<Integer>, List<Integer>> equals = (l1,l2)->{
			if(list1.size()!=list2.size()) {
				System.out.println("false");
			}
			else {
				for(int i=0;i<list1.size();i++) {
					if(list1.get(i)!=list2.get(i)){
						System.out.println("fasle");
						return;
					}	
				}
				System.out.println("true");
			}
			
		};
		
		
		BiConsumer<List<Integer>, List<Integer> > disp = (l1, l2) ->
        {
            list1.stream().forEach(a -> System.out.print(a + " "));
            System.out.println();
            list2.stream().forEach(a -> System.out.print(a + " "));
            System.out.println();
        };
        
        BiConsumer<List<Integer>, List<Integer> > multi = (l1, l2) ->
        {
            list1.stream().forEach(a -> System.out.print(a*2 + " "));
            System.out.println();
            list2.stream().forEach(a -> System.out.print(a*3 + " "));
            System.out.println();
        };
        
        
        
        
//        BiFunction<List<Integer>,List<Integer>,List<Integer>> fn = (l1,l2)->{ 
//        	
//        	for(int j=0;j< list1.size();j++) {
//        		l1.set(j, 1);
//        		l2.set(j, 2);
//        	}
//			return l1;
//        	
//        };
        	
    
        //andThen method execute left side method first and the proceed with right side.
        equals.andThen(disp).accept(list1, list2);
        disp.andThen(equals).andThen(multi).accept(list1, list2);
       // fn.apply(list1, list2);

//		BiPredicate<List<Integer>, List<Integer>> equals = (l1,l2)->{
//			if(l1.size()!=list2.size()) {
//				return false;
//			}
//			else {
//				for(int i=0;i< list1.size();i++) {
//					if(list1.get(i)!=list2.get(i)) {
//						return false;
//					}	
//				}
//				return true;
//			}
//			
//		};
//		System.out.println(equals.test(list1, list2));
	}

}
