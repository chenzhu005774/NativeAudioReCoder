package com.cloudgame.nativeaudiorecoder.playtest;


public interface IAudioPlay {

    void initPlayer(String path, int sampleRate, int channels, int bitRate);

    /**
     * 启动播放
     */
    void startPlay();

    /**
     * 停止播放
     */
    void stopPlay();

}
