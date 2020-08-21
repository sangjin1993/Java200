package chapter.s036;
// case
public class BioSwitch {
	// 조건에 따라 신체, 감정, 지성값을 출력
	public static String textInfor(int index, double value) {
		String result = "";
		switch(index) {
		case 23 : result = "신체 지수:"; break;
		case 28 : result = "감정 지수:"; break;
		case 33 : result = "지성 지수:"; break;
		}
		return result + (value * 100);
	}
	public static void main(String[] args) {
		int index = 23;			// 신체 지수
		double value = 0.86;
		String st = textInfor(index, value);	//메서드 호출
		System.out.println(st);
	}
}

/*
 * switch에 입력된 정수값에 따라 case문이 실행된다.
 * 
 *  입력된 정수(index)가 23이면 신체 지수 result에 대입하고, break를 만나면서 switch문을 끝낸다. 같은 원리로 28을 만나면 감정 지수를 result	에
 *  대입하고, 33을 만나면 지성 지수를 result에 대입한다.
 *  
 *  line12 case에 분기한 결과 문자열에 각 지수값을 붙여서 문자열을 반환한다. 문자열 + 기본 타입은 문자얄이 된다. 예를 들어 "hello12"가 되고
 *  1 + 2 + "hello"는 "3hello"가 된다.
 *  
 *  line17 textInfor static 메서드를 호출하여 문자열에 지수값을 붙인 지수값 문자열을 반환한다.
 */
