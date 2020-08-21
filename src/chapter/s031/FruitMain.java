package chapter.s031;
// 상수의 묶음
public class FruitMain {
	public static void main(String[] args) {
		FRUIT pear = FRUIT.APPLE;
		FRUIT pear2 = FRUIT.MANGO;
		System.out.println(pear);
		System.out.println(pear.name());
		System.out.println(pear.ordinal());		// 선언될 때 순서 0
		System.out.println(pear2.ordinal());	// 선언될 떄 순서 2
		FRUIT[] fruits = FRUIT.values();
		System.out.println(fruits[0]);
	}
}

/*
 * class 키워드 대신 enum 키워드를 사용한다. enum 상수는 static final을 사용하지 않고 대문자로 선언한다.
 * 선언한 순서(ordinal)대로 0, 1, 2처럼 값이 자동으로 대입된다.
 * int a = 10; 과 같이 FRUIT 타입 pear 변수에 enum 값을 대입한다. pear는 APPLE이 된다. pear2는 MANGO가 된다.
 * 
 * line7 APPLE을 출력한다.
 * line8 name도 APPLE이다.
 * line9 순서(ordinal)대로 APPLE, BANANA, MANGO의 ordinal은 0, 1, 2다.
 * line11 모든 enum 상수를 반환한다.
 */

/*
 * enum을 int로 변환하거나 대입할 수 없다. int a = FRUIT.APPLE; 형식은 예외가 발생한다. 꼭 변환해서 사용하고 싶다면
 * 순서를 나타내는 ordinal()을 이용한다. 메서드가 없는 기본 enum은 연산에 적합하지 않으며, if, switch와 같은 분기문에서 사용한다.
 */
