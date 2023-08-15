package com.pcf.user;

public class UserSession {
    private String sessionId;
    private String subscriptionPlan;
    private String qoS;
    private int dataUsage;
    private String sessionState;

    public UserSession(String sessionId, String subscriptionPlan, int dataUsage) {
        this.sessionId = sessionId;
        this.subscriptionPlan = subscriptionPlan;
        this.dataUsage = dataUsage;
        this.qoS = "Default";
        this.sessionState = "Active";
    }

    // Getters and Setters for attributes

    public String getSessionId() {
        return sessionId;
    }

    public String getSubscriptionPlan() {
        return subscriptionPlan;
    }

    public String getQoS() {
        return qoS;
    }

    public void setQoS(String qoS) {
        this.qoS = qoS;
    }

    public int getDataUsage() {
        return dataUsage;
    }

    public String getSessionState() {
        return sessionState;
    }

    public void setSessionState(String sessionState) {
        this.sessionState = sessionState;
    }

    // Additional methods as needed

    @Override
    public String toString() {
        return "UserSession{" +
                "sessionId='" + sessionId + '\'' +
                ", subscriptionPlan='" + subscriptionPlan + '\'' +
                ", qoS='" + qoS + '\'' +
                ", dataUsage=" + dataUsage +
                ", sessionState='" + sessionState + '\'' +
                '}';
    }
}
