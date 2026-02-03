package Tasks.Serialization;

import java.io.*;

public class deserialize {
	public static void main(String[] args) throws Exception {
		FileInputStream finp=new FileInputStream("user.txt");
		ObjectInputStream oin=new ObjectInputStream(finp);
		User u1=(User)oin.readObject();
		User u2=(User) oin.readObject();
		System.out.println(u1.id+" "+u1.name);
		System.out.println(u2.id+" "+u2.name);
		oin.close();
		finp.close();
	}

}
