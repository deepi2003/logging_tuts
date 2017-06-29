package org.deepti.tuts.logging.filter;

import org.slf4j.MDC;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by deeptim on 6/29/17.
 */
public class MDCValueFilter implements Filter{

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
       MDC.put("status", "initalized");
       chain.doFilter(request, response);
       MDC.remove("status");
    }

    @Override
    public void destroy() {

    }
}
