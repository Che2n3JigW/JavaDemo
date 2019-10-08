package array;

import java.math.BigDecimal;

public class ArrayDemo {
    public static void main(String[] args) {
        double[] myList = {1.9, 3.5, 3.4, 2.9, 5};
        for (double v : myList) {
            System.out.println(v + " ");
        }

        // 计算所有元素的总和
        double total = 0;
        for (double v : myList) {
            total = add(total, v);
        }
        System.out.println("Total is " + total);


        // 查找最大元素
        double max = myList[0];
        for (double v : myList) {
            if (v > max) {
                max = v;
            }
        }
        System.out.println("Max is " + max);
    }

    private static double add(double v1, double v2) {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.add(b2).doubleValue();
    }
}
