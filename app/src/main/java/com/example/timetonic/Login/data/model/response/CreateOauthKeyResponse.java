package com.example.timetonic.Login.data.model.response;

public class CreateOauthKeyResponse {
    private String status;
    private String oauthkey;
    private String id;
    private String o_u;
    private String createdVNB;
    private String req;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOauthkey() {
        return oauthkey;
    }

    public void setOauthkey(String oauthkey) {
        this.oauthkey = oauthkey;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getO_u() {
        return o_u;
    }

    public void setO_u(String o_u) {
        this.o_u = o_u;
    }

    public String getCreatedVNB() {
        return createdVNB;
    }

    public void setCreatedVNB(String createdVNB) {
        this.createdVNB = createdVNB;
    }

    public String getReq() {
        return req;
    }

    public void setReq(String req) {
        this.req = req;
    }
}
