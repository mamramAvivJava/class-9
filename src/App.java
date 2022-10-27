import java.util.*;
public class App {
    public static void main(String[] args) throws Exception{
        //2 + 3 = 5
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        char c = sc.next().charAt(0);
        int n2 = sc.nextInt();
        switch (c) {
            case '+':
                System.out.println((n1+n2));
                break;
            case '-':
                System.out.println((n1-n2));
                break;
            default:
                System.out.println("this is def case");
                break;
        }
    }
}
