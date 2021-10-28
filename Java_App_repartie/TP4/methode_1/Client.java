package methode_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {

		//cree socket cote client
		Socket s = new Socket("localhost",1234);
          System.out.println("je suis connecté");
          
          Scanner sc=new Scanner(System.in);
          int res,x,y;
          char op;
          
      
          System.out.println("donner x=");
  		x=sc.nextInt();
  		System.out.println("donner y=");
  		y=sc.nextInt();
  		System.out.println("donner op=");
  		op=sc.next().charAt(0);
  		
  		OutputStream os=s.getOutputStream();
  		ObjectOutputStream oos=new ObjectOutputStream(os);
  		Operation o1=new Operation(x,y,op);
  		oos.writeObject(o1);
  		
  		
  		InputStream in =s.getInputStream();
		InputStreamReader isr= new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println(o1.toString()+br.readLine());
         
          
          s.close();
	}

}


