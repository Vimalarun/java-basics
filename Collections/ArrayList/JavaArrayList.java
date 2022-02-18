import java.util.Scanner;
import java.util.Arrays;

interface MyIterator{
    boolean hasNext();
    Object next();
}

class OwnIterator implements MyIterator{
    Object arr[];
    int index = -1,count=0;
    OwnIterator(Object array[]){
        arr = array;
        while(arr[count]!=null)
            count++;
    }
    public boolean hasNext(){
        if(arr[index]!=null)
            return true;
        return false;
    }
    public Object next(){
        return arr[index++];
    }
} 

class MyArrayList{
    public Object array[],newArray[];
    int indx = -1;
    public int type;

    MyArrayList(int type){
        this.type = type;

        switch (type){
            case 1:
                array = new Integer[5];
                System.out.println("Integer array is created");
                break;
            case 2:
                array = new Double[5];
                System.out.println("Double array is created");
                break;
            case 3:
                array = new String[5];
                System.out.println("String array is created");
                break;
        }
    }

    boolean isEmpty(){
        if(array[0] == null)
            return true;
        return false;
    }

    Object[] increaseSize(){
        int len = array.length;
        if(type==1)
            newArray = new Integer[2*len];
            // array = Arrays.copyOf(array,len*2);
        else if(type==2)
            newArray = new Double[2*len];
            // array = Arrays.copyOf(array,len*2);
        else if(type==3)
            newArray = new String[2*len];
            // array = Arrays.copyOf(array,len*2);

        for(int i=0;i<=indx;i++){
            newArray[i]=array[i];
        }
        return newArray;

    }

    void add(Object element){
        indx++;
        if(indx>=array.length){
            array = increaseSize();
        }
        array[indx] = element;
    }

    void add(int index,Object element){
        if(indx>=array.length-1){
            array = increaseSize();
        }
        for(int i=indx;i>=index;i--){
            array[i+1]=array[i];
        }
        array[index] = element;
        indx++;
    }

    void remove(int index){
        if(index>indx)
            System.out.println("IndexOutOfBoundsException");
        else{
            for(int i=index;i<=indx;i++){
                array[i]=array[i+1];
             }
            indx--;
        }
    }   

    void remove(Object element){
        int index=-1,i;
        for(i=0;i<indx;i++){
            if(array[i].equals(element)){
                index=i;
                break;
            }
        }
        if(index!=-1)
            remove(i);
    }


    void print(){
        for(int i=0;i<=indx;i++)
            System.out.print(array[i]+" ");
        System.out.println();
    }

    Object get(int index)
    {
        if(index>array.length || index>indx)
        {
            return -1;
        }
        return array[index];
    }

    void set(int index,Object element){
        if(index>indx){
            System.out.println("IndexOutOfBoundsException");
        }
        else{
            array[index]=element;
        }
    }

    boolean contains(Object element){
        for(int i=0;i<=indx;i++){
            if(array[i].equals(element))
                return true;
        }
        return false;
        
    }

    Object indexof(Object element)
    {
        for(int i=0;i<=indx;i++){
            if(array[i].equals(element)){
                return i;
            }
        }
        return -1;
    }

    boolean compareArrayList(MyArrayList obj1,MyArrayList obj2){
        if(obj1.indx != obj2.indx)
            return false;
        for(int i=0;i<indx+1;i++){
            if(obj1.array[i].equals(obj1.array[i]) == false)
                return false;
        }
        return true;
    }

    OwnIterator iterator(){
        OwnIterator i = new OwnIterator(array);
        return i;
    }

}


public class JavaArrayList{
    public static void main(String[] args) {
        System.out.println("Enter the type of array want to create\n 1.Integer\n 2.Double\n 3.String");
        Scanner sc = new Scanner(System.in);
        int type = sc.nextInt();
        MyArrayList marr1 = new MyArrayList(type);
        marr1.add("ABC");
        marr1.add("DEF");
        marr1.add("GHI");
        marr1.add("JKL");
        MyIterator i = marr1.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}