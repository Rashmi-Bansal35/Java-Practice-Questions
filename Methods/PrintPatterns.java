package Methods;

public class PrintPatterns {
    public static void RightHalfPyramidPattern(){
        System.out.println("Right Half Pyramid Pattern");
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void ReverseRightHalfPyramid(){
        System.out.println("\n\nReverse Right Half Pyramid Pattern");
        for(int i = 1; i <= 5; i++){
            for(int j = 5; j >= i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void LeftHalfPyramid(){
        System.out.println("\n\nLeft Half Pyramid Pattern");
        for(int i = 1; i <= 5; i++){
            for(int j = 4; j >= i; j--){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
               System.out.print("*");
            }
            System.out.print("\n"); 
        }
    }

    public static void main(String[] args){
        RightHalfPyramidPattern();
        ReverseRightHalfPyramid();
        LeftHalfPyramid();
    }
}
