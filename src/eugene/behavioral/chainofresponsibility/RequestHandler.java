package eugene.behavioral.chainofresponsibility;

/**
 * Created by Jian on 2015/7/31.
 */
abstract public class RequestHandler {
    protected RequestHandler(RequestHandler requestHandler) {
    }

    public void handleRequest(Request request){

    }

    protected void printHandling(Request request){

    }

    abstract public String toString();
}
