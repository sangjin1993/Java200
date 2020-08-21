package chapter.s045;
// 045.for를 이용하여 1이 될 때까지 나누고 곱하기 while로 사용하는 for
public class EvenOdd {
	public static void showOddnEvenf(int n) {
		int temp = n;
		for( ; temp != 1; ) {
			if(temp % 2 ==1) {		// 홀수
				temp = temp * 3 + 1;
			} else {				// 짝수
				temp /= 2;
			}
			System.out.print("[" + temp + "]");
		}
		System.out.println("\n-----------------------------");
	}
	public static void main(String[] args) {
		showOddnEvenf(122);
	}
}
/*
 * for는 for(초기값; 조건; 스텝){ 바디 }로 구성된다. 이때 초기값, 조건, 스탭을 모두 제거하고 for( ; ; ;){}로 사용할 수 있다.
 * 조건을 명시하지 않으면 for( ; true; ;){}가 되어 while(true)이 된다.
 * 
 * line6 초기값, 스텝이 없다면 while(조건)과 동일하다. while(temp != 1){}과 같으므로,
 *       1이 될 때까지 홀수면 3배한 값에 1을 더하고 짝수는 2로 나누는과정을 반복한다.
 * line7 ~ 8 temp가 홀수이면 3배한 값에 1을 더한다. temp가 9라면 3 * 9 + 1 = 28이 된다.
 * line17 입력받은 정수가 1이 될 때까지 홀수이면 3배한 값에 1을 더하고 짝수는 2로 나누는 과정을 반복한다.
 */