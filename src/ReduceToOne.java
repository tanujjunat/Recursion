
public class ReduceToOne {
	
	
	public static void main(String[] args) {
		
		int input = 18;
		ReduceToOne rto = new ReduceToOne();
		int count = rto.reduce(input);
		System.out.println(count);
		
	}

	private int reduce(int input) {
		if (input != 1) {
			
			if ((input % 2) == 0) {
				return 1 + reduce(input/2);
			} else {
				return 1+ Math.min(reduce(input-1),reduce(input+1));
			}					
		} else {
			return 0;
		}
		
	}
}
