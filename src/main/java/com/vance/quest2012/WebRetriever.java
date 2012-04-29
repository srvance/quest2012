package com.vance.quest2012;

/**
 * Application class for utility to retrieve web content.
 *
 * @author srvance
 */
public class WebRetriever {
    public static final String HTTP_PROTOCOL_STRING = "http";
    public static final String PROTOCOL_HOST_SEPARATOR = "://";
    private String target;
    private String protocol;
    private String host;

    public WebRetriever(String target) {
        this.target = target;
        parseTarget(target);
    }

    WebRetriever() {
        // Empty
    }

    void parseTarget(String target) {
        if (target == null || target.trim().isEmpty()) {
            throw new IllegalArgumentException("Target must be defined");
        }
        String[] components = target.split(PROTOCOL_HOST_SEPARATOR, 2);
        if (components.length == 2) {
            protocol = components[0];
            host = components[1];
        } else {
            protocol = HTTP_PROTOCOL_STRING;
            host = components[0];
        }
    }

    public String getTarget() {
        return target;
    }

    public String getProtocol() {
        return protocol;
    }

    public String getHost() {
        return host;
    }
}
