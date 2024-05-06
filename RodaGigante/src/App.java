public class App {
    public static void main(String[] args) {
        FerrisWheel ferrisWheel = new FerrisWheel(); // Criando uma nova roda-gigante
        Adult paulo = new Adult("Paulo", 42); // Adulto chamado Paulo
        // Filhos de Paulo
        Child joao = new Child("João", 5, paulo); // Novo filho com Paulo como pai
        Child maria = new Child("Maria", 12, paulo); // Esta é a filha de Paulo
        // Criança sem pai definido
        Child pedro = new Child("Pedro", 13);
        Child henrique = new Child("Henrique", 10);
        
        ferrisWheel.board(2, joao, maria); // ERRO: João tem menos de 12 anos e o pai não está presente
        ferrisWheel.board(2, joao, paulo); // OK: Agora o pai está presente
        ferrisWheel.board(3, maria); // OK: Maria tem 12 anos e pode andar sozinha
        ferrisWheel.board(13, pedro); // OK: Pedro anda sozinho
        ferrisWheel.board(16, henrique); // ERRO: Henrique tem menos de 12 anos e não sabemos quem é o pai
        ferrisWheel.status();
    }
}
