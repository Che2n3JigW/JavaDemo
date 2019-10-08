/**
 * Java第一个项目
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Juice juice = new Juice();
        juice.size = Juice.JuiceSize.SMALL;
        System.out.println(juice.toString());

    }
}

/**
 * 枚举测试(果汁)
 */
class Juice {
    enum JuiceSize {
        SMALL,  //小杯
        MEDIUM, //中杯
        LARGE   //大杯
    }

    JuiceSize size;

    @Override
    public String toString() {
        return "Juice{" +
                "size=" + size +
                '}';
    }
}
