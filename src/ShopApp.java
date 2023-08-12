public class ShopApp {
    public static void main(String[] args) {
        double imposto = 0.2; 
        double precoTotal = 0.0;

        Clientes cliente1 = new Clientes();
        cliente1.nome = "Paula";
        cliente1.tamanho = "P";

        System.out.println("Perfil: " + cliente1.nome);
        System.out.println("Seja bem-vinda (o) ao Perfect Choice!");

        Roupas[] roupas = {new Roupas(), new Roupas(), new Roupas(), new Roupas()};

        roupas[0].descricao = "Jaqueta Azul";
        roupas[0].preco = 76.99;
        roupas[0].tamanho = "M";

        roupas[1].descricao = "Camisa Laranja";
        roupas[1].preco = 19.90;
        roupas[1].tamanho = "P";

        roupas[2].descricao = "Bermuda Verde";
        roupas[2].preco = 15;
        roupas[2].tamanho = "P";

        roupas[3].descricao = "Camiseta Branca";
        roupas[3].preco = 10.5;
        roupas[3].tamanho = "P";

        int medida = 3;

        cliente1.tamanho = switch (medida) {
            case 1, 2, 3 -> "P";
            case 4, 5, 6 -> "M";
            case 7, 8, 9 -> "G";
            default -> "X";
        };
        
        for (Roupas roupa: roupas) {
            if (cliente1.tamanho.equals(roupa.tamanho)){
                precoTotal += roupa.preco;
                System.out.println("Roupa: " + roupa.descricao + ", preço: R$" + roupa.preco + ", tamanho: " + roupa.tamanho);
            }
        }

        System.out.println("O valor total a pagar é: R$" + precoTotal);
    }
}