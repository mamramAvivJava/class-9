// import java.util.*;
// public class App {
//     public static void main(String[] args) throws Exception {
//         int s1 = 0, s2 = 1, s3 = 0;
//         for (int i = 0; i < 9; i++) {
//             s3 = s1 + s2;
//             s1 = s2;
//             s2 = s3;
//             System.out.println(s2);
//         }
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();

//         for (int i = 0; i < 4; i++) {
//             for (int j = 0; j < 3-i; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 0; j < (i*2)+1; j++) {
//                 System.out.print("*");
//             }
//             for (int j = 0; j < 3-i; j++) {
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }  
//         final int num = 3;
//         for (int i = 0; i < num; i++) {
//             for (int j = 0; j < num-i; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 0; j < (i*2)+1; j++) {
//                 System.out.print(Math.abs(i-j)+ 1);
//             }
//             for (int j = 0; j < 3-i; j++) {
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }       
//     }
//     Scanner sc = new Scanner(System.in);
//         boolean b = true;
//         while(b){
//             int num1 = sc.nextInt(), num2 = sc.nextInt();
//             char c = sc.next().charAt(0);
//             switch (c) {
//                 case '+':
//                     System.out.println((num1+num2));
//                     break;
//                 case '-':
//                     System.out.println((num1-num2));
//                     break;
//                 case '/':
//                     System.out.println((num1/num2));
//                     break;
//                 case '*':
//                     System.out.println((num1*num2));
//                     break;
//                 case 'q':
//                     b = false;
//                     break;
//                 default:
//                     break;
//             }
//         }
    
// }
