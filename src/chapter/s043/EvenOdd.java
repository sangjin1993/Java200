package chapter.s043;
// 043.while을 이용하여 1이 될 때까지 나누고 곱하기 whlie
public class EvenOdd {
	public static void showOddEvenw(int n) {
		int temp = n;
		while(temp != 1) {
			if(temp % 2 == 1) {		// 홀수
				temp = temp * 3 + 1;
			} else {				// 짝수
				temp /= 2;
			}
			System.out.print("[" + temp + "]");
		}
		System.out.println("\n------------------------");
	}
	public static void main(String[] args) {
		showOddEvenw(122);
	}
}
/*
 * "1씩 증가" 처럼 증감값이 명확할 때는 for를, 끝나느 조건이 명확할 때는 whlie을 사용한다.
 * for와 whlie은 동일한 역할을 할 수 있는 반복문이다. 증감이 명확할 때는 for, 끝나는 조건이 명확할 때는 whlie을 사용하는 것이 좋다.
 * while(A)의 조건 구문 A가 ture이면 while 구문({})을 실행하고, false면 while을 끝낸다. 예를 들어 while(temp != 1)은
 * "temp가 1이 아니면 실행하고 1이면 끝낸다"와 "temp가 1이 될 떄까지 반복한다"는 의미가 된다.
 * 
 * line6 입력받은 temp가 1이 될 때까지 while 구문을 반복한다.
 * line7 ~ 8 temp가 홀수이면 3배한 값에 1을 더한다. temp가 9라면 3 * 9 + 1 =28이 된다.
 * line9 ~ 10 temp가 짝수이면 2로 나눈다. temp가 122라면 122 / 2 = 61이 된다.
 * line17 입력받은 정수가 1일 될 떄까지 홀수이면 3배한 값에 1을 더하고, 짝수는 2로 나누는 과정을 반복한다.
 */
