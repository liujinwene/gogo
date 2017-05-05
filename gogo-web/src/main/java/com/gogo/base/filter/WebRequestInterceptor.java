// @formatter:off
package com.gogo.base.filter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class WebRequestInterceptor implements HandlerInterceptor {

	private static final String COOKIE_KEY = "key";
	
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		
		Cookie[] cookies = request.getCookies();
		if(cookies == null || cookies.length <= 0) {
			Cookie cookie = new Cookie(COOKIE_KEY, "test");
			response.addCookie(cookie);
		} else {
			for(Cookie cookie : cookies) {
				if(cookie.getName().equals(COOKIE_KEY)) {
					System.out.println(cookie.getName() + "=" + cookie.getValue());
				}
			}
		}
		
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		
	}
   
}
