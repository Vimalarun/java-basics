package customhashmap;

public class customHashMap<K,V> {
    
    static class Entry<K,V>{
        K key;
        V value;
        Entry<K,V> next;
        public Entry(K key, V value, Entry<K,V> next){
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }
    
    private Entry<K,V> bucket[];
    private int capacity=16;
    private int size=0;

    public customHashMap(){
        bucket = new Entry[capacity];
    }

    public int getHashCode(K key){
        System.out.println("Hashcode "+key.hashCode());
        System.out.println("hash= "+ Math.abs(key.hashCode())%capacity);
        return Math.abs(key.hashCode())%capacity;
    }


    public void put(K insKey, V insValue){
        if(insKey == null){
            System.out.println("Key should not be null");
        }
        int hash=getHashCode(insKey);
        Entry<K,V> e = new Entry<>(insKey, insValue, null);
        if(bucket[hash] == null){
            bucket[hash] = e;
        }
        else{
            Entry<K,V> curr=bucket[hash],prev=null;
            while(curr!=null){
                if(curr.key.equals(insKey)){
                    if(prev == null){
                        e.next = curr.next;
                        bucket[hash] = e;
                    }
                    else{
                        e.next = curr.next;
                        prev.next = e;
                    }
                }
                prev = curr;
                curr = curr.next;
            }
            prev.next = e;
        }
        size++;
    }

    public V get(K key){
        int hash = getHashCode(key);
        if(bucket[hash] == null){
            System.out.println("There is no record available");
            return null;
        }
        else{
            Entry<K,V> e = bucket[hash];
            while(e!=null){
                if(e.key.equals(key)){
                    return e.value;
                }
                e = e.next;
            }
            return null;
        }
    }

    public boolean remove(K delKey){
        int hash = getHashCode(delKey);
        size--;
        if(bucket[hash] == null){
            return false;
        }
        else{
            Entry<K,V> curr=bucket[hash],prev=null;
            while(curr!=null){
                if(curr.key.equals(delKey)){
                    if(prev == null){
                        bucket[hash] = bucket[hash].next;
                        return true;
                    }
                    else{
                        prev.next = curr.next;
                        return true;
                    }
                }
                prev = curr;
                curr = curr.next;
            }
            return false;
        }
    }

    public void clearHashMap(){
        for(int i=0;i<capacity;i++){
            bucket[i] = null;
        }
    }

    public boolean contanisKey(K key){
        int hash = getHashCode(key);
        Entry<K,V> e = bucket[hash];
        while(e!=null){
            if(e.key.equals(key))
                return true;
            e = e.next;
        }
        return false;
    }

    public boolean contanisValue(V value){
        for(int i=0;i<capacity;i++){
            Entry<K,V> e = bucket[i];
            while(e!=null){
                if(e.value.equals(value)){
                    return true;
                }
                e=e.next;
            }     
        }
        return false;
    }

    public boolean isEmpty(){
        for(int i=0;i<capacity;i++){
            if(bucket[i] != null)
                return false;
       }
       return true;
    }

    public int size(){
        return size;
    }

    public void display(){
        boolean flag = false;
        for(int i=0;i<capacity;i++){
                if(bucket[i]!=null){
                    Entry<K,V> e = bucket[i];
                    while(e!=null){
                        System.out.println("{"+e.key+"="+e.value+"}");
                        e=e.next;
                    }
                    flag = true;
            }
        }
        if(flag == false)
            System.out.println("{}");
    }
}
