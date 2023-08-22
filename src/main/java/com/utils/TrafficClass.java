package com.utils;

public enum TrafficClass {
    CONVERSATIONAL("Conversational"),
    STREAMING("Streaming"),
    INTERACTIVE("Interactive"),
    BACKGROUND("Background"),
    BEST_EFFORT("Best Effort"),
    MISSION_CRITICAL("Mission Critical"),
    SIGNALING("Signaling"),
    BACKGROUND_DATA("Background Data"),
    BULK_DATA("Bulk Data"),
    EMERGENCY("Emergency");

    private final String description;

    TrafficClass(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }


}
