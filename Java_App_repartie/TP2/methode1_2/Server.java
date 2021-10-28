package methode1_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//cree socket de serveur
	ServerSocket ss=new ServerSocket(1235);
	System.out.println("serveur attand cleint");
	
	Socket s=ss.accept();
	System.out.println("cleint est connecteè");
	
	//lire 
	InputStream is=s.getInputStream();
	InputStreamReader isr=new InputStreamReader(is);
	BufferedReader br=new BufferedReader(isr);
	
	String x=br.readLine();
	System.out.println(x);
	
	String[]cc =x.split(" ");
	int res=0;
	if (cc[1].equals("*")) 
		res=Integer.parseInt(cc[0])*Integer.parseInt(cc[2]);
	
	else if (cc[1].equals("-"))
		res=Integer.parseInt(cc[0])*Integer.parseInt(cc[2]);
	
	else if (cc[1].equals("+"))
		res=Integer.parseInt(cc[0])*Integer.parseInt(cc[2]);
	
	else if (cc[1].equals("/"))
		res=Integer.parseInt(cc[0])*Integer.parseInt(cc[2]);
	System.out.println(cc[0] + " /*-+ " + cc[2]);

	//send
	OutputStream os=s.getOutputStream();
	PrintWriter pw =new PrintWriter(os,true);

	pw.println(res);	
		
		s.close();
	}
}
