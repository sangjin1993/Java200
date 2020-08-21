package chapter.s055;
// 055.varargs(variablearguments)를 이용하여 배열 출력하기 
public class ForeachLotto {
	// var args variable argunents
	public static void print(int ... mm) {
		for (int m : mm) {
			System.out.printf(m + "\t");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] mm = {1, 6, 16, 22, 23, 33};
		print(mm);
		int a = 1, b = 6, c = 16;
		print(a);			// 1개짜리도 되고
		print(a, b);		// 2개짜리도 되고
		print(a, b, c);		// 3개짜리도 되고
	}
}
/*
 * 가변인자(varargs, variable arguments)는 아규면트의 개수가 몇개라도 배열처럼 사용할 수 있다. 아규먼트의 개수가 한 개일 때, 여러 개일 때,
 * 배열일 때는 여러 메서드가 필요한데 가변인자를 사용하면 한 개의 메서드로 처리할 수 있다. 따라서 오버로딩 메서드 개수가 줄어드는 효과를 갖는다.
 * 
 * line4 가변인자(varargs, ...)는 변수의 타칩이 같을 경우, 한 개 이상의 변수를 배열처럼 받아서 사용할 수 있다.
 * line5 배열을 편리하게 출력하기 위해 "향상된 for(또는 foreach)"를 사용하여 입력받은 아규먼트를 출력한다. 가변인자를 배열처럼 사용한다.
 * line12 가변인자는 같은 타입의 배열도 받을 수 있다.
 * line14 1개의 int 타입 아규먼트(인자)를 받을 수 있다.
 * line15 2개의 int 타입 아규먼트(인자)를 받을 수 있다.
 * line16 3개의 int 타입 아규먼트(인자)를 받을 수 있다.
 */
