// DO NOT CHANGE THE CLASS NAME, IT WILL BREAK THE AUTO GRADER
import java.util.Scanner;
public class FizzBuzzMenu {
    public static void main(String[] args)
    {
        // TODO WRITE CODE HERE
        Scanner sc = new Scanner(System.in);
        boolean runprogram = true;
        while (runprogram)
        {
            System.out.println("\n\n----FizzBuzz menu----");
            System.out.println("1. Fizz");
            System.out.println("2. Buzz");
            System.out.println("3. FizzBuzz");
            System.out.println("4. Exit");
            System.out.print("enter your choice:  ");

            int choice = sc.nextInt();

            switch (choice)
            {
                case 1:
                    for (int k= 1; k<101; k++)
                    {
                        if (k%3 == 0)
                            System.out.print(k + " ");
                    }
                    break;

                case 2:
                    for (int k= 1; k<101; k++)
                    {
                        if (k%5 == 0)
                            System.out.print(k + " ");
                    }
                    break;

                case 3:
                    for (int k= 1; k<101; k++)
                    {
                        if (k%3 == 0 && k%5 == 0)
                            System.out.print(k + " ");
                    }
                    break;

                case 4:
                    runprogram = false;
                    break;
            }
        }
    }
}