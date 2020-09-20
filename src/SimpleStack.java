public class SimpleStack {

	public static String[] data;
	public static int size;
	
	public SimpleStack() {
		data = new String[0];
		size = 0;
	}
	
	public static void main(String[] args) {
		SimpleStack simpleStack = new SimpleStack();
		simpleStack.push("first in");
        simpleStack.push("second in");
        simpleStack.push("third in");
        simpleStack.push("last in");
		System.out.println(simpleStack.search("last in"));
	}
	
	public boolean empty() {
		return (size == 0) ? true : false;
	}
	
	public String peek() {
		if (size == 0) {
			throw new IndexOutOfBoundsException("Index " + size + " out of bounds for length " + size);
		} else {
			return data[size-1];
		}
	}
	public String pop() {
		String removed = data[size - 1];
		if (size == 0) {
			throw new IndexOutOfBoundsException();
		} else {
			String[] temp = new String[size-1];
			for (int x = 0; x < size - 1; x++) {
				temp[x] = data[x];
			}
			data = new String[size - 1];
			data = temp;
			size--;
			if (size == 0) {
				data = new String[1];
				data[0] = "";
				return data[0];
			}
			return removed;
		}
	}

	public String push(String s) {
		String[] temp = new String[size+1];
		for (int x = 0; x < size; x++) {
			temp[x] = data[x];
		}
		if (s == null) {
			s = "null";
		}
		temp[size] = s;
		data = new String[size+1];
		data = temp;
		size++;
		return s;
	}
	
	public int search(String s) {
		for (int x = 0; x < size; x++) {
			if (data[x] == s) {
				return size - x;
			}
		}
		return -1;
	}
	
	public String toString() {
		String concat = "[";
		if (size == 0) {
			return "[]";
		} else {
			for (int x = 0; x < data.length; x++) {
				if (data[x] != null) {
					concat += data[x];
					concat += ", ";
				}
			}
			concat = concat.substring(0,concat.length()-2);
			return concat += "]";
		}
	}
}
