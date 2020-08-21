package chapter.s064;
// 064.Object 이해하고 사용하기.
public class UsingObjcet {
	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		System.out.println(obj1.hashCode());						// native 10진수
		System.out.println(Integer.toHexString(obj1.hashCode()));	// 16진수
		System.out.println(obj1 == obj2);							// 객체는 고유하
		System.out.println(obj1.equals(obj2));						// 객체는 고유하
		System.out.println(obj1);
		System.out.println(obj2.toString());						// Class@hashCode()
		
		System.out.println(obj1.getClass().getName());				// 클래스이름
		String str = obj1.getClass().getName() + "@"
				+ Integer.toHexString(obj1.hashCode());				// 16진수
		System.out.println(str);
		
		Object objstr = new String("Good");							// 다형성
		System.out.println(objstr.toString());
		System.out.println(objstr instanceof Object);
		System.out.println(objstr instanceof String);
		
		String hello = "hello";
		System.out.println(hello.getClass());						// 클래스 이름
		
	}
}
/*
 * 자바에서 최상위 클래스는 Object이다. Object는 JVM의 메서드(C/C++로 구현된 native 메서드)를 이용하여 메모리를 관리한다. C/C++와 달리 개발자가
 * 메모리를 관리할 필요가 없다. 그래서 자바의 모든 객체는 Object를 상속받아 메모리를 자동으로 관리한다. Object의 native hashCode(),
 * native getClass()는 JVM의 메서드(C/C++로 구현된 native메소드)를 호출하여 각각 객체의 고유 주소와 객체 타입을 반환한다.
 * 
 * line5 ~ 6 Object클래스에 대한 객체를 생성한다. Object에 대한 객체가 생성되면 JVM이 구별하는 해시코드와 사용자가 구별할 수 있는 레퍼런스도 준비된다.
 *           Object클래스가 스태틱영역에 올라가고, 객체는 힙 영역에 생성되며, 레퍼런스는 스택영역에 있게 된다. 객체를 두 개 생성하면 클래스 하나와 객체
 *           두 개, 각 객체에 대한 고유 레퍼런스와 해시코드가 생성된다.
 * line8 JVM이 구별하려는 객체의 해시코드를 리턴한다. Object의 hashCode 메서드는 플랫폼에 종속적이며, C/C++로 구현된 네이티브메서드를 호출한다.
 * line9 랩퍼 클래스를 이용하여 객체의 고유 주소 해시코드를 16진수 문자열로 변환한다.
 * line10 == 비교는 스택영역의 레퍼런스를 비교한다. new 키워드로 생성하는 참조 타입의 레퍼런스는 객체마다 고유하므로 항상 false이다.
 * line11 equals비교는 1차 주소(해시코드)를 비교한다. 해시코드에 대한 오버라이딩과 equals 오버라이딩을 이용하면 equals로 비교할 수 있다.
 * line12 참조타입의 레퍼런스를 출력하면 자동으로 레퍼런스. toSting()메서드가 된다.
 * line13 레퍼런스.toString()메서드는 기본적으로 "타입@16진수 해시코드"를 리턴한다.
 * line15 클래스에 대한 이름을 리턴한다.
 * line18 레퍼런스.toString()메서드가 출력하는 "타입@16진수 해시코드"형식을 만든다.
 * line20 Object타입으로 String의 객체를 생성한다. "부모 이름으로 자식을 생성할 수 있다"는 레퍼런스의 다형성(Polymorphism)을 보여 준다. Object는
 *        모든 참조 타입의 부모로, 객체를 생성할 때 항상 같이 생성된다. String의 객체를 생성할 때도 "부모인 Object의 객체에 해시코드와 레퍼런스가
 *        존재한다"는 점에 주의하자.
 * line22 ~ 23 키워드 instanceof는 생성된 객체 타입(인스턴스)을 확인한다. 
 */
