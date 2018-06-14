package com.will.headFirstDesignPattern.observer.java;

/**
 * ClassName:WeatherStation
 * Description:气象局
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年05月24日
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData observable = new WeatherData();
        new CurrentConditionsDisplay(observable);
        new StatisticsDisplay(observable);
        observable.setMeasurements(80, 65, 30.4f);
        observable.setMeasurements(82, 70, 29.2f);
        observable.setMeasurements(78, 90, 29.2f);
    }
}
