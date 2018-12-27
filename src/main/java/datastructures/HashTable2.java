package datastructures;

public class HashTable2 {
	
	int INIITIAL_SIZE = 16;
	HashEntry[] data = null;
	private class HashEntry{
		String key;
		String value;
		HashEntry next;
		
		public HashEntry(String key, String value, HashEntry next ) {
			this.key = key;
			this.value = value;
			this.next = null;
	}
		
	}
	
	public void put(String key, String value) {
		
		if(data == null) {
			data = new HashEntry[INIITIAL_SIZE];
		}
		
		HashEntry entry = new HashEntry(key, value, null);
		
		int index = getIndex(key);
		
		if(data[index] == null) {
			data[index] = entry;
		 } else {  // handle collisions
			 HashEntry entries = data[index];
			 
			for(int i=0; entries.next != null; i++) {
			    entries = entries.next;	
			}
			entries.next = entry;
			 
		 }
	}
	
	public String get(String key) {
		
		int index = getIndex(key);
		
		if(data[index] == null) {
			return null;
		} else {
			HashEntry entries = data[index];
			if(entries.next == null) {
				return entries.value;
			}
			while(entries.next != null) {
				
				if(!entries.key.equals(key)) {
					entries = entries.next;
				}
			
				return entries.value;
			}
		}
		
		
		return null;
			
	}

	private int getIndex(String key) {
		
	    int hashCode = key.hashCode();
	    
	    int index = (hashCode & 0x7fffffff) % INIITIAL_SIZE;
	    //int index = hashCode % INIITIAL_SIZE;
	    
	    
	    if(key.equals("John Smith") || key.equals("Sandra Dee"))
	    	index = 4;
	    
	    System.out.println("index =="+index);
	    
	    
	   
		return index;
	}

	

}
