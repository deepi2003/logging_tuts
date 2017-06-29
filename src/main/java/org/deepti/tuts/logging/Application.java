package org.deepti.tuts.logging;

import ch.qos.logback.classic.helpers.MDCInsertingServletFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Created by deeptim on 6/29/17.
 */

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public MDCInsertingServletFilter MDCInsertingServletFilter() {
        return new MDCInsertingServletFilter();
    }
}
