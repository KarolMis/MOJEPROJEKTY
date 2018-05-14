import Weather.WeatherForecast;
import noticications.InternetNews;
import noticications.RadioNews;
import noticications.TvNews;

public class Main {
    public static void main(String[] args) {
        WeatherForecast weatherForecast = new WeatherForecast(25, 1009);

        InternetNews internetNews = new InternetNews();
        RadioNews radioNews = new RadioNews();
        TvNews tvNews = new TvNews();

        weatherForecast.registerObserver(internetNews);
        weatherForecast.registerObserver(radioNews);
        weatherForecast.registerObserver(tvNews);

        weatherForecast.notifyObservers();


    }
}
