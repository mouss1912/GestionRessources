import java.io.IOException;
import java.io.*;
import java.util.Scanner;


public class Emission implements Runnable {

	private PrintStream out;
	private String message = null;
	private Scanner sc = null;
	
	public Emission(PrintStream out) {
		this.out = out;
	}

	public void run() {
		
		sc = new Scanner(System.in);
		  
		while(true){
			System.out.println("Votre message :");
			message = sc.nextLine();
			out.println(message);
			out.flush();
		}
	}
}
