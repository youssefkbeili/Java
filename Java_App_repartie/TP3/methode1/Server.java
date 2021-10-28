package methode1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
  
		//pour calculer le nombre de client visiteè
		int count=1;
		
		//cree socket cote server
		ServerSocket ss=new ServerSocket(1234);
		System.out.println("Le serveur attend la connexion d'un client");
		
		while(true){
		Socket s=ss.accept();
		System.out.println("un client est connecté de nombre="+count);
		ClientProcess Client=new ClientProcess(s);
		count++;
		s.close();
		}	
		
	
	}

}
