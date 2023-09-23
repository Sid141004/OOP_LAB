class counter
{
    static int count = 0;
    public counter()
    {
        count++;
    }
    int get_count()
    {
        return count;
    }
}

public class labcount {
    public static void main(String args[]){
    counter ob1 = new counter();
    counter ob2 = new counter();
    counter ob3 = new counter();
    counter ob4 = new counter();
    counter ob5 = new counter();
    counter ob6 = new counter();
    System.out.println(ob6.get_count());}
}
