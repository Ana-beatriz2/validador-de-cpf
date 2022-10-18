import java.util.Scanner;

public class Main{
    public static void main(String[]  args){

        Scanner scan = new Scanner(System.in);
        Cpf cpf = new Cpf();

        System.out.printf("\nObservação: por favor, insira sem ponto e hífen");
        System.out.printf("\n================================================\nInsira o Cpf a ser validado: ");
        cpf.cpf = scan.nextLine();

        System.out.println(cpf.valida_cpf(cpf.cpf));

    }
}