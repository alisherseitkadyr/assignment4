public class StatisticsDisplay implements WeatherDisplay {
    private double maxTemperature = Double.MIN_VALUE;
    private double minTemperature = Double.MAX_VALUE;
    private double temperatureSum = 0.0;
    private int numReadings = 0;

    @Override
    public void update(double temperature, double humidity, double pressure) {
        temperatureSum += temperature;
        numReadings++;

        if (temperature > maxTemperature) {
            maxTemperature = temperature;
        }

        if (temperature < minTemperature) {
            minTemperature = temperature;
        }

        display();
    }

    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (temperatureSum / numReadings)
                + "/" + maxTemperature + "/" + minTemperature);
    }
}
