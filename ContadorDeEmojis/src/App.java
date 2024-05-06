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
}
