package org.simple.spbo.web;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 模版测试
 * @author GeL
 *
 */
@Controller
public class TemplateController {
    /**
     * thymeleaf 模板.
     */
    @RequestMapping("/helloHtml")
    public String helloHtml(Map<String,Object> map){
       map.put("hello","from TemplateController.helloHtml");
       return "/helloHtml";
    }
    
    /**
     * freemarker 模版
     * @param map
     * @return
     */
    @RequestMapping("/helloFtl")
    public String helloFtl(Map<String,Object> map){
       map.put("hello","from TemplateController.helloHtml");
       return "/helloFtl";
    }
    
    /**
     * 测试模版下的目录
     * @param map
     * @return
     */
    @RequestMapping("/template/helloFtl")
    public String childTemplate(Map<String,Object> map){
       map.put("hello","from TemplateController.helloHtml");
       return "/childTemplate/helloFtl";
    }
}
