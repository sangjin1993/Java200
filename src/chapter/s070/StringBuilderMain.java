package chapter.s070;
// 070.StringBuilder로 문자열 수정, 변경, 추가하기
public class StringBuilderMain {
	public static void main(String[] args) {
		//synchronized 안한 StringBuffer
		StringBuilder sbu = new StringBuilder();
		sbu.append("I")
		   .append(" go")
		   .append(" to school.");
		System.out.println(sbu);
		sbu.replace(7, 11, "");
		System.out.println(sbu);
		sbu.reverse();
		System.out.println(sbu);
		sbu.delete(1, 3);
		System.out.println(sbu);
		String ss = sbu.substring(0);
		System.out.println(ss);
		System.out.println(sbu);
		String st = sbu.substring(0, 4);
		System.out.println(st);
		System.out.println(sbu);
	}
}
/*
 * String은 문자열의 내용이 조금이라도 바뀌거나 스트링 컨케트네이션(+ 또는 concat 연산)되면 새로운 객체를 만든다. 레퍼런스를 잃어버린 객체는 가비지 컬렉션의
 * 대상이 되며, 새로운 객체에게 새 주소를 주므로 해시코드도 변한다. 그러나 StringBuffer는 원래 있던 객체의 내용만 바뀌(주소는 변경하지 않음)는 뮤터블한
 * 특성이 있기 때문에 StringBuffer를 쓰도록 권장한다. StringBuilder는 동기화하지 않는 StringBuffer이다. 여러 쓰레드에서 하나의 StringBuffer를
 * 사용하는 것은 피한다.
 * 
 * line6 StringBuilder 객체를 생성한다.
 * line7 ~ 9 append는 String의 스트링 컨케트네이션(+, concat) 역할을 한다. 그러나 StringBuilder는 뮤터블하므로 다시 대입하지 않아도 된다.
 * line10 모든 참조 타입을 출력할 때는 자동으로 .toString()이 붙어 저장된 문자열을 출력한다.
 * 
 */
