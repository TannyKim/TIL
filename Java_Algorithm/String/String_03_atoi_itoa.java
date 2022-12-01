public class String_03_atoi_itoa {
	public static void main(String[] args) {
//		System.out.println(atoi("1234"));
//		System.out.println("1234");
//		System.out.println(itoa(1234));
		
		int num = Integer.parseInt("   1234     ".trim());
		
		String.valueOf(1234);
		
		System.out.println(num);
		
		
		
	}// main

	// 숫자로만 이루어진 문자열이 들어온다. 라고 가정.

	public static int atoi(String text) {
		int value = 0;
		// 앞에서 부터 값을 하나씩 읽어와서 숫자로 바꾸고
		// 현재 가지고 있는 수의 자릿수를 바꾸기 위해 * 10한 뒤 더한다.
		int digit;
		for (int i = 0; i < text.length(); i++) {
			char num = text.charAt(i); //
			if (num >= '0' && num <= '9') {
				// -48을 해도 괜찮아~~
				digit = num - '0';
			} else {
				// 아니라면 여기안에서 숫자가 아닌 문자가 섞였다. 라던지.. 등등의 작업을 처리할 수 있을것 같음.
				break;
			}
			value = (value * 10) + digit;
		}
		return value;
	}

	// 숫자를 받아 문자열로 바꾸는 메서드
	public static String itoa(int value) {
		StringBuilder sb = new StringBuilder();
		// 음수일 떄는 어떻게 해야하나???
		// 조건문을 이용해서 boolean 같은 변수에 저장을 해놓고 고려를 해야겠다.

		// 정수값을 어떻게 처리를 해서 sb 추가하여 결과를 뽑아내보자.....
		// 마숙

		return sb.toString();
	}

}