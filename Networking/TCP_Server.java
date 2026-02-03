package Tasks.Networking;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.*;
public class TCP_Server {
	public static void main(String[]args) {
try (ServerSocket ss = new ServerSocket(9090)) {
	Socket s = ss.accept();
	DataOutputStream dataout=new DataOutputStream(s.getOutputStream());
	dataout.writeUTF("Hi client");
	dataout.close();
}
catch(IOException e) {
	System.out.println(e);
}

	}
}
