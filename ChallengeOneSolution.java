import java.math.BigInteger;
import java.util.Scanner;
public class ChallengeOneSolution {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int totalLength = sc.nextInt();
			BigInteger myArray[] = new BigInteger[totalLength];
			BigInteger solArray[] = new BigInteger[totalLength];
			
			for(int i = 0; i<totalLength; i++){
				myArray[i] = sc.nextBigInteger();
			}
			
			for(int i=0; i<totalLength; i++){
				solArray[i] = myArray[i].modPow(BigInteger.valueOf(2), BigInteger.valueOf(1000000007));
			}
			
			for(BigInteger i: solArray){
				System.out.println(i);
			}

		}
		
	}

}
