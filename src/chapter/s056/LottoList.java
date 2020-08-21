package chapter.s056;
import java.util.ArrayList;
import java.util.List;

// 056.배열보다 편리한 List사용하기 
public class LottoList {
	public static void main(String[] args) {
		List<Integer> ilist = new ArrayList<>();
		// 넣기
		for (int i = 1; i <= 10; i++) {
			ilist.add(i);
		}
		// 가져오기
		for(int i = 0; i < ilist.size(); i++) {
			int m = ilist.get(i);
			System.out.printf("%d\t", m);
		}
		System.out.println();
	}
}
/*
 * List는 배열과 같은 역할을 하면서 더 편리하고 강력한 기능(메서드)을 제공한다. 배열은 저장하는 데이터 수가 제한되어 있으므로 정해진 개수만큼 입력되면
 * 더 이상 저장할 수 없다. 반면 List는 저장 공간을 스스로 확보하면서 데이터를 저장한다. List에 입력할 때는 add를, List에서 가져올 때는 get을 사용한다.
 * 
 * line7 List 계열의 ArrayList를 생성한다. List에 저장할 타입은 int 타입이지만 List는 기본 타입 대신 랩퍼클래스를 사용한다.
 *       int 타입을 List에 저장하기 위해 List<Integer>를 사용한다.
 * line9 ~ 11 1부터 10까지의 int를 List에 저장한다.
 * line14 배열 m[i]처럼 index i를 이용하지만, get(i) 메서드를 사용한다.
 * line15 List에 저장되었던 정수를 출력한다.
 */