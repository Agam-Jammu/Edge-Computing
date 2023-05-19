public class SensorData {
    private String sensorId;
    private double temperature;

    public SensorData(String sensorId, double temperature) {
        this.sensorId = sensorId;
        this.temperature = temperature;
    }

    // Getters
    public String getSensorId() {
        return sensorId;
    }

    public double getTemperature() {
        return temperature;
    }

    // Setters
    public void setSensorId(String sensorId) {
        this.sensorId = sensorId;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}
