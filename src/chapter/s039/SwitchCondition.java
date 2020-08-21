package chapter.s039;
// char switch
public class SwitchCondition {
	public static int toNum(char c){
		int tot = 0;
		switch(c) {
		case 'A' : tot = 1; break;
		case 'T' : tot = 10; break;
		case 'J' : tot = 11; break;
		case 'Q' : tot = 12; break;
		case 'K' : tot = 13; break;
		default : tot = c-'0'; break;	// '9'-'0'
		}
		return tot;
	}
	public static void main(String[] args) {
		char c ='J';
		int result = toNum(c);
		System.out.printf("%c => %d\n", c, result);
	}
}

/*
 * 키보드로 입력받은 0은 '0'이며 int로는 48이다. 'A'는 65, 'a'는 97이다. '9'를 9로 변환하는 방법은 '9'-'0'으로, 57 - 48 = 9 가 된다.
 * switch에서 case에 대한 break가 없다면 다음 case의 break를 만날 때까지 다음 case문이 실행된다.
 * 이를 fall through(쭉 내려감)이라고 한다.
 * 
 * line6 입력된 문자(char)에 따라 해당 case로 분기한다.
 * line7 'A'일 때 1을 대입한다.
 * line12 해당 문자가 없을 때는 '0'을 뺀다. 카드 게임에서 A, T, J, Q, K 이외에 2 ~ 9까지는 숫자이고, default는 숫자 타입 문자이므로 '0'을 빼면
 *        0 ~ 9의 int가 된다. 정리하면 '9' - '0'처럼 처리해서 9를 얻을 수 있다.
 * line19 %c는 char타입을 대입하라는 의미이다.
 */
