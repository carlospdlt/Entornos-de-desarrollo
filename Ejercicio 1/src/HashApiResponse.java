
/**
 *
 * @author carlos
 */
public class HashApiResponse {
    private HashApiResponseHeader header;
    private HashApiResponseBody body;

    public HashApiResponse() {
        this.header = new HashApiResponseHeader();
        this.body = new HashApiResponseBody();
    }

    public HashApiResponseHeader getHeader() {
        return header;
    }

    public void setHeader(HashApiResponseHeader header) {
        this.header = header;
    }

    public HashApiResponseBody getBody() {
        return body;
    }

    public void setBody(HashApiResponseBody body) {
        this.body = body;
    }
}

class HashApiResponseHeader {
    private String apiName;
    private String apiVersion;
    private String apiUser;
    private String apiEndpoint;
    private String httpRequestMethod;
    private int httpStatusCode;
    private String httpStatusMessage;
    private long responseTime;

    public HashApiResponseHeader() {
        this.apiName = "My API Name";
        this.apiVersion = "1.0.0";
        this.apiUser = "guest";
        this.apiEndpoint = "/api/hash";
        this.httpRequestMethod = "GET";
        this.httpStatusCode = 0;
        this.httpStatusMessage = "";
        this.responseTime = System.currentTimeMillis();
    }

    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    public String getApiVersion