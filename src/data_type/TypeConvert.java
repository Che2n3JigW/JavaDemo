package data_type;

/**
 * 类型转换
 */
public class TypeConvert {
    public static void main(String[] args) {

        //从低转高 自动转
        char c1='a';//定义一个char类型
        int i1 = c1;//char自动类型转换为int
        System.out.println("char自动类型转换为int后的值等于"+i1);
        char c2 = 'A';//定义一个char类型
        int i2 = c2+1;//char 类型和 int 类型计算
        System.out.println("char类型和int计算后的值等于"+i2);


        castConvert();
    }

    //从高到低 强制转
    private static void castConvert() {
        int i1 = 129;
        String c = "神秘代码wdnmd";
        for (int i = 0; i < c.length(); i++) {
            System.out.println((int)c.charAt(i));
        }
        byte b = (byte)i1;//强制类型转换为byte
        System.out.println("int强制类型转换为byte后的值等于"+b);
    }
}
