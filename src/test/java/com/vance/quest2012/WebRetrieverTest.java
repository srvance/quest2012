package com.vance.quest2012;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Unit test for {@link WebRetriever}
 *
 * @author srvance
 */
public class WebRetrieverTest {

    public static final String HTTP_PROTOCOL_STRING = "http";
    public static final String SIMPLE_HOST_STRING = "localhost";
    public static final String SIMPLE_LOCALHOST_TARGET = HTTP_PROTOCOL_STRING + "://" + SIMPLE_HOST_STRING;

    @Test
    public void testWebRetriever() {
        String expectedProtocol = HTTP_PROTOCOL_STRING;
        String expectedHost = SIMPLE_HOST_STRING;
        String expectedTarget = SIMPLE_LOCALHOST_TARGET;

        WebRetriever sut = new WebRetriever(expectedTarget);

        Assert.assertNotNull(sut);
        Assert.assertEquals(expectedTarget, sut.getTarget());
        Assert.assertEquals(expectedProtocol, sut.getProtocol());
        Assert.assertEquals(expectedHost, sut.getHost());
    }

    @Test
    public void testParseTarget() {
        WebRetriever sut = new WebRetriever();

        sut.parseTarget(SIMPLE_LOCALHOST_TARGET);
    }
}
