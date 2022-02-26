package io.winty;

public class Response {
    String serverPublicKey;
    String context;
    
    public String getServerPublicKey() {
        return serverPublicKey;
    }
    public void setServerPublicKey(String serverPublicKey) {
        this.serverPublicKey = serverPublicKey;
    }
    public String getContext() {
        return context;
    }
    public void setContext(String context) {
        this.context = context;
    }
    
    public Response(String serverPublicKey, String context) {
        this.serverPublicKey = serverPublicKey;
        this.context = context;
    }
    
    @Override
    public String toString() {
        return "Response [context=" + context + ", serverPublicKey=" + serverPublicKey + "]";
    }
    public String toJson() {
        return "{\"serverPublicKey\":\"" + serverPublicKey + "\",\"context\":\"" + context + "\"}";
    }
}
