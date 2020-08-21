package chapter.s058;
// 058.for와 if를 이용하여 홀수에 대한 제곱의 합 구하기
import java.util.ArrayList;
import java.util.List;
public class ForCondition2 {
	public static void main(String[] args) {
		List<Integer> ilist = new ArrayList<>();
		int s = 0;
		for(int i = 1; i <=10; i++) {
			ilist.add(i);
		}
		for(int m : ilist) {
			if(m % 2 == 1) {
				s += m * m;
				System.out.printf("%d\t", m * m);
			}
		}
		System.out.println();
		System.out.println("1 ~ 10 사이의 홀수에 대한 제곱합 : " + s);
	}
}
/*
 * 배열보다 편리하고 강력한 List에 정수를 저장한다. 저장한 정수 중에서 홀수를 찾아 이에 대한 제곱의 합을 구한다. 
 * List<>의 <>에는 int가 아닌 Integer를 사용해야 한다.
 * 
 * line7 정수를 List에 저장한다. <Integer>를 이용해서 정수로 한정한다.
 *       List에 저장할 수가 int 타입이므로 랩퍼클래스 Integer를 사용하여 List<Integer>로 선언하고 생성한다.
 * line9 ~ 11 1과 10 사이의 정수를 List에 저장한다.
 * line12 List에 저장된 정수를 한 개씩 가져와서
 * line13 홀수인지 판별한다.
 * line14 홀수이면 제곱의 합을 구한다. 이렇게 하면 1부터 10사이의 홀수에 대한 제곱의 합을 구할 수 있다.
 */
