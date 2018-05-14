package noticications;
import Weather.WeatherForecast;
public interface Observer {
    void updateForecast(WeatherForecast weatherForecast);
}
