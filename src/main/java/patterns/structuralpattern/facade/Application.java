package patterns.structuralpattern.facade;

import java.io.File;

public class Application {
    public static void main(String[] args) {
        VideoConverter converter = new VideoConverter();
        File mp4Video = converter.convert("funny-cats-video.ogg", "mp4");
        System.out.println("Converted video saved as: " + mp4Video.getName());
    }
}
