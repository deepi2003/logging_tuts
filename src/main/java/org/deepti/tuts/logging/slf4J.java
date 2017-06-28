package org.deepti.tuts.logging;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.logging.Level;

public class slf4J {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(slf4J.class);
        logger.debug("Hello world");
     }

}
