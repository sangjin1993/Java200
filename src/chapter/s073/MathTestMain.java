package chapter.s073;
// 073.수학 관련 메서드 사용하기
public class MathTestMain {
	public static void main(String[] args) {
		// constant(상수)
		System.out.println("Math.E : " + Math.E);
		System.out.println("Math.PI : " + Math.PI);
		// method
		System.out.println("Math.abs(-5) 절대값 : " + Math.abs(-5));
		System.out.println("Math.ceil(4.34) 올림 : " + Math.ceil(4.34));
		System.out.println("Math.round(4.34) 반올림 : " + Math.round(4.34));
		System.out.println("Math.floor(4.34) 버림 : " + Math.floor(4.34));
		System.out.println("Math.rint(4.54) 반올림 : " + Math.rint(4.54));
		System.out.println("Math.max(45, 78) : " + Math.max(45, 78));
		System.out.println("Math.min(45, 78) : " + Math.min(45, 78));
		System.out.println("Math.pow(2, 4) : " + Math.pow(2, 4));
		System.out.println("Math.log(30) : " + Math.log(30));
		System.out.println("Math.exp(3) : " + Math.exp(3));
		System.out.println("Math.sqrt(10) : " + Math.sqrt(10));
		// Random
		double dRan = Math.random();		// 0 <= dRan < 1 실수
		System.out.println("Math.random() =>" + dRan);
	}
}
/*
 * Math클래스는 수학 연산에 관련된 메서드를 제공한다. java.lan 패키지에서 Math 클래스의 메서드는 모두 static 메서드이다. static메서드는
 * 객체 생성 없이 "클래스 이름.메서드()" 형태로 사용한다.
 */
