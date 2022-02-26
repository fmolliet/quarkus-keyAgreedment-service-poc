package io.winty;

public class Request {
    String clientPublicKey;
    
    public Request() {

    }
    public Request(String clientPublicKey) {
        this.clientPublicKey = clientPublicKey;
    }

    public String getClientPublicKey() {
        return clientPublicKey;
    }

    public void setClientPublicKey(String clientPublicKey) {
        this.clientPublicKey = clientPublicKey;
    }
}
