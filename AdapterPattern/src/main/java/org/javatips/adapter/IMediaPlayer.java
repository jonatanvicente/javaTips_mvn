package org.javatips.adapter;

public interface IMediaPlayer {
    void play(String audioType, String fileName);
}

class AudioPlayer implements IMediaPlayer {
    IMediaPlayer mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        // Playing mp3 files directly
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file. Name: " + fileName);
        }
        // MediaAdapter is providing support to play other file formats
        else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}
