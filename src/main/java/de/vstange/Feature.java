package de.vstange;

/**
 * Just the parsed XML of plagiarism cases.
 *
 * @author Vincent Stange
 */
public class Feature {

    private String name;

    private String type;

    private String obfuscation;

    private double obfuscation_degree;

    private int source_offset;

    private int source_length;

    private String reference;

    private String source_reference;

    private int this_offset;

    private int this_length;
}
