package com.example.timetonic.Login.data.model.response;

public class CreateSessKeyResponse {
    private String status;
    private String sesskey;
    private String id;
    private Restrictions restrictions;
    private String appName;
    private String createdVNB;
    private String req;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSesskey() {
        return sesskey;
    }

    public void setSesskey(String sesskey) {
        this.sesskey = sesskey;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Restrictions getRestrictions() {
        return restrictions;
    }

    public void setRestrictions(Restrictions restrictions) {
        this.restrictions = restrictions;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
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

    public class Restrictions
    {
        public Object carnet_code;
        public Object carnet_owner;
        public boolean readonly;
        public boolean hideTables;
        public boolean hideMessages;
        public boolean hideEvents;
        public boolean internal;

        public Object getCarnet_code() {
            return carnet_code;
        }

        public void setCarnet_code(Object carnet_code) {
            this.carnet_code = carnet_code;
        }

        public Object getCarnet_owner() {
            return carnet_owner;
        }

        public void setCarnet_owner(Object carnet_owner) {
            this.carnet_owner = carnet_owner;
        }

        public boolean isReadonly() {
            return readonly;
        }

        public void setReadonly(boolean readonly) {
            this.readonly = readonly;
        }

        public boolean isHideTables() {
            return hideTables;
        }

        public void setHideTables(boolean hideTables) {
            this.hideTables = hideTables;
        }

        public boolean isHideMessages() {
            return hideMessages;
        }

        public void setHideMessages(boolean hideMessages) {
            this.hideMessages = hideMessages;
        }

        public boolean isHideEvents() {
            return hideEvents;
        }

        public void setHideEvents(boolean hideEvents) {
            this.hideEvents = hideEvents;
        }

        public boolean isInternal() {
            return internal;
        }

        public void setInternal(boolean internal) {
            this.internal = internal;
        }
    }
}


