package data_structure;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 枚举（一次获得一个）对象集合中的元素。
 * 这种传统接口已被迭代器取代，在现代代码中已经被很少使用了。
 * 使用在诸如Vector和Properties这些传统类所定义的方法中，
 * 除此之外，还用在一些API类，并且在应用程序中也广泛被使用。
 */
public class EnumerationTest {

    public static void main(String[] args) {
        Enumeration<String> days;
        Vector<String> dayNames = new Vector<>();
        dayNames.add("Sunday");
        dayNames.add("Monday");
        dayNames.add("Tuesday");
        dayNames.add("Wednesday");
        dayNames.add("Thursday");
        dayNames.add("Friday");
        dayNames.add("Saturday");
        days = dayNames.elements();
        while (days.hasMoreElements()){
            System.out.println(days.nextElement());
        }
    }
}
