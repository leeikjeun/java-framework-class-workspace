package kr.ac.jejunu.servlet;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by hyh0408 on 2016. 4. 28..
 */
public class HelloFilter implements Filter {
    private final static Logger logger = LoggerFactory.getLogger(HelloFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        logger.info("*******  filter init *********");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        logger.info("*******  filter start *********");
        chain.doFilter(request, response);
        logger.info("*******  filter end *********");

    }

    @Override
    public void destroy() {
        logger.info("*******  filter distroy *********");
    }
}
