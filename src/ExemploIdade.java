import java.util.Scanner;

public class ExemploIdade {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = s.nextInt();
        String sIdade = getIdade(idade);
        System.out.println(sIdade);

    }

    public static String getIdade(int idade){
        if (idade >= 1 && idade <= 2){
            return "você é um bebê";
        } else if(idade >=3 && idade<=12){
            return "você é uma criança";
        } else if (idade >=13 && idade<=18){
            return "você é um adolescente";
        } else{
            return "você é adulto";
        }
    }
}
