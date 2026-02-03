package Tasks.Serialization;

import java.io.Serializable;

public class User implements Serializable {
	int id;
	String name;
	User(int id,String name){
		this.id=id;
		this.name=name;
	}
}
