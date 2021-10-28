import java.util.*;

public class Vector_Strings {
   public static void main(String[] args) {

        System.out.println("The examples used is the list of Planets.");

        int capacity,indexOf,indexLast,size;
        String elementAt, elementFirst,elementLast;
        boolean con,empty;
        Vector<String> vector = new Vector<>();        

        vector.add("Mercury");
        System.out.println("The vector after add(Mercury) is : " + vector);

        vector.addElement("Venus");
        System.out.println("The vector after addElement(Venus) is : " + vector);

        capacity = vector.capacity();
        System.out.println("The vector capacity is : " + capacity);

        vector.clear();
        System.out.println("The vector after clear() is : " + vector);

        System.out.println();

        vector.add("Mercury");
        vector.add("Venus");
        System.out.println("The new vector is : " + vector);

        System.out.println();

        Object copy_vector = vector.clone();
        System.out.println("The cloned vector is : " + copy_vector);

        con = vector.contains("Earth");
        System.out.println("The vector contains Earth ? " + con);

        elementAt = vector.elementAt(1);
        System.out.println("The element at index positon 1 is : " + elementAt);

        elementFirst = vector.firstElement();
        System.out.println("The first element is : " + elementFirst);

        indexOf = vector.indexOf("Venus");
        System.out.println("The index of element Venus is : " + indexOf);

        vector.insertElementAt("Earth", 1);
        System.out.println("The vector after insertElement(Earth,1) is : " + vector);   

        empty = vector.isEmpty();
        System.out.println("The vector is empty ? " + empty);

        elementLast = vector.lastElement();
        System.out.println("The last element is : " + elementLast);

        indexLast = vector.lastIndexOf("Mercury");
        System.out.println("The last index of Mercury is : " + indexLast);

        vector.remove(1);
        System.out.println("The vector after vector.remove(1) is : " + vector);  

        vector.removeAllElements();
        System.out.println("The vector after vector.removeAllElements() is : " + vector); 

        System.out.println();

        vector.add("Mercury");
        vector.add("Venus");
        vector.add("Earth");
        vector.add("Mars");
        vector.add("Jupiter");
        System.out.println("The new vector is : " + vector);

        System.out.println();

        vector.removeElementAt(1);
        System.out.println("The vector after vector.removeElementAt(1) is : " + vector); 

        vector.removeElement("Mars");
        System.out.println("The vector after vector.removeElement(Mars) is : " + vector); 

        vector.removeElementAt(0);
        System.out.println("The vector after vector.removeElementAt(0) is : " + vector);

        vector.setSize(5);
        size = vector.size();
        System.out.println("The new size of the vector after vector.setSize(5) is : " + size);

    }    
}
