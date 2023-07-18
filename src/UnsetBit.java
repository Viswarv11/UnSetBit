import java.util.Scanner;

public class UnsetBit {
    public static int unSet(int number, int index){
        return ((number & (1<<index)) == 0) ? number : (int)(number - Math.pow(2,index));
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number1:");
        int number1=scanner.nextInt();
        System.out.println("Enter number2");
        int number2=scanner.nextInt();
        System.out.println(unSet(number1,number2));
    }
}
