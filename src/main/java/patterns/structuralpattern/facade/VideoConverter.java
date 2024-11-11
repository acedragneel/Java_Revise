package patterns.structuralpattern.facade;

import java.io.File;

public class VideoConverter {
    public File convert(String filename, String format) {
        System.out.println("VideoConverter: conversion started.");

        VideoFile file = new VideoFile(filename);
        Object sourceCodec = new CodecFactory().extract(file);

        Object destinationCodec;
        if (format.equals("mp4")) {
            destinationCodec = new MPEG4CompressionCodec();
        } else {
            destinationCodec = new OggCompressionCodec();
        }

        String buffer = BitrateReader.read(filename, sourceCodec);
        String intermediateResult = BitrateReader.convert(buffer, destinationCodec);

        String result = new AudioMixer().fix(intermediateResult);
        System.out.println("VideoConverter: conversion completed.");

        // Returning a dummy File object for demonstration purposes
        return new File(result);
    }
}
