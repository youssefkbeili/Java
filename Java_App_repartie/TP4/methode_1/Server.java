package methode_1;

	import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
	import java.net.Socket;
	public class Server {

		public static void main(String[] args) throws IOException, ClassNotFoundException {
			// TODO Auto-generated method stub
	  
			//pour calculer le nombre de client visiteè
			int count=0;
			
			//cree socket cote server
			ServerSocket ss=new ServerSocket(1234);
			System.out.println("Le serveur attend la connexion d'un client");
			
			while(true){
			Socket s=ss.accept();
			ClientProcess Client=new ClientProcess(s);
			count++;
			
			InputStream in=s.getInputStream();
			ObjectInputStream ois=new ObjectInputStream(in);
			
			Operation o=(Operation) ois.readObject();
			
			int x=o.x;
			int y=o.y;
			char op=o.op;
		int res=0;
		//pour convertir vers string
		String st=String.valueOf(o.op);
		  
		switch(st){
					   case"+":res=x+y;break ;
					   case"-":res=x-y;break ;
					   case"*":res=x*y;break ;
					   case"/":res=x/y;
		   }
		OutputStream os= s.getOutputStream();
		PrintWriter pw = new PrintWriter(os, true);
		System.out.println("un client est connecté de nombre="+count+" res="+res);
		pw.println(res);
		
			s.close();
			}	
			
		
		}

	}