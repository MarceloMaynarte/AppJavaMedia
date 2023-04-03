import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       Scanner scan = new Scanner(System.in);
       double nota1, nota2, nota3, media;

       //entrada de dados;

       System.out.println("informe a Primeira nota");
       nota1 = scan.nextDouble();

       System.out.println("informe a segunda nota");
       nota2 = scan.nextDouble();

       System.out.println("informe a terceira nota");
       nota3 = scan.nextDouble();

       media = (nota1 + nota2 + nota3)/3;

       System.out.println("A sua nota é: " + media);

       if(media<10){
        System.out.println("Reprovado");
       }else{
        System.out.println("Aprvado");
       }
    }
}
