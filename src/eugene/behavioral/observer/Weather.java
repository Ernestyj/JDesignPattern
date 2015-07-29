package eugene.behavioral.observer;

/**
 * Created by Jian on 2015/7/29.
 */

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Weather can be observed by implementing WeatherObserver interface and
 * registering as listener.
 *
 */
public class Weather {
    private WeatherType currentWeather;
    private List<WeatherObserver> observers;

    public Weather() {
        observers = new ArrayList<>();
        currentWeather = WeatherType.SUNNY;
    }

    public void addObserver(WeatherObserver weatherObserver){
        observers.add(weatherObserver);
    }

    public void removeObserver(WeatherObserver weatherObserver){
        observers.remove(weatherObserver);
    }

    public void timePasses(){
        WeatherType[] enumValues = WeatherType.values();
        currentWeather = enumValues[(currentWeather.ordinal() + 1) % enumValues.length];
        System.out.println("The weather changed to " + currentWeather + ".");
        notifyObservers();
    }

    private void notifyObservers(){
        for (WeatherObserver obs : observers) {
            obs.update(currentWeather);
        }
    }
}
