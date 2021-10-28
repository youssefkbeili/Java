package methode1_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub

	//creè socket cotè client
		Socket s=new Socket("localhost",1235);
		
	Scanner sc=new Scanner(System.in);
	OutputStream os=s.getOutputStream();
	PrintWriter pw =new PrintWriter(os);
	
	System.out.println("donner sur la forme a + b:");
	String x=sc.nextLine();
	
	//envoyer a serveur
	pw.println(x);
		
	
	//read
			InputStream in =s.getInputStream();
			InputStreamReader isr= new InputStreamReader(in);
			BufferedReader br = new BufferedReader(isr);
			System.out.println(x+"="+br.readLine());
			
	//fermeture socket
	s.close();
	}

}
