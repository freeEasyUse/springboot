package org.simple.spbo.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * �쳣ͳһ����
 * @author GeL
 *
 */
@ControllerAdvice
public class ExceptionController {

	/**
	 * �����׳����쳣
	 */
	@ExceptionHandler(value = Exception.class)
	public void defaultErrorHandler(HttpServletRequest req, Exception e){
	      //��ӡ�쳣��Ϣ��
	       e.printStackTrace();
	       System.out.println("GlobalDefaultExceptionHandler.defaultErrorHandler()");
	}
	
}
