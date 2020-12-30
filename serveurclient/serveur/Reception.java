import java.io.*;
import java.io.IOException;


public class Reception implements Runnable {

	private BufferedInputStream in;
	private Object message = null;
	private String login = null;
	
	public Reception(BufferedInputStream in, String login){
		this.in = in;
		this.login = login;
	}
	
	public void run() {
		
		while(true){
	        try {
				message = in.read();
				System.out.println(login+" : "+message);
		    } 
		    catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
