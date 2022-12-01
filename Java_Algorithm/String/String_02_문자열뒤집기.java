import java.util.Arrays;

public class String_02_문자열뒤집기 {
	public static void main(String[] args) {

		String text = "더이상파이썬을언급하지않겠습니다";

		// 문자열 뒤집기.
		// 1. 자기문자열의 자리를 바꾸기
		// 2. 새로운 빈문자열을 만들어 뒤에서 부터 읽기
		// 3. StringBuffer / StringBulider 를 이용하여 reverse 메서드 사용하기

		// 1. 자기 문자열의 자리를 바꾸기
		// 문자열을 immutable 하다.불변성을 가지고 이썽요.
		char[] arr = text.toCharArray();

		int len = text.length();
		for (int i = 0; i < len / 2; i++) {
			char temp = arr[i];
			arr[i] = arr[len - 1 - i];
			arr[len - 1 - i] = temp;
		}
		System.out.println(Arrays.toString(arr));
		
		// 2. 새로운 빈문자열을 만들어 뒤에서 부터 읽기
		for(int i = text.length() - 1; i>=0 ; i-- ) {
			System.out.print(text.charAt(i));
		}
		System.out.println();
		
		// 3. StringBulider 를 이용한다.
		StringBuilder sb = new StringBuilder();
		sb.append(text).reverse();
		System.out.println(sb.toString());
		
		
		
		
		
		
	}// main
}