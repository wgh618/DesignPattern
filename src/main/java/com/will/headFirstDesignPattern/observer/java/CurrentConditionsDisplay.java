package com.will.headFirstDesignPattern.observer.java;

import java.util.Observable;
import java.util.Observer;

/**
 * ClassName:CurrentConditionsDisplay
 * Description:目前状况布告板
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年05月23日
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Observable observable;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    /**
     * 显示
     */
    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }
}
