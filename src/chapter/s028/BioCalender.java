package chapter.s028;
// 028. Math 클래스를 사용하여 신체 지수 구하기
public class BioCalender {
	// 상수, 상수값은 변경할 수 없다.
	public static final int PHYSICAL = 23;	//상수(개발자 정의)
	public static void main(String[] args) {
		int index = PHYSICAL;
		int days = 1200;
		double phyval = 100 * Math.sin((days % index) * 2 * Math.PI / index);
		System.out.printf("나의 신체 지수 %1$.2f입니다.\n", phyval);
	}
}


/*
 * Math 클래스는 java.util 패키지에 있고, 이 클래스의 메서드는 대부분 static으로 객체 생성 없이 Math.메서스() 형식으로 사용한다.
 * 대표적인 상수로 Math.PI(파이, 3.14), Math.E(자연지수, 2.718)가 있다.
 * 삼각함수 sin(), 각도 변환 toDegrees(), 0과 1사이 임의의 값 random() 이외에도 많은 수학함수가 있다.
 * sin(4 × 2 × 𝝅 / 23)은 sin(1.092)로 0.8879이다. 100 × 0.8879는 88.79로 신체 지수가 된다.
 */
