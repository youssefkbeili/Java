package methode1;

import java.io.IOException;
import java.net.Socket;

public class ClientProcess extends Thread
{
	
	Socket s;

	public ClientProcess(Socket s) {
		super();
		this.s = s;
	}
	
	public void run() {
		
		System.out.println("Le client est connecté !");
	try {
		s.close();
		}
	catch (IOException e) {
		e.printStackTrace();
					      }
												}
	

}
