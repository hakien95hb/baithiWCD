package java.filter;

import com.googlecode.objectify.ObjectifyService;

import javax.servlet.*;
import java.io.IOException;

public class Myfilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        ObjectifyService.register(entity.Employee.class);
        filterChain.doFilter(servletRequest,servletResponse);
    }

    public void destroy() {

    }
}
