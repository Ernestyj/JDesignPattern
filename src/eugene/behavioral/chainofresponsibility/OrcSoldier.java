package eugene.behavioral.chainofresponsibility;

/**
 * Created by Jian on 2015/8/1.
 */
public class OrcSoldier extends RequestHandler {
    protected OrcSoldier(RequestHandler requestHandler) {
        super(requestHandler);
    }

    @Override
    public String toString() {
        return "Orc soldier";
    }

    @Override
    public void handleRequest(Request req) {
        if (req.getRequestType().equals(RequestType.COLLECT_TAX)) {
            printHandling(req);
        } else {
            super.handleRequest(req);
        }
    }
}
