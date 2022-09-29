public class RetWord{
private int counter;
private String outCome;
	public RetWord(int count){
		counter = count;
	}
	public String Outcome(String income){
		for (int i=0; i < counter; i++){
			outCome = outCome + income.charAt(i);
		}
		return outCome;
	}
}