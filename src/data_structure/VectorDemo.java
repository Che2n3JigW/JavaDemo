package data_structure;

import java.util.Vector;

/**
 * Vector 是同步访问的。
 * Vector 包含了许多传统的方法，这些方法不属于集合框架。
 * Vector 主要用在事先不知道数组的大小，或者只是需要一个可以改变大小的数组的情况
 */
public class VectorDemo {
    public static void main(String args[]) {
        // initial size is 3, increment is 2
        Vector<Integer> v = new Vector<>(3,2);
        System.out.println("Initial size: " + v.size());
        System.out.println("Initial capacity: " +
                v.capacity());
        v.addElement(1);
        v.addElement(2);
        v.addElement(3);
        v.addElement(4);
        v.addElement(5);
        System.out.println("Capacity after four additions: " +
                v.capacity());
        System.out.println(v.size());
        for (Integer integer : v) {
            System.out.println(integer);
        }
//        v.addElement(5.45);
//        System.out.println("Current capacity: " +
//                v.capacity());
//        v.addElement(new Double(6.08));
//        v.addElement(new Integer(7));
//        System.out.println("Current capacity: " +
//                v.capacity());
//        v.addElement(new Float(9.4));
//        v.addElement(new Integer(10));
//        System.out.println("Current capacity: " +
//                v.capacity());
//        v.addElement(new Integer(11));
//        v.addElement(new Integer(12));
//        System.out.println("First element: " +
//                (Integer)v.firstElement());
//        System.out.println("Last element: " +
//                (Integer)v.lastElement());
//        if(v.contains(new Integer(3)))
//            System.out.println("Vector contains 3.");
//        // enumerate the elements in the vector.
//        Enumeration vEnum = v.elements();
//        System.out.println("\nElements in vector:");
//        while(vEnum.hasMoreElements())
//            System.out.print(vEnum.nextElement() + " ");
//        System.out.println();
    }
}
