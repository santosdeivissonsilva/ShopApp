public class ShopApp {
    public static void main(String[] args) {
        double precoTotal = 0.0;

        Clientes cliente1 = new Clientes();
        cliente1.setNome("Paula");;
        cliente1.setTamanho("P");;

        System.out.println("Perfil: " + cliente1.getNome());
        System.out.println("Seja bem-vinda (o) ao Perfect Choice!");

        Roupas[] roupas = {new Roupas(), new Roupas(), new Roupas(), new Roupas()};

        roupas[0].setDescricao("Jaqueta Azul");
        roupas[0].setPreco(76.99);
        roupas[0].setTamanho("M");

        roupas[1].setDescricao("Camisa Laranja");
        roupas[1].setPreco(19.90);
        roupas[1].setTamanho("P");

        roupas[2].setDescricao("Bermuda Verde");
        roupas[2].setPreco(15);
        roupas[2].setTamanho("P");

        roupas[3].setDescricao("Camiseta Branca");
        roupas[3].setPreco(10.5);
        roupas[3].setTamanho("P");

        // Alterando tamanho com número de medida
        int medida = 3;
        cliente1.setTamanho(medida);
        
        for (Roupas roupa: roupas) {
            if (cliente1.getTamanho().equals(roupa.getTamanho())){
                precoTotal += roupa.getPreco();
                System.out.println("Roupa: " + roupa.getDescricao() + ", preço: R$" + roupa.getPreco() + ", tamanho: " + roupa.getTamanho());
                if (precoTotal > 25) {break;}
            }
        }

        System.out.println("O valor total a pagar é: R$" + precoTotal);
    }
}