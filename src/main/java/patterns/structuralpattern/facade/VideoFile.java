package patterns.structuralpattern.facade;

class VideoFile {
    private String name;
    private String codecType;

    public VideoFile(String name) {
        this.name = name;
        this.codecType = name.substring(name.indexOf('.') + 1);
    }

    public String getCodecType() {
        return codecType;
    }
}
