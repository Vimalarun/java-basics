class MutipleParameter<T1,T2>
{
    T1 name;
    T2 number;
    MutipleParameter(T1 name,T2 nummber){
        this.name = name;
        this.number = number;
    }
    public void display(){
        System.out.println(name);
        System.out.println(number);
    }
}

class Main
{
    public static void main(String args[])
    {
        MutipleParameter<String,Integer> obj = new MutipleParameter<String,Integer>("John",15);
        obj.display();
    }
}