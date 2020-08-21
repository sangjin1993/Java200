package chapter.s062;
// 062.정수를 입력받을 때 발생할 수 있는 예외 처리하기
public class FormatTryCatch {
	public static void main(String[] args) {
		String sNum = "123";
		String nNum	= "h";
		try {
			int a = Integer.parseInt(sNum);
			System.out.println(a);
		} catch (NumberFormatException ee) {
			System.out.println("int인지 확인해 봐!!!");
			System.err.println(ee.getMessage());
		} catch(Exception ee) {
			System.out.println("야");
		} finally {
			System.out.println("난 수행되어야만 해!!!");
		}
	}
}
/*
 * 문자열을 기본 타입으로 변환할 떄는 랩퍼(Wapper)클래스를 사용한다. "34"와 같은 정수형 문자열을 정수로 변환하려면 Integer.parseInt()를,
 * "34.5"와 같은 실수형 문자열을 실수로 변환하려면 Double.parseDouble()을 사용한다. 이때 잘못된 변환을 사용하면 NumberFormatException이
 * 발생한다. 예외가 발생할 수 있는 문장을 try{}에 넣고, 예외가 발생하면 catch(){}에서 처리하게 한다. 예외 처리는 예외를 안전하게 끝내는 것이
 * 목적이므로 catch를 되도록 간단하게 작성한다.
 * 
 * line8 ~ 10 8라인의 Integer.parseInt()는 정수 타입 문자열을 정수로 변환할 때 사용한다. 잘못된 타입을변환하려고 하면 NumberFormaException
 *            이 발생한다. 이를 대비해 try로 감싼다.
 * line10 잘못된 타입을 변환하려고 하면 NumberFormatException을 발생한다. 이 예외가 발생하면 예외를 처리한다.
 * line11 ~ 12 예외에 대한 내용을 출력한다.
 * line13 NumberFormatException이외의 예외가 발생하면 예외를 처리한다. NumberFormatException이 아닌 다른 예외(처리하지 못한 예외)라면 Exception
 *        이 모두 처리하기 때문에 NumberFormatException까지 도달할 수 없으므로 Unreachable Catch Block Rrror가 발생한다.
 * line15 예외가 발생하거나 발생하지 않아도 반드시 실행된다.
 */ 
