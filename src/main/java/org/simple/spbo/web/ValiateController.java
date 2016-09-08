package org.simple.spbo.web;

import java.util.List;

import org.simple.spbo.entity.ValiateEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 验证信息测试类
 * @author GeL
 *
 */
@Controller
@RequestMapping("/valiate")
public class ValiateController {

	@RequestMapping("demo")
	public String demo(Model model){
		model.addAttribute("entity",new ValiateEntity());
		return "/valiate";
	}
	
	@RequestMapping("addEntity")
	public String addEntity(@Validated ValiateEntity entity,BindingResult result,Model model){
		model.addAttribute("entity",entity);
		if(result.hasErrors()){
			List<ObjectError> errors = result.getAllErrors();
			for(ObjectError er:errors){
				System.out.println(er.getCode()+"---"+er.getArguments()+"---"+er.getDefaultMessage());
			}
			return "valiate";
		}
		return "/valiate";
	}
	
}
