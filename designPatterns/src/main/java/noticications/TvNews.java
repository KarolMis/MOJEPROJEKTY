package noticications;

import Weather.WeatherForecast;

public class TvNews implements Observer {
    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Tv - nowa prognoza pogody: temperatura: "+ weatherForecast.getTemperature() +" stopni, ciśnienie: "+weatherForecast.getPressure() +"hPa");

    }
}
