public class ShopApp {
    public static void main(String[] args) {
        Clientes cliente1 = new Clientes("Paula", 3);

        System.out.println("Perfil: " + cliente1.getNome() + " - Tamanho: " + cliente1.getTamanho());
        System.out.println("Seja bem-vinda (o) ao Perfect Choice!");

        Roupas[] roupas = { new Roupas("Jaqueta Azul", 76.90, "M"), new Roupas("Camisa Laranja", 19.90, "P"),
                new Roupas("Bermuda Verde", 15, "P"), new Roupas("Camiseta Branca", 10.5, "P") };

        cliente1.adicionarRoupas(roupas);

        for (Roupas roupa : roupas) {
            System.out.println("Roupa: " + roupa.getDescricao() + ", preço: R$" + roupa.getPreco() + ", tamanho: "
                    + roupa.getTamanho());
        }

        System.out.println("O valor total da compra foi: " + cliente1.getValorTotalCarrinho());
    }
}