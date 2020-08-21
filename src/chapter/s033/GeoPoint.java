package chapter.s033;
// 위도, 경도를 한 묶음으로 객체에 저
public class GeoPoint {
	public static void main(String[] args) {
		// 실수 변수
		double latitude1 = 37.52127220511242;
		double longitude1 = 127.0074463890635;	// 서울
		double latitude2 = 35.137879119634185;
		double longitude2 = 129.04541015625;	// 부산
		// (위도, 경도) 객체
		Geo geo1 = new Geo();
		geo1.latitude = latitude1;
		geo1.longitude = longitude1;
		System.out.println(geo1.latitude + "\t" + geo1.longitude);
		Geo geo2 = new Geo();
		geo2.latitude = latitude2;
		geo2.longitude = longitude2;
		// 객체 전달
		Geo geo = geo1;
		System.out.println(geo.latitude + "\t" + geo.longitude);
	}
}

/*
 * 객체의 멤버는 해당 객체에서 가장 중요한 데이터이다. 이 멤버를 보면 어떤 객체인지 짐작할 수 있다. 위도와 경도를 갖는 객체는
 * "위치를 표현하려고 한다."라는 성격(character)이 보인다. 그래서 멤버를 객체의 속성(attibute)이라고도 한다. 객체로 사용하려면
 * 객체의 설계도인 클래스를 만들어야한다.
 * 
 *  line11 Geo 객체를 생성한다. new 예약어는 클래스에서 선언한 대로(설계도대로) 힙(Heap)메모리에 올려 사용할 수 있는 객체를 생성한다.
 *  line12~13 생성된 객체(인스턴스)에 위도와 경도를 출력한다.
 *  line14 해당 객체(서울)의 위도와 경도를 출력한다.
 *  line20 객체의 주소값을 알려 준다(대입한다).
 *  line21 알려준 주소에 있는 객체의 위도와 경도를 출력한다. 서울의 위치를 저장한 객체의 주소를 알려주므로 서울 위치가 출력된다.
 */
