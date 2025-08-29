package main.java;

import main.java.model.Produto;
import main.java.model.Usuario;
import main.java.util.ReflectionUtil;

public class Main {
    public static void main(String[] args) {
        String nomeTabelaUsuario = ReflectionUtil.getNomeTabela(Usuario.class);
        System.out.println("Tabela do Usuario: " + nomeTabelaUsuario);
        
        String nomeTabelaProduto = ReflectionUtil.getNomeTabela(Produto.class);
        System.out.println("Tabela do Produto: " + nomeTabelaProduto);
    }
}