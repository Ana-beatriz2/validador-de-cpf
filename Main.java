import java.util.Scanner;

public class Main{
    public static void main(String[]  args){

        Scanner scan = new Scanner(System.in);
        Validador validar = new Validador();

        System.out.printf("\nObservação: por favor, insira sem ponto e hífen");
        System.out.printf("\n================================================\nInsira o Cpf a ser validado: ");
        validar.cpf = scan.nextLine();

        System.out.println(validar.valida_cpf(validar.cpf));

    }
}