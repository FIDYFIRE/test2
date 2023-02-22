package test2;
import java.util.Scanner;


public class test {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Entrez un nombre : ");
	        int n = scanner.nextInt();

	        if (n % 3 == 0 && n % 5 == 0) {
	            System.out.println("FluzzGratz");
	        } else if (n % 3 == 0) {
	            System.out.println("Fluzz");
	        } else if (n % 5 == 0) {
	            System.out.println("Gratz");
	        } else {
	            System.out.println(n);
	        }

	        scanner.close();
	    }
}


