public class Clientes {
    private String nome;
    private String tamanho;

    private Roupas[] roupas;

    public void adicionarRoupas(Roupas[] itensCarrinho) {
        roupas = itensCarrinho;
    }

    public Roupas[] getRoupas() {
        return roupas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String string) {
        this.tamanho = string;
    }

    public void setTamanho(int medida) {
        switch (medida) {
            case 1, 2, 3 -> setTamanho("P");
            case 4, 5, 6 -> setTamanho("M");
            case 7, 8, 9 -> setTamanho("G");
            default -> setTamanho("GG");
        }
    }

    public double getValorTotalCarrinho() {
        double precoTotal = 0.0;
        for (Roupas roupa : roupas) {
            precoTotal += roupa.getPreco();
        }
        return precoTotal;
    }
}
