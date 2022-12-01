import java.util.Arrays;

public class String_01_문자열생성 {
	public static void main(String[] args) {

		String str1 = "abc";
		String str2 = new String("abc");
		String str3 = "abc";
		String str4 = str3;
		
		System.out.println("== 비교");
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str1 == str4);
		
		
		System.out.println("equals 비교");
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		
		char c = str1.charAt(0);
		System.out.println(Arrays.toString(str1.toCharArray()));
		
		
		System.out.println((int)'A');
		
		//문자 숫자를 실제 정수 숫자처럼 사용을 하려면
		System.out.println('9' - '0');

	}
}