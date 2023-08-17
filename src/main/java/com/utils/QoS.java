package com.utils;
public class QoS {
    // Type of QoS (e.g., "guaranteed", "best_effort", "limited")
    private String qosType;

    // Priority level for the QoS (higher values indicate higher priority)
    private int priority;

    // Data rate in Mbps (e.g., 100 Mbps)
    private double dataRateMbps;

    // Latency in milliseconds (e.g., 20 ms)
    private int latencyMs;

    // Packet loss percentage (e.g., 0.5%)
    private double packetLossPercentage;

    // Jitter in milliseconds (variation in latency over time)
    private int jitterMs;

    // Reliability characteristic (e.g., "high", "medium", "low")
    private String reliability;

    // Security requirement (e.g., "encrypted", "unencrypted")
    private String security;

    // Constructor to initialize QoS attributes
    public QoS(String qosType, int priority, double dataRateMbps, int latencyMs,
               double packetLossPercentage, int jitterMs, String reliability, String security) {
        this.qosType = qosType;
        this.priority = priority;
        this.dataRateMbps = dataRateMbps;
        this.latencyMs = latencyMs;
        this.packetLossPercentage = packetLossPercentage;
        this.jitterMs = jitterMs;
        this.reliability = reliability;
        this.security = security;
    }

    // Getters and Setters for QoS attributes

    public String getQosType() {
        return qosType;
    }

    public int getPriority() {
        return priority;
    }

    public double getDataRateMbps() {
        return dataRateMbps;
    }

    public int getLatencyMs() {
        return latencyMs;
    }

    public double getPacketLossPercentage() {
        return packetLossPercentage;
    }

    public int getJitterMs() {
        return jitterMs;
    }

    public String getReliability() {
        return reliability;
    }

    public String getSecurity() {
        return security;
    }

    @Override
    public String toString() {
        return "QoS{" +
                "qosType='" + qosType + '\'' +
                ", priority=" + priority +
                ", dataRateMbps=" + dataRateMbps +
                ", latencyMs=" + latencyMs +
                ", packetLossPercentage=" + packetLossPercentage +
                ", jitterMs=" + jitterMs +
                ", reliability='" + reliability + '\'' +
                ", security='" + security + '\'' +
                '}';
    }
}
