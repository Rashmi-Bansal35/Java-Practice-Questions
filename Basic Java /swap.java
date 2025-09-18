import java.util.Scanner;
public class swap {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int a = number1, b = number2;
        int p = number1, q = number2, r = 47;

        System.out.println("Using 3rd variable: ");
        int temp = number1;
        number1 = number2;
        number2 = temp;
        System.out.println("1st number: " +number1+ "\n2nd number: " +number2+ "\n");

        System.out.println("Addition subtraction: ");
        a = a + b;
        b = a - b;
        a = a- b;
        System.out.println("1st number: " +a+ "\n2nd number: " +b+ "\n");

        System.out.println("Multiplication Division: ");
        int x = 10, y = 20, z = 30;
        // Swap in x and y
        x = x * y;
        y = x / y;
        x = x / y;
        // Swap in y and z
        z = z * y;
        y = z / y;
        z = z / y;
        System.out.println("1st number: " +x+ "\n2nd number: " +y+ "\n3rd number: " +z+ "\n");

        // Using XOR
        System.out.println("Using XOR: ");
        // Swap in num1 and num2
        p = p ^ q;
        q = p ^ q;
        p = p ^ q;
        // Swap in num3 and num2
        r = r ^ q;
        q = r ^ q;
        r = r ^ q;
        System.out.println("1st number: " +p+ "\n2nd number: " +q+ "\n3rd number: " +r+ "\n");


        input.close();
    }
}
