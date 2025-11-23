package New_Start;

import java.util.Arrays;
import java.util.Comparator;

public class Find_Largest_String {

	public static void main(String[] args) {
		// Find the largest word from string array using java8?
		String[] arr = {"Java", "Microservices", "SpringBoot", "Backend"};
		
		String largestString = Arrays.stream(arr).max(Comparator.comparingInt(String :: length)).orElse(null);
		System.out.println(largestString);

	}

}
