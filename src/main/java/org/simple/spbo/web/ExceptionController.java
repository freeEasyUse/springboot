package org.simple.spbo.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * 异常统一处理
 * @author GeL
 *
 */
@ControllerAdvice
public class ExceptionController {

	/**
	 * 拦截抛出的异常
	 */
	@ExceptionHandler(value = Exception.class)
	public void defaultErrorHandler(HttpServletRequest req, Exception e){
	      //打印异常信息：
	       //e.printStackTrace();
	       System.out.println("GlobalDefaultExceptionHandler.defaultErrorHandler()");
	}
	
}
