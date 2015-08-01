package eugene.behavioral.chainofresponsibility;

/**
 * Created by Jian on 2015/8/1.
 */
public class OrcOfficer extends RequestHandler {
    protected OrcOfficer(RequestHandler requestHandler) {
        super(requestHandler);
    }

    @Override
    public String toString() {
        return "Orc officer";
    }

    @Override
    public void handleRequest(Request req) {
        if (req.getRequestType().equals(RequestType.TORTURE_PRISONER)) {
            printHandling(req);
        } else {
            super.handleRequest(req);
        }
    }
}
