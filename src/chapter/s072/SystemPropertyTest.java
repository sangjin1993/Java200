package chapter.s072;

import java.util.Iterator;
import java.util.Map;

// 072.System을 환경변수 확인하기
public class SystemPropertyTest {
	public static void main(String[] args) {
		long namotime = System.nanoTime();
		for(int i = 0; i < 100000; i++) {
			System.out.print("");
		}
		long namotime2 = System.nanoTime();					//10^-9 nano java5추가
		System.out.println((namotime2 - namotime));			// 1/10000000000초
		System.out.println(System.getenv("JAVA_HOME"));		// 환경변수
		// 모든 env 구하기
		Map<String, String> map = System.getenv();			// 환경변수
		Iterator<String> iter = map.keySet().iterator();	// Map에서 키 얻기
		int j = 0;
		while(iter.hasNext()) {
			String keys = iter.next();
			System.out.println((++j + "") + keys + ":" + map.get(keys));
		}
	}	//main
}
/*
 * System.getProperty()는 시스템 변수를, System.getenv()는 프로그래밍 개발 환경변수를 반환한다.
 * System.getProperty()는 Propertes를, System.getenv()는 Map을 반환한다. Enumeration은 Iterator의 오래된 버전이다.
 * 키를 얻어서 키에 대한 밸류를 얻을 수 있다.
 * 
 * line9 1970.1.1부터 현재까지 걸린 시간을 나노세컨드로 반환한다. 하루는 24*60*60*1000*1000 = 86,400,000,000나노 세컨드다.
 * line10 ~ 12 10만번 출력을 반복한다.
 * line13 10만 번 반복한 후 시간을 나노세컨드로 반환한다.
 * line14 연산 후에서 연산 전을 빼면 연산에 걸린 시간이다.
 * line15 키 "JAVA_HOME"에 대한 값을 반환한다.
 * line17 시스템 변수를(key, value)로 저장한 맵을 반환한다.
 * line18 (key, value)로 저장한 맵에서 모든 키만을 얻는다.
 * line20 ~ 23 카가 있다면 키값을 얻고 키값에 대한 밸류를 얻는다.
 */
