package New_Start;

import java.util.Arrays;
import java.util.Comparator;

public class Find_LaregestString {

	public static void main(String[] args) {
		// TFind the largest word from string using java8?
		
		String sentence = "Java SpringBoot Microservices Backend Developer";
		String LargestString = Arrays.stream(sentence.split(" ")).max(Comparator.comparingInt(String :: length)).orElse(" ");
		System.out.println("The Largest String is : "+LargestString);

	}

}
