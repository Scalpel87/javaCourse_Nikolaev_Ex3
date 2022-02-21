/**
 * На вход подается строка с именем и числом. Необходимо написать метод,
 * который будет складывать все цифры числа, и приветствовать
 * пользователя. Число как минимум должно иметь 2 разряда и максимум 5.
 * Сумму цифр необходимо реализовать с помощью рекурсии. Необходимо в
 * программе реализовать конвертер чисел в названия, и выводить сумму
 * цифр названием. (сумма цифр не должна превышать 10 - для простоты
 * реализации конвертора)
 *
 * @author     Sergey Nikolaev
 */
public class HomeWork {
    public static void main(String[] args) {
        String s = "Серж 1234";
        String[] ss = s.split(" ");
        printA(ss[0], calc(Integer.parseInt(ss[1])));
    }
    static int calc(int d){
        if (d < 10) return d;
        return d % 10 + calc(d / 10);
    }
    static void printA(String s, int sum){
        final String[] sums = {"нулю", "одному", "двум", "трем", "четырем", "пяти", "шести", "семи", "восьми", "девяти", "десяти"};
        System.out.printf("Здравствуй, %s! Сумма цифр в числе = %s", s, sums[sum]);
    }
}