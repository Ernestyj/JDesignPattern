package eugene.behavioral.chainofresponsibility;

/**
 * Created by Jian on 2015/7/31.
 */
/**
 *
 * Makes requests that are handled by the chain.
 *
 */
public class OrcKing {
    RequestHandler chain;

    public OrcKing() {
        buildChain();
    }
    public void makeRequest(Request req){
        chain.handleRequest(req);
    }
    private void buildChain(){
        chain = new OrcCommander(new OrcOfficer(new OrcSoldier(null)));
    }
}
