package de.vstange;

/**
 * TODO
 *
 * @author Vincent Stange
 */
public class Foobar {

    private final String source_reference;
    private final String source_offset;
    private final String source_length;

    private String absolutePathSource;

    public Foobar(String source_reference, String source_offset, String source_length) {
        this.source_reference = source_reference;
        this.source_offset = source_offset;
        this.source_length = source_length;
    }

    public String getSource_reference() {
        return source_reference;
    }

    public String getSource_offset() {
        return source_offset;
    }

    public String getSource_length() {
        return source_length;
    }

    public void setSourceFile(String absolutePath) {
        absolutePathSource = absolutePath;
    }

    public String getAbsolutePathSource() {
        return absolutePathSource;
    }
}
