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
        WebRetriever sut = new WebRetriever();
        Assert.assertNotNull(sut);
    }
}
