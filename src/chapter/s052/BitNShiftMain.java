package chapter.s052;
// 052.문자열 자르기를 이용하여 2진수 문자열로 바꾸기 String method
public class BitNShiftMain {
	public static int BITMASK = 1;
	// 10진법수를 2진수 스트링으로 변환
	public static String shifts(int a) {
		int BITMASK = 1;
		String s = "";
		for(int i = 0; i <= 31; i++) {
			s = (a & BITMASK) + s;
			a >>= 1;			// a /= 2;
		}
		return s.substring(s.indexOf('1'));
	}
	public static void main(String[] args) {
		int intNums1 = 123;
		int intNums2 = -123;
		System.out.printf("%d : %s%n", intNums1, shifts(intNums1));
		System.out.printf("%d : %s%n", intNums2, shifts(intNums2));
	}
}
/*
 * "0000000000000000000000000001001"과 같은 양의 정수를 2진수로 만들면 0이 남게 된다. 이 0을 제거하려면 오른쪽 첫 번째 1을 찾고, 그 1앞에
 * 있는 0을 모두 제거하면 "1001"을 얻는다.
 * 
 * line13 indexOf('1')은 28이다. substring(28)은 0부터 27번째까지의 0을 제거하고 28번쨰 이후인 "1001"을 반환한다.
 */
