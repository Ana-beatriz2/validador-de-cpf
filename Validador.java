public class Validador{

    String cpf;

    public String valida_cpf(String cpf){

        char [] cpf_div = this.cpf.toCharArray(), cpf_div2 = this.cpf.toCharArray();
        int contador = 0;

        while (contador < 2){
            int i, soma = 0, numero = 1, digito, tamanho = 9;
            String cpf2 = "";

            if (contador == 1){
                numero = 0;
                tamanho = 10;
            }

            for (i = 0; i < tamanho; i++){
                soma += Character.getNumericValue(cpf_div[i]) * numero;
                cpf2 += Character.getNumericValue(cpf_div[i]);

                numero++;

            }

            digito = soma % 11;
            
            if (digito >= 10){
                digito = 0;
            }

            cpf2 += digito;
            cpf_div = cpf2.toCharArray();
            contador++;
        }

        System.out.printf("\nO Cpf %s ", cpf);

        if ((cpf_div[9] == cpf_div2[9]) && (cpf_div[10] == cpf_div2[10])){
            return "é valido!\n";
        }
        else{
            return "não é válido!\n";
        }
    }
}