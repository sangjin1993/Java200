package chapter.s042;
// 042.정수-실수 변환으로 섭씨를 화씨로 바꾸기 반복문
public class Temperature {
	public static void main(String[] args) {
		for(int i = 0; i < 101; i++) {
			double fahrenheit = 9.0 / 5 * i + 32;	// for 블록 변수
			System.out.printf("섭씨 %d도 = 화씨 %.2f도 \n", i, fahrenheit);
		}
	}
}
/*
 * line5 ~ 8 초기값은 0이고, 101보다 작은 정수까지(조건) i를 1씩 증가시킨다.
 * line6 섭씨를 화씨로 환산한다.
 * line7 섭씨 0도부터 100도까지 화씨로 환산하여 소수점 둘째 자리까지 출력한다.
 * 
 * note
 * 정수 연산의 결과는 정수이다. 실수로 바꾸러면 1.0을 곱하거나 숫자 하나를 실수로 바꾼다.
 * 5 / 9 = 0이다. 정수를 실수로 바꿀 때 5.0 / 9처럼 가장 왼쪽의 수를 실수로 바꿔주는 것이 좋다.
 */
