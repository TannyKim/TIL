package 두번째날;

public class 조건문 {

	public static void main(String[] args) {
		int age = 12;

		if (age >= 19) {
			System.out.println("성년입니다.");
		}else if(age >= 12){
			System.out.println("청소년입니다.");
		}else {
			System.out.println("미성년입니다.");
		}

		System.out.println("프로그램의 끝");
	}

}
