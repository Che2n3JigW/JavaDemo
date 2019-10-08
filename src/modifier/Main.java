package modifier;

import static modifier.Main.FATHER;

public class Main {
    //所有类可见
    public String name = "ganLe";
    //当前类可见
    private int age = 22;
    //同一包内可见
    protected int height = 172;

    //类变量
    public static boolean HAS_HAIR = true;

    //定义后不能修改
    public static final String FATHER = "cyh";



    public static void main(String[] args) {

    }
}
class Demo{
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.name + " , " + main.height);
        boolean hasHair = Main.HAS_HAIR;
        System.out.println(hasHair);
        System.out.println(FATHER);
    }
}
