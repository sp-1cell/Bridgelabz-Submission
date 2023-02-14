package Function;

public class Functionpractice {
    public static void main(String[] args) {
        int a = 14;
        int b = 12;
        addition(a, b);
        substraction(a, b);
        multiplication(a, b);
        division(a, b);

    }

    public static void addition(int numbera, int numberb) {
        int sum = numbera + numberb;
        System.out.println("addition  is " + sum);
    }

    public static void substraction(int numbera, int numberb) {
        int sum = numbera - numberb;
        System.out.println("substarction is " + sum);
    }

    public static void multiplication(int numbera, int numberb) {
        int sum = numberb * numberb;
        System.out.println("multiplication is " + sum);
    }

    public static void division(int numbera, int numberb) {
        int sum = numbera / numberb;
        System.out.println("division is " + sum);

    }
}
