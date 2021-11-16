public class threads2
{
    public static void main(String[] args)
    {
        Fibo t1 = new Fibo();
        Mul t2 = new Mul();
        Alpha t3 = new Alpha();
        Symbol t4 = new Symbol();

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t2.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);

        t1.setName("Thread for Fibonacci");
        t2.setName("Thread for Multiplication Table");

        try
        {
            t3.join();
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        

        System.out.print(" The name for t1 after changing is :" +t1.getName()+" ");
        System.out.print("The name for t2 after changing is :" +t2.getName()+" ");
    }
}

class Fibo extends Thread
{
    public void run()
    {
        int n1=0,n2=1,n3,i;    
        System.out.print(" "+n1+" ");  
        System.out.print(" "+n2+" ");  
    
        for(i=2;i<20;i++)
        {    
            try  
            {  
                Thread.sleep(50);  
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }  
            n3=n1+n2;    
            System.out.print(" "+n3+" ");    
            n1=n2;    
            n2=n3;            
        }  
        
    }   
}

class Mul extends Thread
{
    public void run()
    {
        int i;
        for(i=1;i<=50;i++)
        {
            System.out.print(" 5 * "+i+" = "+(i*5)+" "); 
            Thread.yield();
        }
    }
}

class Alpha extends Thread
{
    public void run()
    {
        char ch;
        for( ch = 'a' ; ch <= 'z' ; ch++)
        {
            try  
            {  
                Thread.sleep(50);  
            }
            catch(InterruptedException e)
            { 
                System.out.println(e);
            }     
            System.out.print(" "+ch+" ");       
        }
    }
}

class Symbol extends Thread{
    public void run()
    {
        int i;
        for(i=1;i<=100;i++)
        {
            System.out.print(" * ");
        }
    }
}
