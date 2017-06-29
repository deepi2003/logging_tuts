package org.deepti.tuts.logging.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by deeptim on 6/29/17.
 */
@RestController
public class MDCLogController {

    private static Logger logger = LoggerFactory.getLogger(MDCLogController.class);

    @RequestMapping("/testMDC")
    public String logMDCContext() {
        logger.info("MDC Servlet logging statement");
        return("successful");
    }

}
