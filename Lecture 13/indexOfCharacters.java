public class indexOfCharacters {
    public static void main(String args[])
    {
        String str ="the quick brown fox jumps over the lazy dog.";
        int len,i,j;
        len = str.length();
        for (i=97;i<=122;i++)
        {
            for(j=0;j<len;j++)
            {
                char a = str.charAt(j);
                char c=(char)i; 
                if(a==c)
                {
                    System.out.println("The index of "+c+" is "+j);
                } 
            }
        }        
    }
}
