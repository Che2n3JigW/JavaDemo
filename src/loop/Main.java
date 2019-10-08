package loop;

public class Main {
    public static void main(String[] args) {

//        whileDemo();

//        doWhileDemo();

//        forDemo();

//        forDemo1();

        forBreak();

        forContinue();

    }

    private static void forContinue() {
        int [] numbers = {10, 20, 30, 40, 50};

        for(int x : numbers ) {
            if( x == 30 ) {
                continue;
            }
            System.out.print( x );
            System.out.print("\n");
        }
    }

    private static void forBreak() {
        int [] numbers = {10, 20, 30, 40, 50};

        for(int x : numbers ) {
            if( x == 30 ) {
                break;
            }
            System.out.print( x );
            System.out.print("\n");
        }
    }

    private static void forDemo1() {
        String[] letters = {"a", "b", "c", "d", "e", "f", "g"};
        for (String letter : letters) {
            System.out.println(letter);
        }

    }

    private static void forDemo() {
        for (int x = 10; x < 20; x++) {
            System.out.print("value of x : " + x);
            System.out.print("\n");
        }
    }

    private static void doWhileDemo() {
        int x = 10;
        do {
            System.out.print("value of x : " + x);
            x++;
            System.out.print("\n");
        } while (x < 20);
    }

    private static void whileDemo() {
        int x = 10;
        while (x < 20) {
            System.out.print("value of x : " + x);
            x++;
            System.out.print("\n");
        }
    }
}
