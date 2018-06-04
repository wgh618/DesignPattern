package com.will.headFirstDesignPattern.facade;

/**
 * ClassName:HomeTheaterFacade
 * Description:家庭影院外观
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年06月04日
 */
public class HomeTheaterFacade {
    private PopcornPopper popcornPopper;
    private TheaterLights lights;
    private Screen screen;
    private DvdPlayer dvdPlayer;

    public HomeTheaterFacade() {
        this.popcornPopper = new PopcornPopper();
        this.lights = new TheaterLights();
        this.screen = new Screen();
        this.dvdPlayer = new DvdPlayer();
    }

    public void watchMovie(String movie) {
        System.out.println("准备看电影");
        popcornPopper.on();
        popcornPopper.pop();
        lights.dim(10);
        screen.down();
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie(String movie) {

    }
}
