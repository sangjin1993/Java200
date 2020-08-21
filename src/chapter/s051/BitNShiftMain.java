package chapter.s051;
// 051.&(비트)연산자를 이용하여 2진수 문자열로 바꾸기 &연산자
public class BitNShiftMain {
	public static int BITMASK = 1;
	// 10진수를 2진수 문자열(스트링)로 변환
	public static String shifts(int a) {
		int BITMASK = 1;
		String s = "";
		for(int i = 0; i <= 31; i++) {
			s = (a & BITMASK) + s;
			a >>= 1;		// a /= 2;
		}
		return s;
	}
	public static void main(String[] args) {
		int intNums1 = 123;
		int intNums2 = -123;
		System.out.printf("%d : %s%n", intNums1, shifts(intNums1));
		System.out.printf("%d : %s%n", intNums2, shifts(intNums2));
	}
}
/*
 * 비트 연산자는 부호에 관계 없이 양수가 된다. &(비트) 연산자는 1 & 1일 때만 1 이고, | 연산자는 0 | 0일 때만 0이다. ^는 1과 0 또는 0과 1일 떄만 1이다.
 * 
 * line7 2에 비트마스크를 1로 설정한다.
 * line10 1과 &연산을 하면 0또는 1만 얻는다.
 * line11 a = a >> 1은 축약이다. a = a / 2와 동일하며 2로 나눈 몫을 구한다. a가 9라면 aa == 9 & 1 = 1, s = 1 +""로 s = "1"이고,
 *        같은 원리로 2진수를 구할 수 있다.
 * line17 음수에 대한 2진수 문자열을 구한다.
 */
