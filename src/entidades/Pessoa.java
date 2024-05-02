package entidades;

import java.lang.reflect.Array;
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

    public void arvore(int x){
        if (filho == null){//caso base
       return;
      }
      String format = "";
      for (int i = 0; i < x; i++) {
        format += " ";
      }
      String construtor = format + name +  ((conjuge == null) ? " -- Solteiro" : " -- Casado com: " + conjuge.name) + ((filho.isEmpty()) ? "" :" -- Filhos:"); 
      System.out.println(construtor);
      for (Pessoa c: filho) {
        c.arvore(x++);
      } 
    }

    

}
