package chapter.s038;
// 상수 묶음 클래스 enum
public enum PEI {
	PHYSICA(23), EMOTIONAL(28), INTELLECTUAL(33);
	private final int peiValue;
	PEI(int pei){
		this.peiValue = pei;
	}
	public int getPei() {
		return peiValue;
	}
}
enum FRUIT {
	APPLE, BANANA, MANGO
}

/*
 * line4 23, 28, 33을 생정자를 통해 enum 값으로 초기화한다. 더 이상 값을 변경할 수 없다.
 * line5 PEI에 있는 모든 상수값을 이 enum 변수를 통해 저장할 수 없다.
 * line6 enum 값을 초기화할 수 있는 생성자다.
 * line9 ~ 10 enum이 정수로 변환될 수 없다. 대신 해당 값을 반환하는 메서드를 선언해서 사용한다.
 * line13 생성자와 사용자 정의 메서드가 없는 enum의 예이다. 
 */
