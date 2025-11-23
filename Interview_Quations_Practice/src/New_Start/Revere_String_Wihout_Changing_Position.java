package New_Start;

public class Revere_String_Wihout_Changing_Position {

	public static void main(String[] args) {
		
		String string = "tushar makude";
		String[] str = string.split(" ");
		
		for(int i = 0 ; i < str.length ; i++) {
			String reverseString = reverseString(str[i]);
			str[i] = reverseString;
			System.out.print(str[i]+ " ");
			
		}
		
		// Or Another Way 
		
	
		StringBuilder sb = new StringBuilder();
		
		for(String s : string.split(" ")) {
			sb.append(new StringBuilder(s).reverse()).append(" ");
		}
		
		System.out.println(sb.toString().trim());
		
		

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
