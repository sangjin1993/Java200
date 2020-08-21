package chapter.s032;
// 1ckdnjs
public class GeoPoint {
	public static void main(String[] args) {
		// 실수 변수
		double latitude1 = 37.52127220511242;
		double longitude1 = 127.0074463890635;	// 서울
		double latitude2 = 35.137879119634185;
		double longitude2 = 129.04541015625;	// 부산
		System.out.println(latitude1 + "\t" + longitude1);
		// 실수 1차원 배열
		double[] latlng1 = {latitude1, longitude1};
		double[] latlng2 = {latitude2, longitude2};
		System.out.println(latlng1[0] + "\t" + latlng1[1]);
		// 실수 2차원 배열
		double[][] latlng = {{latitude1, longitude1}, {latitude2, longitude2}};
		System.out.println(latlng[0][0] + "\t" + latlng[0][1]);
	}
}

/*
 * 배열은 같은 타입을 나열한 것이다. 배열은 []를 사용하며, []가 1개이면 1차원, [][]처럼 2개이면 2차원 배열이다.
 * 위도와 경도는 double이므로 double[] latlng = {위도, 경도}; 형식으로 선언할 수 있다.
 * 
 * {위도, 경도}를 배열로 선언한다.
 *
 *
 * 배열은 참조 타입이다. 배열은 new로 생성하는 동적 할당 배열과, new를 사용하지 않는 정적 할당 배열이 있다. 이번
 * 얘제는 정적 할당 배열을 사용한다. 정적 할당 배열은 두번째 대입을 할 수 없다.
 * double[] latlng1 = {37.5, 127.0}	// 선언, 초기화
 * latlng1 = {36.4, 128.4} 			// 두번째 대입 불가능
 */
