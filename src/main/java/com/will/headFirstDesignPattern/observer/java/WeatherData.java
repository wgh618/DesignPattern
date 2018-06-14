package com.will.headFirstDesignPattern.observer.java;

import com.will.headFirstDesignPattern.observer.self.Observer;
import com.will.headFirstDesignPattern.observer.self.Subject;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * ClassName:WeatherData
 * Description:
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年05月24日
 */
public class WeatherData extends Observable {
    /**
     * 温度
     */
    private float temperature;
    /**
     * 湿度
     */
    private float humidity;
    /**
     * 气压
     */
    private float pressure;

    /**
     * 当数据变化时，通知观察者
     */
    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    /**
     * 设置数据
     *
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }
}
