package chapter.s080;

import java.util.ArrayList;

// 080.박싱, 언박싱으로 기본 타입을 참조 타입으로 변환하기
public class EasyBoxingMain {
	public static void main(String[] args) {
		int intNm1 = 123;
		long longNum1 = 345L;
		double doubleNum = 123.123;
		Integer intWrap1 = intNm1;			// new Integer(intNm1);
		Long longWrap1 = longNum1;			// new Long(longNum1);
		Double doubleWrap1 = doubleNum;		// new Double(longNum1);
		double dd = doubleWrap1;
		// 기본 타입 <--> Wrapper는 캐스팅 없이 사용
		Integer intWrap2 = intNm1;		// Boxing
		intNm1 = intWrap2;				// UnBoxing
		System.out.println(intNm1);
		
		ArrayList<Integer> ilists = new ArrayList<>();
		ilists.add(new Integer(3));
		ilists.add(5);
		int a = ilists.get(0);		// <Integer>
		System.out.println(a);
		
		int b = Integer.parseInt("123");
		System.out.println(b);
	}
}
/*
 * 기본 타입을 랩퍼 클래스로, 랩퍼 클래스를 기본 타입으로 자동 변환한다. int와 integer는 서로 자동 변환한다. List<>의 제네릭은 "참조 타입만 사용할 수 있다."
 * 는 문법 때문에 List<int>대신 List<Integer>를 사용한다.
 */

