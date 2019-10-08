package operator;

/**
 * 运算符Demo
 */
public class OperatorDemo {

    //展示结果
    private static final int SHOW_RESULT = 3;

    public static void main(String[] args) {

        switch (SHOW_RESULT) {
            case 1:
                //算术运算符
                operator1();
                break;
            case 2:
                //关系运算符
                operator2();
                break;
            case 3:
                //位运算符
                operator3();
                break;
            case 4:
                //逻辑运算符
                operator4();
                break;
            case 5:
                //赋值运算符
                operator5();
                break;
            case 6:
                //条件运算符
                int a, b;
                a = 10;
                b = (a == 1) ? 20 : 30;
                System.out.println("Value of b is : " + b);
                b = (a == 10) ? 20 : 30;
                System.out.println("Value of b is : " + b);
                break;


        }


    }

    private static void operator5() {
        int a = 10;
        int b = 20;
        int c = 0;
        c = a + b;
        System.out.println("c = a + b = " + c);
        c += a;
        System.out.println("c += a  = " + c);
        c -= a;
        System.out.println("c -= a = " + c);
        c *= a;
        System.out.println("c *= a = " + c);
        a = 10;
        c = 15;
        c /= a;
        System.out.println("c /= a = " + c);
        a = 10;
        c = 15;
        c %= a;
        System.out.println("c %= a  = " + c);
        c <<= 2;
        System.out.println("c <<= 2 = " + c);
        c >>= 2;
        System.out.println("c >>= 2 = " + c);
        c >>= 2;
        System.out.println("c >>= a = " + c);
        c &= a;
        System.out.println("c &= a = " + c);
        c ^= a;
        System.out.println("c ^= a = " + c);
        c |= a;
        System.out.println("c |= a = " + c);
    }

    private static void operator4() {
        boolean a = true;
        boolean b = false;
        System.out.println("a && b = " + (a && b));
        System.out.println("a || b = " + (a || b));
        System.out.println("!(a && b) = " + !(a && b));
    }

    /**
     * ＆按位与操作符，当且仅当两个操作数的某一位都非0时候结果的该位才为1。
     * |按位或操作符，只要两个操作数的某一位有一个非0时候结果的该位就为1。
     * ^按位异或操作符，两个操作数的某一位不相同时候结果的该位就为1
     * ~按位补运算符翻转操作数的每一位。
     * <<按位左移运算符。左操作数按位左移右操作数指定的位数。
     * >>按位右移运算符。左操作数按位右移右操作数指定的位数。
     * >>>	按位右移补零操作符。左操作数的值按右操作数指定的位数右移，移动得到的空位以零填充。
     */
    private static void operator3() {
//nt a = 60;
//00000000000000000000000000111100
//11111111111111111111111111000011
//System.out.println(Integer.toBinaryString(a));
//System.out.println(Integer.toBinaryString(~a));
        int a = 60; /* 60 = 0011 1100 */
        int b = 13; /* 13 = 0000 1101 */
        int c = 0;
        c = a & b;       /* 12 = 0000 1100 */
        System.out.println("a & b = " + c);

        c = a | b;       /* 61 = 0011 1101 */
        System.out.println("a | b = " + c);

        c = a ^ b;       /* 49 = 0011 0001 */
        System.out.println("a ^ b = " + c);

        c = ~a;          /*-61 = 1100 0011 */
        System.out.println("~a = " + c);

        c = a << 2;     /* 240 = 1111 0000 */
        System.out.println("a << 2 = " + c);
        c = a >> 2;     /* 15 = 1111 */
        System.out.println("a >> 2  = " + c);

        c = a >>> 3;     /* 215 = 0000 1111 */
        System.out.println("a >>> 3 = " + c);

    }

    /**
     * ==
     * !=
     * >
     * <
     * <=
     * >=
     */
    private static void operator2() {
        int a = 10;
        int b = 20;
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));
        System.out.println("a > b = " + (a > b));
        System.out.println("a < b = " + (a < b));
        System.out.println("b >= a = " + (b >= a));
        System.out.println("b <= a = " + (b <= a));
    }


    /**
     * 加减乘除
     * 余数
     * 自增自减
     */
    private static void operator1() {
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("b % a = " + (b % a));
        System.out.println("c % a = " + (c % a));
        System.out.println("a++   = " + (a++));
        System.out.println("a--   = " + (a--));
        // 查看  d++ 与 ++d 的不同
        System.out.println("d     = " + d);
        System.out.println("d++   = " + (d++));
        System.out.println("d     = " + d);
        System.out.println("++d   = " + (++d));
    }


}
