class genericFunction
{   
    public static <T> void genericFun(T element)
    {
        System.out.println(element);
    }

    public static void main(String[] args)
    {
        genericFun(10);
        genericFun(10.5);
        genericFun('a');
        genericFun("abc");
    }
}