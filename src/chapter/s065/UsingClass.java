package chapter.s065;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

// 065.Class를 이용하여 메서드와 생성자 살펴보기
public class UsingClass {
	public static void main(String[] args) {
		Object obj1 = new Object();
		Class classes = obj1.getClass();
		System.out.println(classes.getName());		// 클래스 이름
		System.out.println("---------constructor---------");
		Constructor[] construtor = classes.getConstructors();
		for(Constructor con : construtor) {
			System.out.println(con.getName());
		}
		System.out.println("---------Method---------");
		Method[] method = classes.getMethods();
		for(Method me : method) {
			System.out.println(me.getName());
		}
	}
}
/*
 * Object의 getClass()메서드는 Class를 반환한다. Class는 해당 클래스의 선언된 메서드와 생성자들을 반환하는 메서드를 제공한다.
 * getDeclaredConstructors()는 선언한 생성자, getMethods()는 선언된 메서드를 제공한다. Class는 모든 객체에 대한 객체 자신의 정보(생성자 관련
 * , 메서드관련)등을 제공한다.
 * 이를 Reflection이라고 한다.
 * 
 * line10 클래스에 대한 모든 정보는 java.lang.Class를 이용한다.
 * line11 클래스 이름을 리턴한다.
 * line13 클래스의 모든 생성자를 리턴한다. 생성자에 대한 모든 정보는 java.lang.reflect.Constructor를 이용하여 얻는다. 모든 생성자를 리턴하므로 배열로 받는다.
 * line14 ~ 16 향상된 for(foreach)를 이용하여 생성자의 이름을 출력한다.
 * line18 클래스의 모든 메서드를 리턴한다. 모든 메서드를 리턴하므로 배열로 받는다.
 * line19 ~ 21 향상된 for(foreach)를 이용하여 메서드의 이름을 출략한다;
 */