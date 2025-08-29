import model.Usuario;
import model.Pedido;
import model.Produto;
import util.ReflectionUtil;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== LEITOR DE ANNOTATIONS @Tabela ===");
        System.out.println();
        
        try {
            String tabelaUsuario = ReflectionUtil.getNomeTabela(Usuario.class);
            System.out.println("Classe: Usuario");
            System.out.println("Tabela: " + tabelaUsuario);
            System.out.println();
            
            String tabelaProduto = ReflectionUtil.getNomeTabela(Produto.class);
            System.out.println("Classe: Produto");
            System.out.println("Tabela: " + tabelaProduto);
            System.out.println();
            
            String tabelaPedido = ReflectionUtil.getNomeTabela(Pedido.class);
            System.out.println("Classe: Pedido");
            System.out.println("Tabela: " + tabelaPedido);
            System.out.println();
            
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
        
        System.out.println("=== FIM ===");
    }
}