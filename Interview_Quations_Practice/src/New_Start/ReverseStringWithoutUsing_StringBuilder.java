package New_Start;

public class ReverseStringWithoutUsing_StringBuilder {

	public static void main(String[] args) {
		// Reverse a string without using StringBuilder / StringBuffer
		
		String str = "tushar";
		String reverseString = reverseString(str);
		System.out.println("The ReverseString : "+ reverseString);

	}

	private static String reverseString(String str) {
		char[] ch = str.toCharArray();
		
		int left=0;
		int right= ch.length -1;
		while(left < right) {
			
			char temp = ch[left];
			ch[left] = ch[right];
			ch[right] = temp;
			left++;
			right--;
			
		}
		return new String(ch);
		
	}

}
