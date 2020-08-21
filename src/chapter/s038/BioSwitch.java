package chapter.s038;
// enum, switch case
public class BioSwitch {
	// 메서드 선언
	public static String textInfor(PEI index, double value) {
		String result = "";
		switch(index) {
			case PHYSICA : result = "신체 지수 : "; break;
			case EMOTIONAL : result = "감성 지수 : "; break;
			case INTELLECTUAL : result = "지성 지수 : "; break;
			default : result = "미결정"; break;
		}
		return result + (value * 100);
	}
	public static void main(String[] args) {
		PEI index = PEI.PHYSICA;
		double value = 0.86;
		System.out.println("신체 지수 주기값 : " + index.getPei()); //enum을 int로 반환
		String st = textInfor(index, value);
		System.out.println(st);
		System.out.println(index.ordinal());
		System.out.println(index.name());
		System.out.println(index);
		System.out.println(index.getPei());
	}
}
/*
 * enum은 상수를 묶은 클래스이다.
 * enum은 정수값으로 변환될 수 없다. 만약 대응되는 정수값으로 변경하려면 생성자와 get 메서드를 만든다.
 * 상수 값에 따라 case로 분기하기 때문에 enum도 가능하다.
 * switch는 정수(byte, short, int), char, String, enum 값에 따라 case문이 실행된다.
 * enum 생성자를 통한 초기화는 final static 값을 static 생성자에서 단 한 번 초기화할 수 있는 것과 동일하다.
 * 
 * line18 해당 enum 값을 출력한다.
 * line21 순서(ordinal)를 출력한다. PHYSICAL은 0번째이다.
 * line22 enum 값의 이름을 출력한다.
 * line23 name이 자동으로 붙어서 이름이 출력된다.
 * line24 textInfor static 메서드를 호출하여 문자열을 반환한다.  
 */

