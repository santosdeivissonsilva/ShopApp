public class ShopApp {
    public static void main(String[] args) {
        Clientes cliente1 = new Clientes("Paula", 3);

        System.out.println("Perfil: " + cliente1.getNome() + " - Tamanho: " + cliente1.getTamanho());
        System.out.println("Seja bem-vinda (o) ao Perfect Choice!");

        Roupas[] roupas = { new Roupas("Jaqueta Azul", 76.90, "M"), new Roupas("Camisa Laranja", 19.90, "P"),
                new Roupas("Bermuda Verde", 15, "P"), new Roupas("Camiseta Branca", 10.5, "P") };

        System.out.println("Valor mínimo para compras: R$ " + Roupas.PRECO_MINIMO);

        cliente1.adicionarRoupas(roupas);

        for (Roupas roupa : roupas) {
            System.out.println("Roupa: " + roupa.getDescricao() + ", preço: R$" + roupa.getPreco() + ", tamanho: "
                    + roupa.getTamanho());
        }

        System.out.println("O valor total da compra foi: " + cliente1.getValorTotalCarrinho());

        int media = 0;
        int cont = 0;

        for (Roupas roupa : cliente1.getRoupas()) {
            if (roupa.getTamanho().equals("G")) {
                cont++;
                media += roupa.getPreco();
            }
        }
        try {
            media = media / cont;
            System.out.println("Valor médio: " + media + ", quantidade de itens: " + cont);
        } catch (ArithmeticException e) {
            System.out.println("Não é possível fazer esta divisão! (Divisão por 0)");
        }

    }
}