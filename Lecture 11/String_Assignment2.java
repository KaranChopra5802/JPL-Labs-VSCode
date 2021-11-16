import java.util.Collections;
import java.util.Vector;

public class String_Assignment2
{
    public static void main(String args[])
    {
        int i;
        Vector<String> vector = new Vector<String> ();
        vector.add("Mercury");
        vector.add("Venus");
        vector.add("Earth");
        vector.add("Mars");
        vector.add("Jupiter");
        vector.add("Saturn");
        vector.add("Uranus");
        vector.add("Neptune");
        vector.add("Pluto");
        vector.add("Monday");

        System.out.println("The vector is :" +vector);
        for(i = 0;i < 10;i++)
        {
            String temp = vector.get(i);
            vector.set(i,temp.substring(3));
        }

        System.out.println("The new vector is :" +vector);

        Collections.sort(vector);

        System.out.println("The vector after sorting alphabetically is :" +vector);

    }
}
