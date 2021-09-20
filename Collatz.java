import java.util.Scanner;
public class Collatz {
    public static void main(String[] args) {
        int num;
        int ogNum;
        int counter = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an integer greater than 1: ");
        num = input.nextInt();
        ogNum = num;
        while(num != 1)
        {
            if(num % 2 == 0)
            {
                num /=2;
            }
            else
            {
                num = (num * 3) +1;
            }
            System.out.println("Num is now " + num);
            counter++;
        }
        System.out.println("It took " + counter + " steps to get to zero from " + ogNum);
    }


}
