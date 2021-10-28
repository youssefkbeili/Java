package methode_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	public static void main (String []args) throws UnknownHostException, IOException {
		
		Socket s=new Socket("localhost",1234);
		int x,y;
		char op;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("donner x=");
		x=sc.nextInt();
		System.out.println("donner y=");
		y=sc.nextInt();
		System.out.println("donner op=");
		op=sc.next().charAt(0);
		
		OutputStream os=s.getOutputStream();
		ObjectOutputStream oos=new ObjectOutputStream(os);
		
		oos.writeObject(new Operation(x,y,op));
	
		InputStream in =s.getInputStream();
		InputStreamReader isr= new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println(br.readLine());
	
	
	s.close();
	
	}

}
