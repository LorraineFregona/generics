package model;



import annotations.Tabela;

@Tabela("pedidos")
public class Pedido {
    private Long id;
    private String numero;
    private Double total;
    
    public Pedido() {}
    
    public Pedido(Long id, String numero, Double total) {
        this.id = id;
        this.numero = numero;
        this.total = total;
    }
    
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }
    
    public Double getTotal() { return total; }
    public void setTotal(Double total) { this.total = total; }
}