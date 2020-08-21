package chapter.s037;
// 상수, switch case
public class BioSwitch {
	// 상수
	public static final int PHYSICAL = 23;
	public static final int EMOTIONAL = 28;
	public static final int INTELLECTUAL = 33;
	//메세드 선언
	public static String textInfor(int index, double value) {
		String result = "";
		switch(index) {
			case PHYSICAL : result = "신체 지수 : "; break;
			case EMOTIONAL : result = "감정 지수 : "; break;
			case INTELLECTUAL : result = "지성 지수 : "; break;
			default : result = "미결정"; break;
		}
		return result + (value * 100);
	}
	public static void main(String[] args) {
		int index = PHYSICAL;
		double value = 0.86;
		String st = textInfor(index, value);
		System.out.println(st);
	}
}

/*
 * line5 ~ 7 상수를 선언한다.
 * line9 static textInfor메서드를 선언한다.
 * line11 입력된 정수값에 따라 case로 분기한다.
 * line12 ~ 14 입력된 정수가 해당 case의 상수값과 같을 때 result에 문자열에 대입하고 break를 만나 switch를 끝낸다.
 * line15 입력된 정수가 case의 상수값과 모두 일지하지 않느면 실행된다.
 * line22 textInfor static 메소드를 호출하여 문자열을 반환한다.
 */
