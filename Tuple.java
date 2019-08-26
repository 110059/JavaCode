
public class Tuple {
	
	private int key;
	private int value;
	
	public Tuple(int keyA, int valueA) {
		this.key = keyA;
		this.value = valueA;
	}
	
	public int getKey() {
		return this.key;
	}
	
	public int getValue() {
		return this.value;
	}
	
	@Override
	public String toString() {
		return "["+ key + "," + value +"]";
	}
}
