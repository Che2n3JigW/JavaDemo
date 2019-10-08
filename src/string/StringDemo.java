package string;

/**
 * StringBuilder不安全,StringBuffer安全
 * StringBuilder快,StringBuffer慢
 */
public class StringDemo {
    public static void main(String[] args) {
        StringBuffer sBuffer = new StringBuffer(" test");
        sBuffer.append(" String Buffer");

        sBuffer.reverse();

        System.out.println(sBuffer);

    }
}
