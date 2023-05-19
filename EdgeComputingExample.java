public class EdgeComputingExample {
    public static void main(String[] args) {
        EdgeProcessor edgeProcessor = new EdgeProcessor();

        // Simulate IoT sensor data
        SensorData[] sensorDataArray = new SensorData[]{
            new SensorData("Sensor1", 15.0),
            new SensorData("Sensor2", 8.0),
            new SensorData("Sensor3", 25.0),
            new SensorData("Sensor4", 38.0)
    };

    // Process sensor data at the edge
    for (SensorData sensorData : sensorDataArray) {
        edgeProcessor.processSensorData(sensorData);
    }
}
}

