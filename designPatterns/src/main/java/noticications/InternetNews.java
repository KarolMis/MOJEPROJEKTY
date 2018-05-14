package noticications;

import Weather.WeatherForecast;

public class InternetNews implements Observer {
    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Net - nowa prognoza pogody: temperatura: "+ weatherForecast.getTemperature() +" stopni, ciśnienie: "+weatherForecast.getPressure() +"hPa");

    }
}
