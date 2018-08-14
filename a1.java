import java.util.Scanner;
public class Student {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        String name[];
        name = new String[t];
        String roll[];
        roll=new String[t];
        for (int i = 0; i < t; i++) {
            //System.out.println("Enter name and roll number : ");
            name[i] = scan.next();
            roll[i] = scan.next();
        }
        for(int i=0;i<t;i++)
        {
            System.out.println(name[i] + " " + roll[i]);
        }
    }


}
