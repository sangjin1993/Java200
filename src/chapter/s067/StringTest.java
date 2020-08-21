package chapter.s067;
// 067.String(문자열) 가공하기
public class StringTest {
	public static void main(String[] args) {
		String text = " Hello Java4Android";
		String com = " HEllo java4Android";
		
		System.out.println(text.charAt(2));
		// 자바에서 위치 (index)는 0부터 시작한다. '','H', 'e', 'l',...순으로 선언되어 있으므로 2번째 index문자는 'e'이다.
		System.out.println(text.concat("s"));
		// concat()는 + 와 같다. 문자열 "s"를 오른쪽에 붙인다. t = " Hello Java4Androids"
		System.out.println(text.contains("And"));
		// "And" 문자열을 포함하고 있는지 판별한다. true
		System.out.println(text.equals(com));
		// 두 문자열이 같은지 판별한다. true
		System.out.println(text.equalsIgnoreCase(com));
		// 대소문자를 구별하지 않고 두 문자열이 같은지를 판별한다. true
		System.out.println(text.indexOf("a"));
		// 문자열(또는 문자)이 처음 발견된 위치를 반환한다. 없다면 -1을 반환한다. index = 8
		System.out.println(text.lastIndexOf("a"));
		// 문자열(또는 문자)이 가장 뒤쪽에서 발견된 위치를 반환한다. 없다면 -1을 반환한다. index = 10
		System.out.println(text.trim());
		// 양쪽의 공배을 제거한다. s = "Hello Java4Android"
		System.out.println(text.length());
		// 문자열의 길이를 반환한다. 공백도 포함된다. 19
		System.out.println(text.substring(7));
		// 입력된 위치의 문자열 앞쪽을 자른 다음, 그 위치로부터 뒤쪽을 반환한다. s = "Java4Android"
		System.out.println(text.substring(7, 11));
		// substring(index1, index2)는 index부터 (index2 - index)자를 반환한다. s = "Java"
		System.out.println(text.replace(" ", "-"));
		// replace(oldc, newc)는 oldc를 newc로 변환한다. s = "-Hello-Java4Android"
		System.out.println(text.replaceAll(" ", "-"));
		System.out.println(text.toUpperCase());
		// 모두 대문자로 변경한다. s = " HELLO JAVA4ANDROID"
		System.out.println(text.toLowerCase());
		// 모두 소문자로 변경한다. s = " hello java4android"
		
		String[] sp = text.split(" ");
		// split(del)은 del문자를 기준으로 문자열을 잘라 배열로 반환한다. " "을 기준으로 분할하기 때문에 V로 표시하면 s = "VhelloVJava4android"
		// 와 같아서 sp = {"", "Hello", Java4Android"}로 분할된다.
		for(int i = 0; i < sp.length; i++) {
			System.out.println(i + "\t\t" + sp[i] + "\t\t" + sp[i].length()); 
		}
	}
}
