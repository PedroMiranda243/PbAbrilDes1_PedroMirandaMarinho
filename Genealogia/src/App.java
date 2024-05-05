import entidades.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa lily = new Pessoa("Lily");
        lily.adcConjuge(new Pessoa("Wilhelm"));
        // Patriarch and matriarch
        Pessoa opa = new Pessoa("Opa", lily);
        opa.adcConjuge(new Pessoa("Oma"));
        // Children of Oma and Opa
        Pessoa reinhold = new Pessoa("Reinhold", opa);
        Pessoa wilma = new Pessoa("Wilma", opa);
        Pessoa sigrid = new Pessoa("Sigrid", opa);
        // Children and adcConjuge of Reinhold
        reinhold.adcConjuge(new Pessoa("Sonia"));
        Pessoa christian = new Pessoa("Christian", reinhold);
        Pessoa gabrielle = new Pessoa("Gabrielle", reinhold);
        Pessoa sabine = new Pessoa("Sabine", reinhold);
        // Children and adcConjuge of Wilma
        wilma.adcConjuge(new Pessoa("Rodolfo"));
        Pessoa ricardo = new Pessoa("Ricardo", wilma);
        Pessoa rodrigo = new Pessoa("Rodrigo", wilma);
        // Ricardo and adcConjuge
        ricardo.adcConjuge(new Pessoa("Debora"));
        // Children and adcConjuge of Christian
        christian.adcConjuge(new Pessoa("Monica"));
        Pessoa oscar = new Pessoa("Oscar", christian);
        Pessoa lorena = new Pessoa("Lorena", christian);
        // Children and adcConjuge of Sigrid
        sigrid.adcConjuge(new Pessoa("Peter"));
        Pessoa martin = new Pessoa("Martin", sigrid);
        Pessoa thomas = new Pessoa("Thomas", sigrid);
        Pessoa claudia = new Pessoa("Claudia", sigrid);
        martin.adcConjuge(new Pessoa("Carla"));
        martin.adcFilho(new Pessoa("Nicolas"));
        lily.arvore(0);
    }
}
