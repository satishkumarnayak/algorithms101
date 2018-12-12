package datastructures;

public class DynamicArray2<Srring> {
	
	private Object[] data;
	private int size;
	private int initialCapacity;
	
	public DynamicArray2(int initialCapacity) {
		super();
		this.initialCapacity = initialCapacity;
		data = new Object[initialCapacity];
	}
	
	
	public String get(int index) {
		return (String) data[index];
	}
	
	public void set(int index, String obj) {
		data[index] = obj;
	
	//	size++;
	}
	
	
	public void insert(int index, String value) {
		
		resize();
		// copy up elements
		
		for(int j = size; j > index; j--) {
			data[j]=data[j-1];
		}
		// insert the element
		data[index] = value;
		// resize
		
		
	
		size++;
		System.out.println(data);
	}
	
	public void add(String value) {
		data[size]= value;
		size++;
	}
	
	public int size() {
		return size;
	}
	
	
	public void resize() {
		if(size == initialCapacity) {
			Object[] newData = new Object[initialCapacity*2];
			for(int i = 0; i<size; i++) {
				newData[i]=data[i];
			}
			data = newData;
			
			initialCapacity = initialCapacity*2;
		}
	}


	public void delete(int index) {
	
		for(int j = index; j<size-1; j++ ) {
			data[j]= data[j+1];
		}
		size--;
	}


	public boolean isEmpty() {
		if (size == 0)
			return true;
		else
			return false;
	}


	public boolean Contains(String value) {
		for(int i = 0; i<size; i++) {
			if(data[i]==value) {
				return true;
			}
		}
		return false;
	}
	
	

}
