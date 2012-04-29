package com.vance.quest2012;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Unit test for {@link WebRetriever}
 *
 * @author srvance
 */
public class WebRetrieverTest {
    @Test
    public void testWebRetriever() {
        String target = "http://localhost";
        WebRetriever sut = new WebRetriever(target);
        Assert.assertNotNull(sut);
        Assert.assertEquals(target, sut.getTarget());
    }
}
