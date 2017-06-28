package org.deepti.tuts.logging;

import org.junit.Test;


public class TestSlf4j {
    @Test
    public void shouldPickTestLogbackXMLFile() {
        slf4J.logStatment();
    }

    @Test
    public void shouldNotLogStatement() {
        slf4J.doNotLogIncludedStatement();
    }
}
