package methodvarargs.gps;

import java.time.LocalDateTime;

public class FieldPoint {

    LocalDateTime timeOfSetting;
    LocalDateTime timeOfLogging;
    double latitude;
    double longitude;

    public FieldPoint(LocalDateTime timeOfSetting, double latitude, double longitude) {
        this.timeOfSetting = timeOfSetting;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public void setTimeOfLogging(LocalDateTime timeOfLogging) {
        this.timeOfLogging = timeOfLogging;
    }

    public LocalDateTime getTimeOfSetting() {
        return timeOfSetting;
    }

    public LocalDateTime getTimeOfLogging() {
        return timeOfLogging;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}
