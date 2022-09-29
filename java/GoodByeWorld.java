import java.util.Scanner;
//тест тест тест
class GoodByeWorld{
	public static void main (String[] args){
		RetWord testMethod;
		try {
			testMethod = new RetWord(6);
			String testStr = "Goodbye World!";
			System.out.println(testMethod.Outcome(testStr));
		}
		catch (Exception e){
			System.out.println(e);
		}
		finally {
			System.out.println("Goodbye World!");
		}
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		System.out.println(input);
	}
}
