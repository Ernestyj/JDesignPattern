package eugene.behavioral.observer;

/**
 * Created by Jian on 2015/7/29.
 */
public enum WeatherType {
    SUNNY, RAINY, WINDY, COLD;
    WeatherType(){

    }

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}
