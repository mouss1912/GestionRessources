import java.io.*;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;


public class Chat_ClientServeur implements Runnable {

	private Socket socket = null;
	private BufferedInputStream in = null;
	private PrintStream out = null;
	private String login = "zero";
	private Thread t3, t4;
	
	
	public Chat_ClientServeur(Socket s, String log){
		socket = s;
		login = log;
	}

	public void run() {
		
		try {
			//in = new BufferedInputStream(new InputStreamReader(socket.getInputStream()));
			out = new PrintStream(socket.getOutputStream());
			
			Thread t3 = new Thread(new Reception(in, login));
			t3.start();
			Thread t4 = new Thread(new Emission(out));
			t4.start();
		
		} 
		catch (IOException e) {
			System.err.println(login + " s'est déconnecté ");
		}
	}

	
}
