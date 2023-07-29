/*a Call Data Record (CDR) typically includes a set of attributes that define the information related to a telecommunication event. The specific attributes present in a CDR may vary depending on the network technology and the services being provided. Here are some common attributes found in a CDR according to 3GPP:

Call/Session Identification:

Call ID or Session ID: A unique identifier for the communication session.
Timestamps:

Start Time: The date and time when the call or session started.
End Time: The date and time when the call or session ended.
Duration: The length of the call or session.
Caller and Called Party Information:

Calling Party Number: Phone number or address of the calling party.
Called Party Number: Phone number or address of the called party.
Location Information:

Calling Party Location: The geographical location of the calling party.
Called Party Location: The geographical location of the called party.
Service Information:

Service Type: The type of service used (e.g., voice call, SMS, MMS, data session).
Service Code: A code representing the specific service or feature used.
Quality of Service (QoS):

QoS Metrics: Indicators of the quality of the communication session, such as call drop rate or data throughput.
Supplementary Services:

Supplementary Service Codes: Codes representing any additional services used during the session (e.g., call forwarding, call waiting).
Charging Information:

Chargeable Duration: The portion of the call or session that is subject to charging.
Charging Party: The party responsible for paying for the communication session.
Tariff Information: Information about the applicable tariff or pricing plan.
Bearer Information:

Bearer Type: The type of bearer used for the communication (e.g., circuit-switched, packet-switched).
Bearer ID: Identifier for the specific bearer used.
Equipment and Network Information:

IMSI (International Mobile Subscriber Identity): Unique identifier for the mobile subscriber.
IMEI (International Mobile Equipment Identity): Unique identifier for the mobile device.
Result and Termination Cause:
Call Result: The outcome of the call (e.g., completed, unanswered, busy).
Termination Cause: The reason for call or session termination.
 *
 * */
package com.cdr;

import java.time.ZonedDateTime;

public class CallDataRecord {
    private String callId;
    private ZonedDateTime startTime;
    private ZonedDateTime endTime;
    private long duration;
    private String callingPartyNumber;
    private String calledPartyNumber;
    private String callingPartyLocation;
    private String calledPartyLocation;
    private String serviceType;
    private String serviceCode;
    private int qosMetrics;
    private String supplementaryServiceCodes;
    private long chargeableDuration;
    private String chargingParty;
    private String tariffInformation;
    private String bearerType;
    private String bearerId;
    private String imsi;
    private String imei;
    private String callResult;
    private String terminationCause;

    // Constructor
    public CallDataRecord() {
        // Default constructor
    }

    // Getters and Setters
    // (omitted for brevity)

    // Update the ZonedDateTime getters and setters
    public ZonedDateTime getStartTime() {
        return startTime;
    }

    public String getCallId() {
        return callId;
    }

    public void setCallId(String callId) {
        this.callId = callId;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
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

    public String getCallingPartyLocation() {
        return callingPartyLocation;
    }

    public void setCallingPartyLocation(String callingPartyLocation) {
        this.callingPartyLocation = callingPartyLocation;
    }

    public String getCalledPartyLocation() {
        return calledPartyLocation;
    }

    public void setCalledPartyLocation(String calledPartyLocation) {
        this.calledPartyLocation = calledPartyLocation;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public int getQosMetrics() {
        return qosMetrics;
    }

    public void setQosMetrics(int qosMetrics) {
        this.qosMetrics = qosMetrics;
    }

    public String getSupplementaryServiceCodes() {
        return supplementaryServiceCodes;
    }

    public void setSupplementaryServiceCodes(String supplementaryServiceCodes) {
        this.supplementaryServiceCodes = supplementaryServiceCodes;
    }

    public long getChargeableDuration() {
        return chargeableDuration;
    }

    public void setChargeableDuration(long chargeableDuration) {
        this.chargeableDuration = chargeableDuration;
    }

    public String getChargingParty() {
        return chargingParty;
    }

    public void setChargingParty(String chargingParty) {
        this.chargingParty = chargingParty;
    }

    public String getTariffInformation() {
        return tariffInformation;
    }

    public void setTariffInformation(String tariffInformation) {
        this.tariffInformation = tariffInformation;
    }

    public String getBearerType() {
        return bearerType;
    }

    public void setBearerType(String bearerType) {
        this.bearerType = bearerType;
    }

    public String getBearerId() {
        return bearerId;
    }

    public void setBearerId(String bearerId) {
        this.bearerId = bearerId;
    }

    public String getImsi() {
        return imsi;
    }

    public void setImsi(String imsi) {
        this.imsi = imsi;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getCallResult() {
        return callResult;
    }

    public void setCallResult(String callResult) {
        this.callResult = callResult;
    }

    public String getTerminationCause() {
        return terminationCause;
    }

    public void setTerminationCause(String terminationCause) {
        this.terminationCause = terminationCause;
    }

    public void setStartTime(ZonedDateTime startTime) {
        this.startTime = startTime;
    }

    public ZonedDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(ZonedDateTime endTime) {
        this.endTime = endTime;
    }
}

