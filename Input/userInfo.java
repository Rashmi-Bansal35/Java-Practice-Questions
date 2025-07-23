import java.util.Scanner;

public class userInfo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter your roll no.: ");
        int roll_no = input.nextInt();
        System.out.print("Enter your Section: ");
        String section = input.next();
        input.nextLine();
        System.out.print("Enter your course: ");
        String course = input.nextLine();
        System.out.print("Enter your mobile no.: ");
        long mobileNo = input.nextLong();
        System.out.print("Enter your percentage: ");
        float percentage = input.nextFloat();
        System.out.print("Enter your 10th percentage: ");
        float X_Percentage = input.nextFloat();
        System.out.print("Enter your 12th percentage: ");
        float XII_Percentage = input.nextFloat();
        input.nextLine();
        System.out.print("Enter your address: ");
        String address = input.nextLine();
        System.out.print("Enter your aadhar no.: ");
        long aadharNo = input.nextLong();

        System.out.println("\n\n-*-*-*-*-*--User Info--*-*-*-*-*-");
        System.out.println("Name: " +name);
        System.out.println("Roll no.: " +roll_no);
        System.out.println("Section: " +section);
        System.out.println("Course: " +course);
        System.out.println("Mobile number: " +mobileNo);
        System.out.println("Percentage: " +percentage);
        System.out.println("10th %age: " +X_Percentage);
        System.out.println("12th %age: " +XII_Percentage);
        System.out.println("Address: " +address);
        System.out.println("Aadhar number: " +aadharNo);
        input.close();
    }
}
