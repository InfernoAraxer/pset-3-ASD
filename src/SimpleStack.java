public class SimpleStack {

	public static String[] data;
	public static int size;
	
	public SimpleStack() {
		data = new String[0];
		size = 0;
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
		String removed = data[size-1];
		if (size == 0) {
			throw new IndexOutOfBoundsException();
		} else {
			data[size-1] = null;
			size--;
			return removed;
		}
	}

	public void push(String s) {
		addSpace();
		size++;
		data[size-1] = s;
	}
	
	public int search(String s) {
		for (int x = 0; x < size; x++) {
			if (data[x] == s) return size-x;
		}
		return -1;
	}
	
	public String toString() {
		String concat = "[";
		for (int x = 0; x < size - 1; x++) {
			concat += data[x] + ", ";
		}
		concat += (size != 0) ? data[size - 1] + "]" : "]" ;
		return concat;
	}
	
	public void addSpace() {
		if (data.length == size) {
			String[] temp = new String[size + 10];
			for(int x = 0; x < size; x++) {
				temp[x] = data[x];
			}
			data = temp;
		}
	}
}
