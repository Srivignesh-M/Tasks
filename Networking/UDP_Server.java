package Tasks.Networking;
import java.io.*;
import java.net.*;
public class UDP_Server {
public static void main(String[] args) throws IOException{
	DatagramSocket ds=new DatagramSocket(9999);
	byte[] input=new byte[9];
	DatagramPacket dp=new DatagramPacket(input,9);
	ds.receive(dp);
	String msg=new String(dp.getData());
	System.out.println(msg);
}
}
