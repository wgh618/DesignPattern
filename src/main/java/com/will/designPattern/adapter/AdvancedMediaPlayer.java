package com.will.designPattern.adapter;

/**
 * ClassName:AdvancedMediaPlayer
 * Description:高级媒体播放
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年06月04日
 */
public interface AdvancedMediaPlayer {
    void playVlc(String fileName);
    void playMp4(String fileName);
}
