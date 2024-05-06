import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Criando um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Lendo a linha de entrada
        System.out.println("Digite a mensagem:");
        String mensagem = scanner.nextLine();
        
         // Contando o número de ocorrências de ":-)" e ":-("
         int divertido = contarEmoticons(mensagem, ":-)");
         int chateado = contarEmoticons(mensagem, ":-(");

           // Determinando o sentimento expresso na mensagem
        String sentimento = determinarSentimento(divertido, chateado);

         // Exibindo o sentimento
         System.out.println("Sentimento expresso: " + sentimento);

         // Fechando o scanner
         scanner.close();
     }
         // Método para contar o número de ocorrências de um emoticon na mensagem
    private static int contarEmoticons(String mensagem, String emoticon) {
        int count = 0;
        int index = mensagem.indexOf(emoticon);
        while (index != -1) {
            count++;
            index = mensagem.indexOf(emoticon, index + 1);
        }
        return count;
    }

        // Método para determinar o sentimento expresso na mensagem
        private static String determinarSentimento(int divertido, int chateado) {
            if (divertido == chateado) {
                return "neutro";
            } else if (divertido > chateado) {
                return "divertido";
            } else {
                return "chateado";
            }
        }
}
