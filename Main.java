import java.util.ArrayList;

abstract class Carro {
    private String nome;
    public Carro(String nome) { this.nome = nome; }
    public abstract String getTipo();
    public String toString() { return nome + " - " + getTipo(); }
}

class Popular extends Carro {
    public Popular(String nome) { super(nome); }
    public String getTipo() { return "Popular"; }
}

class Esportivo extends Carro {
    public Esportivo(String nome) { super(nome); }
    public String getTipo() { return "Esportivo"; }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Carro> carros = new ArrayList<>();
        carros.add(new Popular("Fiat Uno"));
        carros.add(new Esportivo("Ferrari"));
        
        for (Carro c : carros) {
            System.out.println(c);
        }
    }
}