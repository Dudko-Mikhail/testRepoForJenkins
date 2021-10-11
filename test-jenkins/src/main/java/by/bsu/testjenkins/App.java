package by.bsu.testjenkins;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
	System.out.println("second_build");
    }

    public static int coveredMethod(int a) {
        System.out.println("more lines");
        System.out.println("need");
        System.out.println("to be covered");
        return a;
    }
}
