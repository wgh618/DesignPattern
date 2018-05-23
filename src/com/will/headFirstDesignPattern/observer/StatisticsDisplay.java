package com.will.headFirstDesignPattern.observer;

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
    private float humidity;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
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
