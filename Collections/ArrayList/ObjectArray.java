// import java.util.Scanner;


class MyArrayList1{
    public Object array[],newArray[];
    int indx = -1;
    public int type;

    MyArrayList1(){
        array = new Object[5];
    }

    boolean isEmpty(){
        if(array[0] == null)
            return true;
        return false;
    }

    // Object[] increaseSize(){
    //     for(int i=0;i<=indx;i++){
    //         newArray[i]=array[i];
    //     }
    //     return newArray;

    // }

    void add(Object element){
        indx++;
        // if(indx>=array.length){
        //     array = increaseSize();
        // }
        array[indx] = element;
    }

    void add(int index,Object element){
        // if(indx>=array.length-1){
        //     array = increaseSize();
        // }
        for(int i=indx;i>=index;i--){
            array[i+1]=array[i];
        }
        array[index] = element;
        indx++;
    }

    void remove(int index){
        for(int i=index;i<=indx;i++){
            array[i]=array[i+1];
        }
        indx--;
    }   

    void remove(Object element){
        int index=-1,i;
        for(i=0;i<indx;i++){
            if(array[i]==element){
                index=i;
                break;
            }
        }
        if(index!=-1)
            remove(i);
    }


    void print(){
        for(int i=0;i<array.length;i++)
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

    // void set(int index,Object element){
        
    // }

}

class ObjectArray{
    public static void main(String[] args) {
        // System.out.println("Enter the type of array want to create\n 1.Integer\n 2.Double\n 3.String");
        // Scanner sc = new Scanner(System.in);
        // int type = sc.nextInt();
        MyArrayList1 marr = new MyArrayList1();
        System.out.println(marr.isEmpty());
        marr.add(20);
        marr.add("Vimal");
        marr.print();
    }
}