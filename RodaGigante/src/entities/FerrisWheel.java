package entities;

import java.util.HashMap;
import java.util.Map;

public class FerrisWheel {
  private Map<Integer, String> gondolaStatus;

    public FerrisWheel() { //Inicializa gondolaStatus com 18(chaves) godolas vazias(valor)
        gondolaStatus = new HashMap<>();
        for (int i = 1; i <= 18; i++) {
            gondolaStatus.put(i, "(vazia)");
        }
    }

    // Método para embarcar passageiros na roda-gigante
    public void board(int gondolaNumber, Person... people) {
        boolean underTwelve = false;
        boolean fatherPresent = false;
        for (Person person : people) {
            if (person instanceof Child && ((Child) person).getAge() < 12) {
                underTwelve = true;
                if (((Child) person).getFather() != null) {
                    fatherPresent = true;
                }
            }
        }

        if (underTwelve && !fatherPresent) {
            System.out.println("ERRO: Criança menor de 12 anos sem o pai presente!");
        } else {
            StringBuilder passengers = new StringBuilder();
            for (Person person : people) {
                passengers.append(person.getName()).append(" ");
            }
            gondolaStatus.put(gondolaNumber, passengers.toString());
        }
    } 
     public void status() {
        System.out.println("Status das Gôndolas");
        System.out.println("-----------------------------");
        for (Map.Entry<Integer, String> entry : gondolaStatus.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
