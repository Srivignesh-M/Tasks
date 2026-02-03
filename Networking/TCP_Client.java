package Tasks.Networking;

import java.io.*;
import java.net.*;

public class TCP_Client {
	public static void main(String[]args) {
		try (Socket s = new Socket("localhost",9090)) {
			
			DataInputStream datain=new DataInputStream(s.getInputStream());
			String msg=datain.readUTF();
			System.out.println(msg);
			datain.close();
		}
		catch(IOException e) {
			System.out.println(e);
		}
}
}
