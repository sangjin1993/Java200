package chapter.s044;
// 044.do~while을 이용하여 1이 될 떄까지 나누고 곱하기
public class showOddnEven {
	public static void showOddnEven(int n) {
		int temp = n;
		do {
			if(temp % 2 == 1) {
				temp = temp * 3 + 1;	// 홀수
			} else {					// 짝
				temp /= 2;
			}
			System.out.print("[" + temp + "]");
		} while(temp != 1);
		System.out.println("\n--------------------------------");
	}
	public static void main(String[] args) {
		showOddnEven(1);
	}
}
/*
 * while은 조건이 명확할 떄 사용한다. while은 조건절이 먼저 실행되기 떄문에 한번도 실행되지 않을 수도 있다. do~while은 먼저 실행된 다음 조건절이
 * 실행되기 때문에 적어도 한 번은 실행된다. 입력받은 정수가 1일 때 while은 바로 끝나지만, do while은 4, 2, 1을 출력한다.
 * 
 * line6 temp가 홀수, 짝수에 대한 각 연산을 먼저 실행한다.
 * line7 ~ 8 temp가 홀수이면 3배한 값에 1을 더한다. temp가 9라면 3 * 9 + 1 =28이 된다.
 * line17 입력받은 정수가 1이 될 때까지 홀수면 3배한 값에 1을 더하고, 짝수는 2로 나누는 과정을 반복한다. 결과는 예제 043과 동일하다.
 */
