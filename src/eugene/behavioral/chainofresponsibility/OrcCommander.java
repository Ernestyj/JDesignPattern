package eugene.behavioral.chainofresponsibility;

/**
 * Created by Jian on 2015/8/1.
 */
public class OrcCommander extends RequestHandler {
    protected OrcCommander(RequestHandler requestHandler) {
        super(requestHandler);
    }

    @Override
    public String toString() {
        return "Orc commander";
    }

    @Override
    public void handleRequest(Request req) {
        if (req.getRequestType().equals(RequestType.DEFEND_CASTLE)) {
            printHandling(req);
        } else {
            super.handleRequest(req);
        }
    }
}
