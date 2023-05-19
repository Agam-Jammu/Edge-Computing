public class EdgeProcessor {
    private static final double MIN_SAFE_TEMP = 10.0;
    private static final double MAX_SAFE_TEMP = 35.0;

    public void processSensorData(SensorData sensorData) {
        double temp = sensorData.getTemperature();

        if (temp < MIN_SAFE_TEMP || temp > MAX_SAFE_TEMP) {
            sendAlert(sensorData);
        } else {
            System.out.println("Temperature is within safe range.");
        }
    }

    private void sendAlert(SensorData sensorData) {
        System.out.println("ALERT: Sensor " + sensorData.getSensorId() + " reports an unsafe temperature: " + sensorData.getTemperature());
    }
}
