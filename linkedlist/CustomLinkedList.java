package linkedlist;

class Node<T> {
    Node<T> next, prev;
    T data;

    Node() {
        this.data = null;
        this.next = null;
        this.prev = null;
    }

    Node(T data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class CustomLinkedList<T> {
    private Node<T> head;
    Node<T> temp, tail;
    Node<T> node;
    int size = 0;

    public CustomLinkedList() {
        head = null;
    }

    public int size(){
    return size;
    }

    public void add(T data) {
        node = new Node<>(data);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        size++;
    }

    public void add(int index, T data) {
        if (index <= size) {
            node = new Node<>(data);
            if (index == size) {
                tail.next = node;
                node.prev = tail;
                tail = node;
            } else {
                int count = 0;
                temp = head;
                while (count < index) {
                    temp = temp.next;
                    count++;
                }
                node.next = temp;
                node.prev = temp.prev;
                temp.prev.next = node;
                temp.prev = node;
                // 0 1 2
                // [|1|] [|2|] [|3|]
                // [|4|]
            }
            size++;
        } else {
            System.out.println("Index beyond limit");
        }
    }

    public void addFirst(T data) {
        node = new Node<>(data);
        node.next = head;
        head.prev = node;
        head = node;
        size++;
    }

    public void addLast(T data) {
        node = new Node<>(data);
        node.prev = tail;
        tail.next = node;
        tail = node;
        size++;
    }

    public void remove() {
        head = head.next;
    }

    public void remove(int index){
        temp = head;
        int count=0;
        if(index>size){
            System.out.println("Index out of bounds");
        }
        else{
            while(temp!=null){
                if(index == count){
                    break;
                }
                count++;
                temp = temp.next;
            }
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
    }

    public void clear() {
        head = null;
    }

    public boolean contains(T data){
        temp = head;
        while(temp!=null){
            if(temp.data == data)
                return true;
            temp = temp.next;
        }
        return false;
    }

    public Object get(int index){
        int count = 0;
        temp = head;
        if(index>size){
            System.out.println("Index out of range");
        }
        else{
            while(count<index){
                if(count == 0){
                    return temp.data;
                }
                temp = temp.next;
                count++;
            }
        }
        return null;
    }


    public Object getFirst(){
        return head.data;
    }

    public Object getLast(){
        return tail.data;
    }

    public int indexOf(T data){
        temp = head;
        int index = 0;
        while(temp!=null){
            if(temp.data == data){
                return index;
            }
            index++;
            temp=temp.next;
        }
        return -1;
    }

    public int lastIndexOf(T data){
        int lastIndex = -1,index=0;
        temp = head;
        while(temp!=null){
            if(temp.data == data && index>lastIndex){
                lastIndex = index;
            }
            temp = temp.next;
            index++;
        }
        if(lastIndex == -1){
            return -1;
        }
        else{
            return lastIndex;
        }
    }

    public boolean offer(T data){
        add(data);
        size++;
        return true;
    }

    public boolean offerFirst(T data){
        addFirst(data);
        size++;
        return true;
    }

    public boolean offerLast(T data){
        addLast(data);
        size++;
        return true;
    }

    public Object peek(){
        return head.data;
    }

    public Object peekFirst(){
        return head.data;
    }

    public Object peekLast(){
        return tail.data;
    }

    public Object poll(){
        temp = head;
        head = head.next;
        return temp;
    }

    public Object pollFirst(){
        temp = head;
        head = head.next;
        return temp;
    }

    public Object pollLast(){
        temp = tail;
        tail = tail.prev;
        return temp;
    }

    public Object[] toArray(){
        Object[] arr = new Object[size];
        int index = 0;
        temp = head;
        while(temp!=null){
            arr[index] = temp.data;
            temp = temp.next;
            index++;
        }
        return arr;
    }

    public void print() {
        if (head == null) {
            System.out.println("[]");
        } else {
            temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

}