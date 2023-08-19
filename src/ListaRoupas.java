import io.helidon.common.http.Http;
import io.helidon.webserver.Handler;
import io.helidon.webserver.ServerRequest;
import io.helidon.webserver.ServerResponse;

public class ListaRoupas implements Handler {
    private Roupas[] roupas;

    public ListaRoupas(Roupas[] roupas) {
        this.roupas = roupas;
    }

    @Override
    public void accept(ServerRequest req, ServerResponse res) {
        res.status(Http.Status.OK_200);
        res.headers().put("Content Type", "text/plain; charset=UTF-8");
        StringBuilder result = new StringBuilder();
        for (Roupas roupa : roupas) {
            result.append(roupa + "\n");
        }
        res.send(result);
    }
}
