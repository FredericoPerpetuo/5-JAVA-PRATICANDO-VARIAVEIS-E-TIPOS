package exercicio9;

public class VerificadorIdade {
    public static void main(String[] args) {
        int idade = 17;
        String mensagem = null;
        if (idade >= 18) {
            //int idade = 17; erro de escopo
            /*String*/
            mensagem = "Você é maior de idade.";
        } else {
            /*String*/
            mensagem = "Você é menor de idade.";
        }

        System.out.println(mensagem);
    }
}
