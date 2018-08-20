package com.hand.controller;

import com.hand.entity.Access;
import com.hand.service.IAccessService;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.HashMap;
import java.util.Map;

/**
 * @author bce1100
 */
@Controller
@RequestMapping("/api")
public class HelloController extends BaseController{
    @Autowired
    IAccessService accessService;

    @RequestMapping("/hello")
    public void doHello(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        Long count = accessService.plusTimes();
        response.getWriter().append("api_name:" + accessService.getAPI().getApiName() + "\t times:" + count);
    }

    @RequestMapping("/access")
    @ResponseBody
    public Access responseBodyTest(Access access){
        return access;
    }

/*    @RequestMapping("/getAccess")
    public Access getAccess(@RequestBody @Validated Access access, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            Map<String,Object> errors = new HashMap(1);
            for(FieldError error:bindingResult.getFieldErrors()){
                errors.put(error.getField(),error.getDefaultMessage());
            }
            throw new IllegalArgumentException(String.valueOf(errors));
        }
        return access;
    }*/

    @RequestMapping("/getAccess")
    @ResponseBody
    public Access getAccess(@Validated Access access,BindingResult bindingResult){
        if(bindingResult.hasErrors()){
        Map<String,Object> errors = new HashMap(1);
        for(FieldError error:bindingResult.getFieldErrors()){
            errors.put(error.getField(),error.getDefaultMessage());
        }
        throw new IllegalArgumentException(String.valueOf(errors));
    }
        return access;
    }

    @RequestMapping("/upload")
    @ResponseBody
    public String upload(@RequestParam String name, @RequestParam MultipartFile file) throws IOException {
        OutputStream outputStream = Files.newOutputStream(Paths.get
                ("D:/2/demo/" + name), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
        outputStream.write(file.getBytes());
        return Paths.get("D:/2/demo/" + name).toString();
    }

    @RequestMapping("/download")
    public void download(HttpServletResponse response) throws IOException {
        String fileName = "D:/2/demo/3434";
        OutputStream outputStream= response.getOutputStream();
        response.setHeader("Content-Disposition" ,"attachment; filename=dota.txt");
        outputStream.write(FileUtils.readFileToByteArray(new File(fileName)));
    }
}
