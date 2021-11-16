public class threads
{   
    public static void main(String[] args)
    {
        Thread t = new Thread(new A()); 
        Thread t1 = new Thread(new B()); 
        Thread t2 = new Thread(new C()); 

        t.start();;
        t1.start();
        t2.start();
    }
}

class A implements Runnable
{
    public void run()
    {
        for(int i=0;i<100;i++) 
        { 
            System.out.print(" a ");
        } 
    }
}

class B implements Runnable
{
    public void run()
    {
        for(int i=0;i<100;i++) 
        { 
            System.out.print(" b ");
        }
    }
}


class C implements Runnable
{
    public void run()
    {
        for(int i=1;i<=100;i++) 
        { 
            System.out.print(" "+i+" ");
        }
    }
}


