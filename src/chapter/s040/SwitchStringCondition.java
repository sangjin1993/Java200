package chapter.s040;
// String switch
public class SwitchStringCondition {
	public static double toMoney(String c) {
		double tot = 0.0;
		switch(c) {
		case "USD" : tot = 1126.5; break;
		case "JPY" : tot = 110.6; break;
		case "CNY" : tot = 10.5; break;
		default : tot = 1; break;
		}
		return tot;
	}
	public static void main(String[] args) {
		String money = "USD";
		double result = toMoney(money);
		System.out.printf("%s => %f\n", money, result);
	}
}
/*
 * switch는 정수(byte, short, int), char, String, enum 값에 따라 case문이 실행된다.
 * 
 *  line6 ~ 9 입력된 문자열(String)에 따라 해당 case로 분기한다.
 *  line17 %s는 문자열을, %f는 실수를 대입한다.
 */
