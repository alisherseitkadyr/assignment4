public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();

        weatherStation.registerObserver(currentDisplay);
        weatherStation.registerObserver(statisticsDisplay);
        weatherStation.registerObserver(forecastDisplay);

        WeatherData weatherData = new WeatherData(weatherStation);

        System.out.println("First Weather Update:");
        weatherData.setWeather(25.0, 65, 1013);

        System.out.println("\nSecond Weather Update:");
        weatherData.setWeather(27.0, 70, 1015);

        System.out.println("\nThird Weather Update:");
        weatherData.setWeather(23.0, 90, 1009);
    }
}
