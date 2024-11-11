package patterns.structuralpattern.facade;

public class CodecFactory {
    public Object extract(VideoFile file) {
        System.out.println("CodecFactory: extracting " + file.getCodecType() + " codec...");
        if (file.getCodecType().equals("mp4")) {
            return new MPEG4CompressionCodec();
        } else {
            return new OggCompressionCodec();
        }
    }
}
