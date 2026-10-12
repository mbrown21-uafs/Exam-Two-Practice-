
	public class MyString {
		char[] buffer;
		int size;
	

	public MyString() {
		buffer = new char[16];
		size = 0;
	
	
}
	
	public MyString(int capacity) {
		if(capacity < 1) {
			buffer = new char[16];
		}else {
			buffer = new char[capacity];
		}
		size = 0;
	}
	
	public void append(char c) {
		int index;
		
		if(size == buffer.length) {
			int newBuffer = buffer.length * 2;
			char[] newBuffer1 = new char[newBuffer];
			
		for(index = 0; index < buffer.length; index++) {
			newBuffer1[index] = buffer[index];
			
			}
		buffer = newBuffer1;
		}
		
		buffer[size] = c;
		size++;
	}
	
	public int length() {
		return size;
	}
	
	public int capacity() {
		return buffer.length;
	}
	
	public char charAt(int index) {
		return buffer[index];
	}
	
	public void insert(int index, char c) {
		
	}
	
	public void delete(int start, int end) {
		
	}
	
	public void reverse() {
	
	}

	
	public void replace(int start, int end, char[] arr) {
	}
}