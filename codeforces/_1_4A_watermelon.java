import java.util.Scanner;
class _1_4A_watermelon{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num % 2 == 0 && num > 2){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
//if no. is even then only it can be divided in to 2 even no.s
