package com.will.headFirstDesignPattern.observer.self;

/**
 * ClassName:WeatherStation
 * Description:气象局
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年05月23日
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
