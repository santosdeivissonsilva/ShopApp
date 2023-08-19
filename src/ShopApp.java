import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import io.helidon.webserver.Routing;
import io.helidon.webserver.ServerConfiguration;
import io.helidon.webserver.WebServer;

public class ShopApp {
    public static void main(String[] args) {
        Clientes cliente1 = new Clientes("Paula", 3);

        System.out.println("Perfil: " + cliente1.getNome() + " - Tamanho: " + cliente1.getTamanho());
        System.out.println("Seja bem-vinda (o) ao Perfect Choice!");

        Roupas[] roupas = { new Roupas("Jaqueta Azul", 76.90, "M"), new Roupas("Camisa Laranja", 19.90, "P"),
                new Roupas("Bermuda Verde", 15, "P"), new Roupas("Camiseta Branca", 10.5, "P") };
        
        // try {
        //     ListaRoupas lista = new ListaRoupas(roupas);
        //     Routing routing = Routing.builder().get("/lista", lista).build();
        //     ServerConfiguration config = ServerConfiguration.builder().bindAddress(InetAddress.getLocalHost()).port(8888).build();
        //     WebServer ws = WebServer.create(config, routing);
        //     ws.start();
        // } catch (UnknownHostException ex) {
        //     ex.printStackTrace();
        // }

       System.out.println("Valor mínimo para compras: R$ " + Roupas.PRECO_MINIMO);

       cliente1.adicionarRoupas(roupas);

       Arrays.sort(cliente1.getRoupas());

       for (Roupas roupa : roupas) {
            System.out.println(roupa.toString());
        }

        System.out.println("O valor total da compra foi: " + cliente1.getValorTotalCarrinho());

    }
}