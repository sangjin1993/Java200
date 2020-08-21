package chapter.s050;
// 050.shift 연산자를 이용하여 2진수 문자열로 바꾸기 >> shift ? 삼항연산
public class BitNShiftMain {
	// 10진수 정수를 2진수 문자열(스트링)로 변환
	public static String shifts(int a) {
		String s = "";
		for(int i = 0; i < 31; i++) {
			int aa = a % 2;
			s = (aa >= 0) ? aa + s : (-aa) + s;
			a >>= 1;		// a /= 2;
		}
		return s;
	}
	public static void main(String[] args) {
		int intNums1 = 123;
		int intNums2 = -123;
		System.out.printf("%d, %s%n", intNums1, shifts(intNums1));
		System.out.printf("%d, %s%n", intNums2, shifts(intNums2));
	}
}
/*
 * 10을 2로 나무면 나머지 0, 몫 5를 얻는다("0"). 5를 2로 나누면 나머지 1, 몫을 2를 얻는다("10"). 2를 2로 나누면 나머지 0, 몫을 1을 얻는다("010").
 * 1을 2로 나누면 나머지 1, 몫 0을 얻고 반복을 끝낸다("1010"). 그리고 면저 얻은 나머지를 오른쪽에서, 나중에 얻은 나머지를 왼쪽에 붙이면 2진수가 된다("1010").
 * 
 * line9 양수를 만들기 위해서 음수이면 -1을 곱해 양수를 만든다. 삼항연산자를 사용한다.
 * line10 a = a >> 1은 축약형이다. a = a / 2와 동일하며 2로 나눈 몫을 구한다. a 가 9라면 aa = 9 % 2 = 1, aa가 양수이므로 1 + ""로 s = "1"이고,
 *        a는 a = 9 / 2 = 4가 된다. 같은 방법으로 a가 4, aa = 4 % 2 = 0, aa가 양수 s = 0 + "1" = "01"이 된다.
 * line16 음수에 대한 2진수 문자열을 구한다.
 */
