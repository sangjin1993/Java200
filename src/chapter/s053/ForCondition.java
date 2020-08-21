package chapter.s053;
// 053. for와 if를 이용하여 홀수의 합 구하기 s = s + a
public class ForCondition {
	public static void main(String[] args) {
		int s = 0;
		for(int i = 1; i <= 100; i++) {
			s += i;
		}
		System.out.println("1 ~ 100의 합 : " + s);
		s = 0;		// 0으로 초기화
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 1) {
				s += i;
			}
		}
		System.out.println("1 ~ 100 사이의 홀수의 합 : " + s);
	}
}
/* 
 * 증가 스탭이 명확할 때는 for문을 사용한다. for문 안에서 홀수인지 판별해서 홀수일 때만 더할 수도 있지만, 1에서 시작하여 스탭을 2씩 증가시키면 1, 3, 5, ...
 * 처럼 홀수가 되므로 조건문을 제거할 수도 있다.
 * 
 * line7 s = s + i를 축약했다. 1부터 100까지의 모든 정수의 합을 구한다.
 * line10 다시 초기화할 때는 타입을 쓰지 않는다.
 * line11 ~ 15 1부터 100까지 홀수들의 합을 구한다.
 */
