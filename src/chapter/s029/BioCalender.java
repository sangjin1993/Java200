package chapter.s029;
// static 메서드로 신체 지수 구하기

public class BioCalender {
	// 상수, 상수값으로 변경할 수 없다.
	public static final int PHYSICAL = 23;	// 상수(개발자 정의)
	// static 메서드 선언
	public static double getBioRhythm(long days, int index, int max) {
		return max * Math.sin((days % index) * 2 * Math.PI / index);
	}
	public static void main(String[] args) {
		int days = 1200;
		// 메서드 호출
		double phyval = getBioRhythm(days, PHYSICAL, 100);
		System.out.printf("나의 신체 지수 %1$.2f입니다\n", phyval);
	}
}
/*
 * static 메서드는 메서드에 static 예약어가 붙은 메서드로, 객체 생성 없이 호출할 수 있다. "public static 반환 타입
 * 메서드이름(아규먼트) {}" 형태로 사용한다. 
 * 7line 사용자 정의 static 메서드를 선언한다. 반환 타입은 double, 메서드 이름은 getBioRhythm, 아규먼트(인자)는 long타입 days,
 * int 타입 max이다.
 * 8line 신체 지수를 계산하여 반환한다.
 * 13line getBioRhythm() 메서드를 호출한다. 
 */
