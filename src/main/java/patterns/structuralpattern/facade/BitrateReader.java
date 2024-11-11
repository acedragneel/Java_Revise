package patterns.structuralpattern.facade;

public class BitrateReader {
    public static String read(String filename, Object codec) {
        System.out.println("BitrateReader: reading file...");
        return "buffer";
    }

    public static String convert(String buffer, Object codec) {
        System.out.println("BitrateReader: writing file with codec...");
        return "converted-file";
    }
}
