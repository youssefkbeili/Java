package methode2;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub

		Socket s = new Socket("localhost", 1234);

        System.out.println("je suis connecté");

        s.close();
	}

}
