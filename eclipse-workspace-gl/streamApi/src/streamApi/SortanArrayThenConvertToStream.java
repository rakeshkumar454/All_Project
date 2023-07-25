package streamApi;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SortanArrayThenConvertToStream {
	public static void main(String[] args) {
//		int arr[]= {23,56,65,74,233,12,2,45};
//		Arrays.parallelSort(arr);// Sorted the Array using parallelSort()
//		
//		Arrays.stream(arr).forEach(n-> System.out.print(n+ " ")); /* Converted it into Stream and then
////        printed using forEach */
//		 int[] numbers = {1, 2, 3, 4, 5};
//
//	        int[] reversedNumbers = IntStream.rangeClosed(1, numbers.length)
//	                .map(i -> numbers[numbers.length - i])
//	                .toArray();
//
//	        System.out.println("Original array: " + Arrays.toString(numbers));
//	        System.out.println("Reversed array: " + Arrays.toString(reversedNumbers));
	        
	        
	        
	        String[] fruits = {"a","a","b","c","b","e","b","A","B"};

	        // Get distinct elements
	        String[] distinctElements = Arrays.stream(fruits).distinct().toArray(String[]::new);

	        System.out.println("Distinct elements: " + Arrays.toString(distinctElements));

	        // Count occurrences of elements
	        Map<String, Long> elementCount = Arrays.stream(fruits)
	                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));

	        System.out.println("Element count: " + elementCount);
	    
	

	    
	}
}
