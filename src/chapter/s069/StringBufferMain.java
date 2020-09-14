package chapter.s069;
// 069.StringBuffer로 문자열 수정, 변경, 추가하기
public class StringBufferMain {
	public static void main(String[] args) {
		// StringBuffer 생성
		StringBuffer sb1 = new StringBuffer();
		// 1. 계속 붙이는 함수 mutable
		sb1.append("안녕하세요.")
		   .append("또만나요.")
		   .append("기달려봐.");
		System.out.println(sb1.toString() + sb1.hashCode());
		// 2. replace
		sb1.replace(0, 2, "역겨워");
		System.out.println(sb1.toString() + sb1.hashCode());
		// 3. reverse
		sb1.reverse();
		System.out.println(sb1.toString());
		// 4. delete
		sb1.delete(10, 15);
		System.out.println(sb1.toString());
		// 5. cal by reference, shallow copy
		replaces(sb1);
		System.out.println(sb1.toString());
	}
	public static void replaces(StringBuffer sb) {
		sb.reverse();
		sb.replace(0, 3, "GoGo");		// 0부터 2까지를 GoGo로
	}
}
/*
 * String은 + 또는 concat 연산으로 새로운 문자열을 얻으면 새로운 주소를 받지만 StringBuffer의 주소는 동일하다.
 * 문자열을 저장 또는 처리하는 String은 참조 타입이지만 성격을 변경해서(오버라이딩) 기본타입과 동일한 CBV(값 복사)를 한다.
 * 문자열을 연산한 후 대입 연산자로 저장해야 변경한다. 바꾼 문자열을 다시 대입하지 않으면 원래 문자열이 되는 특징이 이뮤터블이다.
 * 내용이 변경되면 새로운 주소를 갖는다. StringBuffer는 저장하는 내용이 변경되어도 처음 주소가 변경되지 않는다. 바꾼 문자열을
 * 다시 대입하지 않아도 원래 문자열이 변하는 것을 뮤터블이라고 한다. StringBuffer로 문자열을 연산한 다음, 최종으로 toString()을
 * 통하여 String으로 변환해서 사용한다.
 * 
 * line6 StringBuffer 객체를 생성한다.
 * line8 ~ 10 append는 String의 스트링 컨케트네이션(+, concat) 역할을 한다. 그러나 StringBuffer는 뮤터블하므로 다시 대입하지 않아도 된다.
 * line13 replace(0, 2, "역겨워")는 0번째부터 (2 - 1)번째까지의 문자열 "안녕"을 제거하고 "역겨워"로 바꾼다.
 * line16 뮤터블 문자열을 반대로 뒤집는다.
 * line19 delete(10, 15)는 10번쨰부터 (15 - 1)까지의 문자열을 지운다. 자리는 0부터 시작한다.
 * line22, 25 StringBuffer가 뮤터블하기 때문에 문자열을 변경한다.
 */
