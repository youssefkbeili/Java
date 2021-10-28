package methode_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		
		
			//cree socket cote server
			ServerSocket ss=new ServerSocket(1234);
			System.out.println("serveur attand client");
			Socket s=ss.accept();
			System.out.println("client conecteè");
		
		//cree flux de communiquation
			InputStream is=s.getInputStream();
			InputStreamReader isr=new InputStreamReader(is);
			OutputStream os=s.getOutputStream();
		//cree flux de traitement
			BufferedReader br= new BufferedReader(isr);
		//cree flux de traitement
			PrintWriter pw=new PrintWriter(os,true);
		
			//lire les donne envoyer par client
			String a= br.readLine();
			System.out.println(a+" est bein reçu");
			String b= br.readLine();
			System.out.println(b+" est bein reçu");
			String x= br.readLine();
			System.out.println(x+" est bein reçu");
			
			int res=0;
			if (x.equals("*"))
				res=Integer.parseInt(a)*Integer.parseInt(b);
			
			else if (x.equals("-"))
				res=Integer.parseInt(a)-Integer.parseInt(b);
			
			else if (x.equals("+"))
				res=Integer.parseInt(a)+Integer.parseInt(b);
			
			else if (x.equals("/"))
				res=Integer.parseInt(a)/Integer.parseInt(b);
			
			pw.println(res);
			s.close();	
			
		}
	}