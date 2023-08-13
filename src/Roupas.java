public class Roupas {
    private String descricao;
    private double preco;
    private String tamanho = "M";
    public final double PRECO_MINIMO = 10.0;
    public final double IMPOSTO = 0.2;
    
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public double getPreco() {
        // Lógica para adicionar o valor do imposto
        return preco + (preco * IMPOSTO);
    }
    public void setPreco(double preco) {
        // Lógica para adicionar um valor mínimo para a compra
        this.preco = (preco > PRECO_MINIMO ? preco : PRECO_MINIMO);
    }
    public String getTamanho() {
        return tamanho;
    }
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
}
