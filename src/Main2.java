import java.util.Scanner;

public class Main2 {

    private static final String DEFAULT_STR = "-";

    public static void main(String[] args) {
        /*System.out.println("A");
        System.out.println("B");
        System.out.println("C");
        System.out.println("D");
        System.out.println("E");
        System.out.println("F");*/

        System.out.println(DEFAULT_STR);

        print("Max");
        print("Anton");
        Test test = new Test();
        test.test1();

        boolean isAdminResult = isAdmin("Max");
        System.out.println(isAdminResult);
        System.out.println(isAdult(45));
        printAllParams("Serg", 34, 185F);
    }

    //public | private | protected | default

    public static void print(String name){
        if (isAdmin(name))
            System.out.println("Hello, Admin!");
        else
            System.out.printf("Hello, %s!\n", name);
    }

    public static boolean isAdmin(String name){
        return name.equals("Max");
    }

    static String isAdult(int age){
        return age > 18 ? "Is an adult" : "Is a child";
    }

    private static void printAllParams(String name, int age, float height){
        System.out.printf("My name is %s, age: %d, height: %.1f", name, age, height);
    }

    /*private static int sum(int... nums){
        int sum = 0;
        for (:
             ) {

        }
    }*/
}
