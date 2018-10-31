import java.util.Scanner;

public class JavaP1 {
	public static void main (String [] args){
		Scanner reader = new Scanner(System.in);

		System.out.println("Preciso que faça alguns inputs.");
		System.out.println("Qual é o número de simulações que pretende?");
		int nSimulations = reader.nextInt();		
		System.out.println("Obrigado pelo seu registo");
		reader.close();
		
		System.out.println("$ approxPi " + nSimulations);
		System.out.println("Total Number of Points: " + nSimulations);
		System.out.println("Points within circle: " + monte(nSimulations));
		System.out.println("Pi estimation: " + (((double) monte(nSimulations)/(double)nSimulations)* 4));
		
	}

	public static int monte(int gone){
		int success = 0;
		double x;
		double y;
		for (int i = 0; i < gone; i++){
			x = Math.random();
			y = Math.random();
			if((x*x + y*y) <= 1){
				success++;
			}
			else{
			}
		}
		return success;
	}
}
