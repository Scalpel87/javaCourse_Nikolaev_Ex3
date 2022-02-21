public class Main4 {
    public static void main(String[] args) {
        System.out.println(factorial(3));
    }
    private static int factorial(int num){
        if (num < 1)
            return 0;
        if (num == 1)
            return 1;
        return num * factorial(num - 1);
    }
    //factorial(3) | factorial(3)*factorial(3-1)...*factorial(1) |
}
