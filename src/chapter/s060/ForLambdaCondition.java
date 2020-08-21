package chapter.s060;
// 060.Stream과 map을 이용하여 홀수에 대한 제곱의 합 구하기
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class ForLambdaCondition {
	public static void main(String[] args) {
		List<Integer> ilist = new ArrayList<>();
		int s = 0;
		for(int i = 1; i <= 10; i++) {
			ilist.add(i);
		}
		// stream filter map collect
		ilist = ilist.stream()
				.filter(i -> i % 2 == 1)
				.map(i -> i * i)
				.collect(Collectors.toList());
		ilist.forEach(i -> { System.out.printf(i + "\t"); });
		System.out.println();
		// stream reduce
		s = ilist.stream().reduce(0, Integer::sum);
		System.out.println("1 ~ 10 사이의 홀수에 대한 제곱합 :" + s);
	}
}
/*
 * 리스트에 저장된 데이터에 대해 조건에 맞는 수를 찾을 떄는 filter를 이용한다. filter에서 찾은 수에 대하여 "제곱을 하라"처럼 "이렇게 처리하라"는 map을 이용한다.
 * collect는 해당 수의 값을 새로운 리스트에 저장한다. filter(수 -> 홀수).map(수 -> 수 * 수).collect()는 홀수에 대하여 제곱한 수를 새로운
 * 리스트에 저장한다는 의미이다.
 * 
 * line10 ~ 12 1과 10 사이의 정수를 List에 저장한다.
 * line15 홀수를 구한다.
 * line16 홀수에 대하여 제곱을 한다.
 * line17 홀수를 제곱한 수는 모두 ilist에 저장된다.
 * line18 홀수에 대한 제곱수를 출력한다.
 * line21 홀수 제곱수의 합을 구한다. s = 0 + 1 * 1 + 3 * 3 + 5 * 5 + ... 9 * 9
 * 
 * stream collect메소드, Collectors.toList()메소드
 */
