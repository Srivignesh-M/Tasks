package Tasks.Networking;
import java.io.*;
import java.net.*;
public class UDP_Client {
	public static void main(String[] args) throws IOException {
		DatagramSocket ds=new DatagramSocket();
		String msg="Hi client";
		InetAddress ip=InetAddress.getByName("localhost");
		DatagramPacket dp=new DatagramPacket(msg.getBytes(),msg.length(),ip,9999);
		ds.send(dp);
		ds.close();
	}
}
