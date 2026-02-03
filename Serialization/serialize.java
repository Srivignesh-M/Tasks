package Tasks.Serialization;

import java.io.*;

public class serialize {
	public static void main(String[] args)throws Exception {
	User admin=new User(1,"ceo");
	User md=new User(2,"MD");
	FileOutputStream fout=new FileOutputStream("user.txt");
	ObjectOutputStream out=new ObjectOutputStream(fout);
	out.writeObject(admin);
	out.writeObject(md);
	out.close();
	fout.close();
	
	}
}
