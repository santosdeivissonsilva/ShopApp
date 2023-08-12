public class ShopApp {
    public static void main(String[] args) {
        Clientes cliente1 = new Clientes();
        cliente1.nome = "Paula";

        System.out.println(cliente1.nome + ", seja bem-vinda ao Perfect Choice!");

        Roupas roupa1 = new Roupas();
        Roupas roupa2 = new Roupas();

        roupa1.descricao = "Jaqueta Azul";
        roupa1.preco = 76.99;
        roupa1.tamanho = "M";

        roupa2.descricao = "Camisa Laranja";
        roupa2.preco = 19.90;
        roupa2.tamanho = "P";

        System.out.println("Primeira roupa: " + roupa1.descricao + ", preço: R$" + roupa1.preco + ", tamanho: " + roupa1.tamanho);
        System.out.println("Segunda roupa: " + roupa2.descricao + ", preço: R$" + roupa2.preco + ", tamanho: " + roupa2.tamanho);
    }
}