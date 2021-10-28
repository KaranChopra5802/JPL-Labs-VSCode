import java.util.*;

public class Vector_Integer {
   public static void main(String[] args) {

        System.out.println("The examples used is the list of prime numbers.");

        int capacity,elementAt,elementFirst,indexOf,elementLast,indexLast,size;
        boolean con,empty;
        Vector<Integer> vector = new Vector<>();        

        vector.add(2);
        System.out.println("The vector after add(2) is : " + vector);

        vector.addElement(3);
        System.out.println("The vector after addElement(3) is : " + vector);

        capacity = vector.capacity();
        System.out.println("The vector capacity is : " + capacity);

        vector.clear();
        System.out.println("The vector after clear() is : " + vector);

        System.out.println();

        vector.add(2);
        vector.add(3);
        System.out.println("The new vector is : " + vector);

        System.out.println();

        Object copy_vector = vector.clone();
        System.out.println("The cloned vector is : " + copy_vector);

        con = vector.contains(4);
        System.out.println("The vector contains 4 ? " + con);

        elementAt = vector.elementAt(1);
        System.out.println("The element at index positon 1 is : " + elementAt);

        elementFirst = vector.firstElement();
        System.out.println("The first element is : " + elementFirst);

        indexOf = vector.indexOf(3);
        System.out.println("The index of element 3 is : " + indexOf);

        vector.insertElementAt(5, 1);
        System.out.println("The vector after insertElement(5,1) is : " + vector);   

        empty = vector.isEmpty();
        System.out.println("The vector is empty ? " + empty);

        elementLast = vector.lastElement();
        System.out.println("The last element is : " + elementLast);

        indexLast = vector.lastIndexOf(5);
        System.out.println("The last index of 5 is : " + indexLast);

        vector.remove(1);
        System.out.println("The vector after vector.remove(1) is : " + vector);  

        vector.removeAllElements();
        System.out.println("The vector after vector.removeAllElements() is : " + vector); 

        System.out.println();

        vector.add(2);
        vector.add(3);
        vector.add(5);
        vector.add(7);
        vector.add(11);
        System.out.println("The new vector is : " + vector);

        System.out.println();

        vector.removeElementAt(1);
        System.out.println("The vector after vector.removeElementAt(1) is : " + vector); 

        vector.removeElement(2);
        System.out.println("The vector after vector.removeElement(2) is : " + vector); 

        vector.removeElementAt(0);
        System.out.println("The vector after vector.removeElementAt(0)) is : " + vector);

        vector.setSize(5);
        size = vector.size();
        System.out.println("The new size of the vector after vector.setSize(5) is : " + size);

    }    
}