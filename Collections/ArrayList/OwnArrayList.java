
class Arraylist
{
    static int indx = -1;
    static int size = 0;
    public int array[] = null;

    void initializeArray(){
        array = new int[5];
    }

    int[] increaseSize(int array[])
    {
        int newArr[] = new int[array.length+1];
        for(int i=0;i<array.length;i++)
        {
            newArr[i] = array[i];
        }
        return newArr;

    }

    int[] decreaseSize(int array[]){
        int newArr[] = new int[size];
        for(int i=0;i<size;i++)
        {
            newArr[i] = array[i];
        }
        return newArr;
    }

    boolean isEmpty(){
        if(array == null)
            return true;
        else{
            for(int i=0;i<array.length;i++){
                if(array[i]!=0)
                    return false;
            }
        }
        return true;
    }

    void add(int element)
    {
        if(isEmpty())
            initializeArray();

        if(size>=array.length)
            array = increaseSize(array);
        indx++;
        size++;
        array[indx] = element;
    } 

    void add(int index,int element)
    {
        if(isEmpty())
            initializeArray();
        else if(index>array.length || size>=array.length)
            array = increaseSize(array);
        for(int i=indx;i>=index-1;i--)
        {
            array[i+1]=array[i];
        }
        array[index-1]=element;
        indx++;
        size++;
    }


    void print(){
        for(int i=0;i<array.length;i++)
            System.out.print(array[i]+" ");
        System.out.println();
    }

    void clear(){
        array = null;
        indx = 0;
    }

    int get(int index)
    {
        if(index>size || isEmpty())
            return -1;
        return array[index-1];
    } 

    int set(int index,int element)
    {
        if(index>size || isEmpty())
            return -1;
        int temp = array[index-1];
        array[index-1] = element;
        return temp;
    }

    int lastIndexOF(int element){
        if(isEmpty())
            return -1;
        for(int i=indx;i>=0;i--)
        {
            if(array[i]==element)
                return i;
        }
        return -1;
    }

    int indexOf(int element)
    {
        if(isEmpty())
            return -1;
        for(int i=0;i<size;i++)
        {
            if(array[i]==element)
                return i;
        }   
        return -1;
    }

    boolean contains(int element){
        if(isEmpty())
            return false;
        for(int i=0;i<size;i++){
            if(array[i]==element)
                return true;
        }
        return false;
    }

    boolean remove(int index){
        if(isEmpty() || index>size)
            return false;
        else if(size==1)
            array[0]=0;
        else{
            for(int i=index;i<size;i++)
            {
                array[i-1]=array[i];
            }
        }
        array[indx]=0;
        indx--;
        size--;
        array = decreaseSize(array);
        return true;
    }

    int size(){
        return size;
    }
}

public class OwnArrayList
{
    public static void main(String[] args)
    {
        Arraylist arr = new Arraylist();
        // System.out.println(arr.isEmpty());
        arr.add(0);
        arr.print();
        arr.remove(1);
        arr.print();
        System.out.println(arr.isEmpty());
    }
}