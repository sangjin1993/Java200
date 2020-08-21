package chapter.s054;
// 054.향상된 for(foreach)로 배열 출력하기 for와 배열
public class ForeachLotto {
	public static void main(String[] args) {
		int[] mm = {1, 6, 16, 22, 23, 33};
		for(int m : mm) {
			System.out.printf(m + "\t");
		}
		System.out.println();
	}
}
/*
 * 향상된 for는 배열이나 리스트를 index로 굳이 저정하지 않아도 되므로 출략할 때 매우 편리하다. 배열의 값을 변경하지 않고 출략 위주로 사용된다.
 * : (in) 뒤에는 배열이나 리스트가 오고, :(in) 앞에는 타입을 사용한다.
 * 
 * line5 1차원 배열을 선언과 함께 초기화한다.
 * line 6 ~ 8 위치(index)가 자동으로 붙으므로 편리하게 사용할 수 있다.
 */
