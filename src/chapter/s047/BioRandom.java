package chapter.s047;
// 047.while과 조건을 이용하여 서로 다른 세 정수 만들기 random
public class BioRandom {
	public static void main(String[] args) {
		int range = 10;
		int start = 1;
		int a = 0, b = 0, c = 0;
		while(a == b || b == c || c == a) {
			a = (int)(range * Math.random() + start);
			b = (int)(range * Math.random() + start);
			c = (int)(range * Math.random() + start);
		}
		System.out.printf("%d\t%d\t%d", a, b, c);
	}
}
/*
 * !(not)은 ture를 false로, false를 ture로 만든다. 또한 논리 연산자가 있다면 논리 연산자도 반대로 만든다.
 * !(A && B)는 (!A || !B)와 동일하다. !(A || B)는 (!A && !B)와 동일하다.
 * 
 * line8 "서로 다른 수가 될 떄까지 반복한다."는 "서로 다른 세 수가 되면 끝난다.", "서로 다른 세수가 되지 않으면 반복한다." 등이 될 수 있다.
 * 이는 while(!(a! = b && b! = c && c!=a){}와 같고 while(a == b || b == c || c == a){}와 동일하다.
 */
