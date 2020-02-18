import java.util.Scanner;

public class endOfFile {
    Scanner n=new Scanner(System.in);
    String input;
    int counter=0;

    while(input! = null)
    {
        input=n.nextLine();
        char[] charInput=input.toCharArray();
        for (int i = 0; i < input.length(); i++) {
            if(charInput[i]=='"')
            {
                if(counter%2==0)
                {
                    System.out.print("``");
                }
                else
                {
                    System.out.print("''");
                }
                counter++;
            }
            else
            {
                System.out.print(charInput[i]);
            }
        }
        System.out.print("\n");
    }
}
