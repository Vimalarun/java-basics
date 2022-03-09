package hashmap;
import java.util.LinkedList;

public class CustomHashmap<K,V> {
	public int size;
	public LinkedList<Entry<K,V>>[] arr;
	
	public CustomHashmap() {
		arr = new LinkedList[16];
	}
	
	public CustomHashmap(int capacity)
	{	
		arr = new LinkedList[capacity];
	}
	
	public int size()
	{
		return size;
	}
	
	public int getIndex(K key) {
		return key.hashCode();
	}
	
	public void put(K key, V value) {
		int index = getIndex(key)%arr.length;
		if(arr[index]==null) {
			arr[index] = new LinkedList<>();
			arr[index].add(new Entry<>(key, value));
			size++;
		}
		else {
			for(Entry<K,V> e:arr[index]) {
				if(e.key.equals(key)) {
					e.value = value;
				}
			}
		}
		arr[index].add(new Entry<>(key,value));
		size++;
	}
	
	public V get(K key) {
		int index = getIndex(key)%arr.length;
		if(arr[index] == null) return null;
		for(Entry<K,V> e:arr[index]) {
			if(e.key.equals(key)) {
				return e.value;
			}
		}
		return null;
	}
	
	public void remove(K key) {
		if(key == null) return;
		int index = getIndex(key)%arr.length;
		Entry<K,V> remove = null;
		for(Entry<K, V> e:arr[index]) {
			if(e.key.equals(key)) {
				remove=e;
				break;
			}
		}
		if(remove==null) return;
		arr[index].remove(remove);
		size--;
	}
}


class Entry<K,V>
{
	public K key;
	public V value;
	public Entry(K key,V value)
	{
		this.key = key;
		this.value = value;
	}
	
	public K getKey()
	{
		return key;
	}
	public V getValue() {
		return value;
	}
}
