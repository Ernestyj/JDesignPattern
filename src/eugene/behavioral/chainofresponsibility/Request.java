package eugene.behavioral.chainofresponsibility;

/**
 * Created by Jian on 2015/7/31.
 */
public class Request {
    private String requestDescription;
    private RequestType requestType;

    public RequestType getRequestType() {
        return requestType;
    }

    public void setRequestType(RequestType requestType) {
        this.requestType = requestType;
    }

    @Override
    public String toString() {
        return "Request{" +
                "requestDescription='" + requestDescription + '\'' +
                '}';
    }

    public String getRequestDescription() {
        return requestDescription;
    }

    public void setRequestDescription(String requestDescription) {
        this.requestDescription = requestDescription;
    }

    public Request(RequestType requestType, String requestDescription) {

        this.requestDescription = requestDescription;
    }
}
