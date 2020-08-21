package chapter.s030;
// 030. 멤버 메서드를 이용하여 신체 지수 구하기
public class BioCalender {
	// 상수, 상수값은 변경할 수 없다.
	public static final int PHYSICAL = 23;	// static 변수 생성 없이 사용
	// 멤버 메서드(non static)선언
	public double getBioRhythm(long days, int index, int max) {
		return max * Math.sin((days % index) * 2 * Math.PI / index);
	}
	public static void main(String[] args) {
		int days = 1200;
		BioCalender bio = new BioCalender();	//객체를 생성
		double phyval = bio.getBioRhythm(days, PHYSICAL, 100);
		System.out.printf("나의 신체 지수 %1$.2f입니다.\n", phyval);
	}

}
/*
 * 메서드 앞에 static이 붙으면 static 메서드(또는 클래스 메서드)라고 하고, static이 붙지 않으면 멤버 메서드(non-static)라고 한다.
 * 멤버 메서드는 new 예약어를 이용해 객체를 생성해야 한다.
 * 7line 사용자 정의 멤버 메서드를 선언한다. 반환타입은 double, 메서드 이름은 getBioRhythm, 아규먼트(인자)는 long 타입 days,
 * int 타입 index, int 타입 max이다.
 * 12~14line static 메서드인 메인 메서드에서 getBioRhythm()은 객체를 생성한 후에 호출할 수 있다.
 */
