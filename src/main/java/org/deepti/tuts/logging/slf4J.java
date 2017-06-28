package org.deepti.tuts.logging;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class slf4J {

    private static Logger logger = LoggerFactory.getLogger(slf4J.class);
    public static void main(String[] args) {
      logStatment();
      doNotLogIncludedStatement();
    }

    public static void logStatment() {
        logger.info("Hello world");
    }

    public static void doNotLogIncludedStatement() {
        logger.debug("THIS STATEMENT IS NOT LOGGED.");
    }
}
