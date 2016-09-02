package org.simple.spbo.web;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

/**
 * 文件上传controller
 * @author GeL
 *
 */
@Controller
@RequestMapping("/file")
public class FileController {

	/**
	 * 显示上传页面
	 * @return
	 */
	@RequestMapping("show")
	public String show(){
		return "/file";
	}
	
	/**
	 * 接收上传文件
	 * @throws IOException 
	 */
	@RequestMapping("upload")
	@ResponseBody
	public String  upload(@RequestParam("file")MultipartFile file,HttpServletRequest request) throws IOException{
		String result = "上传失败";
		if(!file.isEmpty()){
			BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(new File("E:\\workspace\\springBoot\\src\\main\\resources\\upload\\"+file.getOriginalFilename())));
            out.write(file.getBytes());
            out.flush();
            out.close();
            result = "上传成功";
		}
		return result;
	}

	/**
	 * 批量上传页面
	 * @return
	 */
	@RequestMapping("batchShow")
	public String batchShow(){
		return "/batchFile";
	}
	
	
	/**
	 * 批量上传
	 * @return
	 * @throws IOException 
	 */
	@RequestMapping(value = "batchUpload",method= RequestMethod.POST)
	@ResponseBody 
	public String batchUpload(HttpServletRequest request) throws IOException{
		
		List<MultipartFile> files = ((MultipartHttpServletRequest)request).getFiles("file"); 
        MultipartFile file = null;
        BufferedOutputStream stream = null;
        for (int i =0; i< files.size(); ++i) { 
            file = files.get(i); 
            if (!file.isEmpty()) { 
                byte[] bytes = file.getBytes(); 
                stream = new BufferedOutputStream(new FileOutputStream(new File("E:\\workspace\\springBoot\\src\\main\\resources\\upload\\"+file.getOriginalFilename()))); 
                stream.write(bytes); 
                stream.close();
            }
        }
		return "上传成功！";
	}
	
}
