import java.math.BigInteger;
import java.util.Scanner;

public class ChallengeTwoSolution {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int totalLength = sc.nextInt();
			BigInteger myArray[] = new BigInteger[totalLength];
			BigInteger solArray[] = new BigInteger[totalLength];
			
			for(int i = 0; i<totalLength; i++){
				myArray[i] = sc.nextBigInteger();
			}
			
			for(int i=0; i<totalLength; i++){
				solArray[i] = BigInteger.valueOf(2).modPow(myArray[i], BigInteger.valueOf(100000));
				solArray[i] = solArray[i].subtract(BigInteger.ONE);
			}
			
			for(BigInteger i: solArray){
				System.out.println(i);
			}
	
		}
	}
}
