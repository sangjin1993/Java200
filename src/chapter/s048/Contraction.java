package chapter.s048;
// 048.;while과 단축 연산자를 사용하여 각 자릿수의 합 구하기 축약 연산자
public class Contraction {
	public static int sumEach(int n) {
		int tot = 0;
		while(n != 0) {
			tot += n%10;		// 3 -> 2 -> 1
			n /= 10;			// 123 -> 12 -> 1 -> 0
		}
		return tot;
	}
	public static void main(String[] args) {
		int number = 1234567;
		int value = sumEach(number);
		System.out.printf("%d에 대한 각 자리의 숫자 합: %d" ,number, value);
	}
}
/*
 * n = n / 10을 축약하기 위해서 = 앞에 / 연산자를 옮겨 n /= 10으로 사용한다.
 * + , -, *, /, %와 비트(&, |), 쉬프트 연산자도 대입연산자와 함께 축약할 수 있다.
 * 
 * line6 n이 0이 아니면 반복한다. n이 0이 될 때까지 반복한다.
 * line7 tot = tot + n % 10. n의 일의 자릿수를 구하여 tot에 더한다.
 * line8 n = n / 10. n을 10으로 나누었을 때 몫을 구한다.
 * line6 ~ 9 n = 123을 입력받았다면 일의 자릿수 3을 구하고 n을 10으로 나눠 n = 12가 된다. 다시 일의 자릿수 2를 얻고 n을 10으로
 *           나눠 n = 1이 된다. 다시 일의 자릿수 1을 얻고 n은 0이 되어 while문을 끝낸다.
 * line14 각 자릿수의 합(7 + 6 + 5 + 4 + 3 + 2 + 1)은 28이다. 
 */
