package methode_1;

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
		
		
		
		Scanner sc =new Scanner(System.in);
		
		//creation soket cote client
		Socket s = new Socket("localhost",1234);
		System.out.println("je suis connecteè");
		int a,b;
		char x ;
		
		System.out.print("Donner n1=");
		a=sc.nextInt();
		System.out.print("Donner n2=");
		b=sc.nextInt();
		System.out.print("Donner x=");
		x=sc.next().charAt(0);
		
		
		OutputStream os= s.getOutputStream();
		PrintWriter pw = new PrintWriter(os, true);
		//Send
		pw.println(a);
		pw.println(b);
		pw.println(x);
		
		
		
		
		//read
		InputStream in =s.getInputStream();
		InputStreamReader isr= new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println(a+x+b+"="+br.readLine());
		
		

		s.close();
	}

}
