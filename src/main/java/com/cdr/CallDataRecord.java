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

