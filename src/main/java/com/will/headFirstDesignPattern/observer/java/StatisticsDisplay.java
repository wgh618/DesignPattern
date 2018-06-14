package com.will.headFirstDesignPattern.observer.java;


import java.util.Observable;
import java.util.Observer;

/**
 * ClassName:StatisticsDisplay
 * Description: 此布告板跟踪最小、平均、最大的观测值
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年05月23日
 */
public class StatisticsDisplay implements Observer, DisplayElement {
    private float temperature;
    private Observable observable;

    private static float avg;
    private static float max;
    private static float min;
    private static int count;

    public StatisticsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            display();
        }
    }


    /**
     * 显示
     */
    @Override
    public void display() {
        if (count == 0) {
            min = temperature;
        } else {
            if (temperature < min) {
                min = temperature;
            }
        }

        if (temperature > max) {
            max = temperature;
        }

        avg = (avg * count + temperature) /(count + 1);
        System.out.println("Avg/Max/Min temperature = " + avg + "/" + max + "/" + min);
        count ++;
    }
}
