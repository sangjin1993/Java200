package chapter.s049;
// 049.제곱근을 이용하여 소수 판별하기 Math 클래스 메서드
public class PrimMath {
	public static boolean isPrime(int n) {
		boolean isS = true;
		for(int i = 2; i < (int)Math.sqrt(n); i++) {
			if(n % i == 0) {
				isS = false;
				break;
			}
		}
		return isS;
	}
	public static void main(String[] args) {
		int number = 1234567;
		boolean ifPrime = isPrime(number);		// 소수인가를 확인한다.
		if(ifPrime) {
			System.out.printf("%d는 1과 자신으로만 나눠떨어지는 소수다.", number);
		} else {
			System.out.printf("%d은 소수가 아니다.", number);
		}
	}
}
/*
 * 소수(Prime)란 1과 자신으로만 나누어 떨어지는 수이다. 다시 말해 1과 자신을 제외한 다른 수로는 나누어 떨어지지 않는다. 여러 소수 계산법 중 반복횟수를
 * 최소화한 방법이 제곱근(에라토스테네스)을 이용하는 것이다. 예를 들어 101이 소수인지 판별하고 싶다면 101의 제곱근인 10을 얻고, 2 ~ 10으로 101을 나누어
 * 떨어지는지 본다. 101은 2 ~ 10사이의 수로 나누어 떨어지지 않기 때문에 소수이다.
 * 
 * line6 n이 2와 3이라면 for문이 실행되지 않고, isS가 true이므로 소수이다. n이 4라면 4의 제곱근 2로 나누어 떨어지기 때문에 소수가 아니다.
 * line7 ~ 9 예를 들어 10을 2로 나누면 나누어 떨어져서 더 나누어 볼 필요가 없으므로 break를 사용해 반복문 for를 끝낸다.
 * line16 1234567이 소수인지 판별한다. 소수면 true가 ifPrime에 저장된다.
 * line17 ifPrime이 true이면 소수라고 출력하고 false이면 소수가 아니라고 출력한다.
 */
