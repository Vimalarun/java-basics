class Parent
{
    int v;
    public Parent(int no){
        v+=no;
    }
    public int add(int i){
        v+=i;
        return v;
    }
}

class Child extends Parent
{
    public Child(int num){
        super(20);//access parent class constructor using super();
        super.add(30);//calling parent class method using super 
    }
}



class MyClass {
    public static void main(String args[]) {
        Child c = new Child(10);
        System.out.print(c.add(40));
    }
}