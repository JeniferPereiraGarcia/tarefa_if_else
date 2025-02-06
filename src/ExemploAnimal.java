import java.util.Scanner;

public class ExemploAnimal {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("Digite seu animal:");
        String texto = s.next();
        String animal = exampleOfIf(texto);
        System.out.println(animal);
    }

    public static String exampleOfIf(String animal){
        String result;
        if (animal.equals("DOG") || animal.equals("CAT")){
            result = "domestic animal";
        } else if (animal.equals("LION")) {
            result = "wild";
        } else{
            result = "unknow animal";
        }
        return result;
    }
}
