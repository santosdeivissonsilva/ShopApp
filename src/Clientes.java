public class Clientes {
    private String nome;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    private String tamanho;
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
        };
    }
}
