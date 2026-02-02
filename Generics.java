package Tasks;

public class Generics {

	public static void main(String[] args) {
		Pair<Integer,Integer> pair=new Pair<>(1,2);
		System.out.println(pair.toString());
		
	}
}
class Pair<A,B>{
	A val1;
	B val2;
	Pair(A val1,B val2){
		this.val1=val1;
		this.val2=val2;
	}
	public A getFirst() {
        return val1;
	}
    public B getSecond() {
        return val2;
    }
    public void setFirst(A first) {
        this.val1 = first;
    }

    public void setSecond(B second) {
        this.val2 = second;
    }
    @Override
    public String toString() {
        return "("+val1+", "+val2+")";
    }
}
