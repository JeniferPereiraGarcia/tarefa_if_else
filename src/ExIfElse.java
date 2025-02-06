import java.util.Scanner;

public class ExIfElse {

    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("Digite seu número");
        int num = s.nextInt()2;


        if (num>= 1 && num < 5){
            System.out.println("resulado maior");
        } else if (num>5 || num <30) {
            System.out.println("resulado maior que 5");
        } else {
            System.out.println("resulado menor");
        }

    }
}
