public class Main3 {
    private static final String DEFAULT_STR = "-";

    public static void main(String[] args) {
        final String DEFAULT_NAME;
        DEFAULT_NAME = "Serg";
        System.out.println(DEFAULT_STR);
        System.out.println(Math.PI);
    }
    //1
    private static void printPersonInfo(String name, int age){
        System.out.println("Name: " + name + "\nAge: " + age);
    }
    //2
    private static void printPersonInfo(String name){
        System.out.println("Name: " + name);
    }
}
