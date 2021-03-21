import java.util.Stack;import javax.sound.midi.SoundbankResource;

public class TowerOfHanoi {

	Stack<Integer> sourceStack = new Stack<>();
	Stack<Integer> auxilliaryStack = new Stack<>();
	Stack<Integer> targetStack = new Stack<>();
	int sourceRod = 1;
	int auxilliaryRod = 2;
	int targetRod = 3;
	int count = 0;
	
	public static void main(String[] args) {
		TowerOfHanoi toh = new TowerOfHanoi();
		int numOfDisc = 2;
		for (int i=numOfDisc; i>=1; i--) {
			toh.sourceStack.push(i);
		}
		//System.out.println("Stack count " + toh.sourceStack+ toh.auxilliaryStack+ toh.targetStack);
		toh.moves(numOfDisc, toh.sourceStack, toh.targetStack, toh.auxilliaryStack);
		System.out.println(toh.count);
		
	}

	private void moves(int numOfDisc, Stack<Integer> sourceStack1, Stack<Integer> targetStack1,
			Stack<Integer> auxilliaryStack1) {
		
		if (numOfDisc > 0) {
			moves(numOfDisc-1, sourceStack1, auxilliaryStack1, targetStack1);
			//System.out.println("Move disk " + numOfDisc +  " from rod " + 
				//	sourceStack + " to rod " + targetStack);
			targetStack1.add(sourceStack1.pop());
			count++;
			System.out.println("Stack count " + sourceStack+ auxilliaryStack+ targetStack);
			//System.out.println("Move disk " + numOfDisc +  " from rod " + 
				//sourceStack1 + " to rod " + targetStack1);
			
			//move disk 1 from rod 1 to rod 2
			moves(numOfDisc-1, auxilliaryStack1, targetStack1, sourceStack1);
			//System.out.println("Move disk11 " + numOfDisc +  " from rod " + 
				//	auxilliaryRod + " to rod " + targetRod);
		}
		
	}
	
}
