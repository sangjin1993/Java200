package chapter.s066;
// 066.String(문자열)을 이용해 도시 이름 비교하기
public class StringMain {
	public static void main(String[] args) {
		String city1 = "Asia";
		String city2 = "Europe";
		String city3 = new String("Asia");
		String city7 = "Asia";
		System.out.println(city1);
		System.out.println(city1.length());
		System.out.println(city1 == city2);
		System.out.println(city1.equals(city2));
		System.out.println(city1 == city3);
		System.out.println(city1 == city7);
		System.out.println(city1.equals(city3));
		System.out.println(city1.equals(city7));
		
		String city4 = String.format("%s-%s", city1, city2);
		System.out.println(city4);
		String city5 = city1 + "-" + city2 + 1 + 2;
		System.out.println(city5);
		String city6 = 1 + 2 + city1 + "-" + city2;
		System.out.println(city6);
	}
}
/*
 * 원래 new키워드로 생성한 객체의 Stack의 레퍼런스는 같을 수 없다. 또한 Heap의 해시코드도 같을 수 없다. 그러나 String은 Heqp의 풀(Pool)을 이용하므로,
 * 같은 문자열에 대하여 new로 생성한 문자열의 Stack레퍼런스는 다르지만 Heap의 해시코드는 동일하다. 같은 문자열에 대하여 new로 생성하지 않은 문자열은 Stack의
 * 레퍼런스와 Heap의 해시코드가 동일하다. String의 생성 방법에 따라 Stack의 레퍼런스는 다를 수 있지만, Heap의 해시코드는 동일하다.
 * 
 * line5 String은 참조 타입이지만 new 키워드를 사용하지 않고 생성할 수 있다. 기본 타입처럼 쉽게 사용할 수 있도록 대입(=) 연산자를 사용한다.
 * line9 문자열(String)을 출력한다.
 * line10 문자열의 길이를 구한다. 문자열은 참조 타입이므로 메서드를 갖는다. "레퍼런스.메서드()" 형태로 메서드를 호출해 사용한다.
 * line11 다른 문자열에 대하여 ==는 false이다. ==는 Stack의 레퍼런스를 비교한다.
 * line12 다른 문자열에 대하여 equals()는 false이다. equals()는 해시코드를 비교한다.
 * line13 같은 문자열인지 비교한다. "new" 키워드로 생성하지 않은 문자열에 대해 같은 문자열이면, equals()나 == 모두 참이다. "new" 키워드로 생성한 문자열에
 *        대해 같은 문자열이면, equals()는 참이지만 레퍼런스는 다르므로 ==은 거짓이다. 문자열 .equals()를 권장한다.
 * line18 원하는 포맷으로 문자열을 만든다. String.format("%s-%s". city1, city2)에서 %s는 문자열을 의미한다. 첫 번째, 두 번째 %s에 각각 city1과
 *        city2가 대입되면서 "Asia-Europe"이 만들어진다.
 * line20 city1 + city2에서 +는 concat으로, city1.concat(city2)와 동일하다. "문자열을 붙여서"하나의 문자열을 만든다.
 * line22 String과 기본 타입을 붙이면 문자열이 된다. 기본 타입과 String의 위치에 따라 결과가 달라지므로 주의해야 한다. 예를 들어, 1 + 2 + "hello" =
 *        "3hello", "hello" + 1 + 2 = "hello12"이다. 다시 말해 String을 만나는 순간 String이 된다.
 */
