package chapter.s046;
// 046.while을 이용하여 서로 다른 세 정수 만들기 break
public class BioRandom {
	public static void main(String[] args) {
		int range = 10;
		int start = 1;
		int a = 0, b = 0, c = 0;
		while(true) {
			a = (int)(range * Math.random() + start);
			b = (int)(range * Math.random() + start);
			c = (int)(range * Math.random() + start);
			if(a != b && b != c && c != a) break;
		}
		System.out.printf("%d\t%d\t%d", a, b, c);
	}
}
/*
 * 서로 다른 정수가 될 떄까지 반복해서 정수를 만들려면 while을 사용하는 것이 좋다. (int)(10 * Math.random() + 1)은 1과 10사이 임의의 정수를 반환한다.
 * 
 * line8 while(true) 구문은 무한반복(무한 루프)이므로 반드시 끝내는 조건문을 갖춰야 한다.
 * line9 ~ 12 1 ~ 10 사이 임의의 정수를 만든다. 실행할 때마다 다른 숫자가 나온다. 세 수가 서로 다르기 위해 && 논리 연산자를 사용한다.
 * 			  세 수가 모두 다르면 while을 끝낸다.
 */