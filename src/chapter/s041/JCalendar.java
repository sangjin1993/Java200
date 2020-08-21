package chapter.s041;
// 041.논리 연산자(&&, ||)로 윤년 판별하기 if && ||
public class JCalendar {
	public boolean isLeapYear(int year) {
		boolean isS = false;
		if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			isS = true;
		}
		return isS;
	}
	public static void main(String[] args) {
		JCalendar hc = new JCalendar();
		System.out.println(hc.isLeapYear(2020));
	}
}

/*
 * line6 ~ 8 입력된 연도가 4의 배수이지만 100의 배수는 아니며 400의 배수이다. 윤년이면 isS에 ture를 대입한다.
 * line12 JCalendar 객체를 생성한다.
 * line13 isLeapYear() 메서드는 static 메서드가 아닌 멤버 메서드이므로 객체를 생성한 후 레퍼런스(hc)로 호출한다. 
 */
