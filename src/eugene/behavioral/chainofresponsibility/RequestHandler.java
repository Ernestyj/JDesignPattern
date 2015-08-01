package eugene.behavioral.chainofresponsibility;

/**
 * Created by Jian on 2015/7/31.
 */
abstract public class RequestHandler {
    private RequestHandler next;

    protected RequestHandler(RequestHandler next) {
        this.next = next;
    }

    public void handleRequest(Request req){
        if (next != null) {
            next.handleRequest(req);
        }
    }

    protected void printHandling(Request req){
        System.out.println(this + " handling request \"" + req + "\"");
    }

    abstract public String toString();
}
