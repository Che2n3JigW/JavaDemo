package data_structure;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String args[]) {
        // Create a hash map

        Hashtable<String, Double> balance = new Hashtable<>();
        Enumeration<String> names;
        String str;
        double bal;

        balance.put("Zara", 3434.34);
        balance.put("MaHnaZ", 123.22);
        balance.put("AYan", 1378.00);
        balance.put("Daisy", 99.22);
        balance.put("QaDir", -19.08);

        // Show all balances in hash table.
        names = balance.keys();
        while(names.hasMoreElements()) {
            str = names.nextElement();
            System.out.println(str + ": " +
                    balance.get(str));
        }
        System.out.println();
        // Deposit 1,000 into Zara's account
        bal = balance.get("Zara");
        balance.put("Zara", bal + 1000);
        System.out.println("Zara's new balance: " +
                balance.get("Zara"));

    }
}
