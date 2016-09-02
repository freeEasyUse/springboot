package org.simple.spbo.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 异常抛出
 */
@ControllerAdvice
public class ExceptionController {

	/**
	 * 所有的异常到这里进行处理
	 */
	@ExceptionHandler(value = Exception.class)
	@ResponseBody
	public String defaultErrorHandler(HttpServletRequest req, Exception e){
	       //e.printStackTrace();
	       System.out.println("GlobalDefaultExceptionHandler.defaultErrorHandler()");
	       return "系统异常了";
	}
	
}
