package methode_2;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	public static void main (String []args) throws IOException, ClassNotFoundException {
		
		//cree socket cote server
		ServerSocket ss=new ServerSocket(1234);
		System.out.println("serveur attand client");
		Socket s=ss.accept();
		System.out.println("client conecteè");
		
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
		pw.println(res);
	}

}
