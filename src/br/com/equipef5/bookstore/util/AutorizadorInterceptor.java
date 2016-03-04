package br.com.equipef5.bookstore.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class AutorizadorInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object controller) throws Exception {

	String uri = request.getRequestURI();
	if (uri.contains("bootstrap") || uri.contains("css") || uri.contains("imagens") || uri.contains("js") || uri.endsWith("bookstoreIfpe/")
		|| uri.endsWith("efetuarLogin")) {

	    return true;
	}

	if (request.getSession().getAttribute("administradorLogado") != null) {

	    return true;
	}

	response.sendRedirect("/bookstoreIfpe");
	return false;
    }
}
