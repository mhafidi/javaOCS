package com.utils;

public class QoSFlow {
    // QoS Flow Identifier (QFI)
    private int qfi;

    // Data Rate (in Mbps)
    private int minDataRate;
    private int maxDataRate;

    // Latency (in milliseconds)
    private int maxLatency;

    // Reliability (Packet Loss Rate)
    private double maxPacketLossRate;

    // Priority
    private int priority;

    // Packet Delay Budget (in milliseconds)
    private int maxPacketDelay;

    // Packet Error Rate (PER)
    private double maxPacketErrorRate;

    // Traffic Type
    private String trafficType;

    // Traffic Class
    private String trafficClass;

    // Maximum Burst Size
    private int maxBurstSize;

    // Flow Priority
    private int flowPriority;

    // Constructor
    public QoSFlow(int qfi, int minDataRate, int maxDataRate, int maxLatency,
                   double maxPacketLossRate, int priority, int maxPacketDelay,
                   double maxPacketErrorRate, String trafficType, String trafficClass,
                   int maxBurstSize, int flowPriority) {
        this.qfi = qfi;
        this.minDataRate = minDataRate;
        this.maxDataRate = maxDataRate;
        this.maxLatency = maxLatency;
        this.maxPacketLossRate = maxPacketLossRate;
        this.priority = priority;
        this.maxPacketDelay = maxPacketDelay;
        this.maxPacketErrorRate = maxPacketErrorRate;
        this.trafficType = trafficType;
        this.trafficClass = trafficClass;
        this.maxBurstSize = maxBurstSize;
        this.flowPriority = flowPriority;
    }

    // Example method to get QFI
    public int getQFI() {
        return qfi;
    }

}
