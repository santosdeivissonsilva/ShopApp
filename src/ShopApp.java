public class ShopApp {
    public static void main(String[] args) {
        double imposto = 0.2; 
        double precoTotal = 0.0;

        Clientes cliente1 = new Clientes();
        cliente1.nome = "Paula";
        cliente1.tamanho = "P";

        System.out.println("Perfil: " + cliente1.nome);
        System.out.println("Seja bem-vinda (o) ao Perfect Choice!");

        Roupas roupa1 = new Roupas();
        Roupas roupa2 = new Roupas();

        Roupas[] roupas = {roupa1, roupa2};

        roupa1.descricao = "Jaqueta Azul";
        roupa1.preco = 76.99;
        roupa1.tamanho = "M";

        roupa2.descricao = "Camisa Laranja";
        roupa2.preco = 19.90;
        roupa2.tamanho = "P";

        int medida = 3;

        cliente1.tamanho = switch (medida) {
            case 1, 2, 3 -> "S";
            case 4, 5, 6 -> "M";
            case 7, 8, 9 -> "G";
            default -> "X";
        };
        
        for(Roupas roupa: roupas) {
            precoTotal += roupa.preco;
            System.out.println("Roupa: " + roupa.descricao + ", preço: R$" + roupa.preco + ", tamanho: " + roupa.tamanho);
        }

        System.out.println("O valor total a pagar é: R$" + precoTotal);
    }
}