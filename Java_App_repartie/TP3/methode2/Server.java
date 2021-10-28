package methode2;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import methode1.ClientProcess;

public class Server {
	public void run() throws IOException {
		
		int count=1;
	
	//cree socket cote server
	ServerSocket ss=new ServerSocket(1234);
	System.out.println("Le serveur attend la connexion d'un client");
	
	while(true){
	Socket s=ss.accept();
	System.out.println("un client est connecté de nombre="+count);
	new ClientProcess(s).start();
	count++;
	s.close();
	}	
	
	}
}
