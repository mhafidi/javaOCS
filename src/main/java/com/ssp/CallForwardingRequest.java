package com.ssp;

public class CallForwardingRequest implements Queries{
    private String callingPartyNumber;
    private String calledPartyNumber;
    private String forwardingNumber;
    private String reasonForCallForwarding;
    private String timeAndDateOfCall;

    public CallForwardingRequest(String callingPartyNumber, String calledPartyNumber, String forwardingNumber, String reasonForCallForwarding, String timeAndDateOfCall) {
        this.callingPartyNumber = callingPartyNumber;
        this.calledPartyNumber = calledPartyNumber;
        this.forwardingNumber = forwardingNumber;
        this.reasonForCallForwarding = reasonForCallForwarding;
        this.timeAndDateOfCall = timeAndDateOfCall;
    }

    public String getCallingPartyNumber() {
        return callingPartyNumber;
    }

    public void setCallingPartyNumber(String callingPartyNumber) {
        this.callingPartyNumber = callingPartyNumber;
    }

    public String getCalledPartyNumber() {
        return calledPartyNumber;
    }

    public void setCalledPartyNumber(String calledPartyNumber) {
        this.calledPartyNumber = calledPartyNumber;
    }

    public String getForwardingNumber() {
        return forwardingNumber;
    }

    public void setForwardingNumber(String forwardingNumber) {
        this.forwardingNumber = forwardingNumber;
    }

    public String getReasonForCallForwarding() {
        return reasonForCallForwarding;
    }

    public void setReasonForCallForwarding(String reasonForCallForwarding) {
        this.reasonForCallForwarding = reasonForCallForwarding;
    }

    public String getTimeAndDateOfCall() {
        return timeAndDateOfCall;
    }

    public void setTimeAndDateOfCall(String timeAndDateOfCall) {
        this.timeAndDateOfCall = timeAndDateOfCall;
    }
}

