package com.will.headFirstDesignPattern.observer.self;

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
    private Subject weatherData;

    private static float avg;
    private static float max;
    private static float min;
    private static int count;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        display();
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
