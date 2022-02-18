class sampleGenerics<T>
{
    private T t;
    public T get(){
        return t;
    }
    public void set(T t){
        this.t = t;
    }

    public static void main(String args[])
    {
        sampleGenerics<Integer> g = new sampleGenerics<Integer>();
        g.set(2);
        g.set(2.5);//compile time error

    }
}
