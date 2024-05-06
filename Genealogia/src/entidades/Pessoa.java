package entidades;

import java.util.ArrayList;

public class Pessoa {
    private String name;
    private Pessoa conjuge;
    private ArrayList <Pessoa> filho = new ArrayList<>();

    public Pessoa(String name) {
        this.name = name;
    }

    public Pessoa(String name, Pessoa pai) {
        this.name = name;
        pai.adcFilho(this);
    }

    public void adcConjuge(Pessoa p){
        conjuge = p;
    }
    
    public void adcFilho(Pessoa p){
        filho.add(p);
    }

    public void arvore(int nivel) {
        String prefixo = "";
        for (int i = 0; i < nivel; i++) {
            prefixo += "  ";
        }
        String estadoCivil = (conjuge == null) ? " -- Solteiro" : " -- Casado com: " + conjuge.name;
        String filhos = (filho.isEmpty()) ? "" : " -- Filhos:";
        System.out.println(prefixo + name + estadoCivil + filhos);
        for (Pessoa filho : filho) {
            filho.arvore(nivel + 1);
        }
    }

    

}
