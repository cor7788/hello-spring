package com.example.controller;

import com.example.domain.UserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.File;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserInfoController {

    @RequestMapping("/register")
    public String register() {
        return "register";
    }

    @RequestMapping(path = "/signUp", method = RequestMethod.POST)
    public String signUp(@Valid UserInfo userInfo, Errors errors, MultipartFile photo, HttpServletRequest request) throws IOException {
        if (errors.hasErrors()) {
            List<ObjectError> list = errors.getAllErrors();
            for (ObjectError error : list) {
                System.out.println(error);
            }
        }
        String realPath = request.getServletContext().getRealPath("/tmp/" + photo.getOriginalFilename());
        File file = new File(realPath);
        if(!file.exists()) file.mkdirs();
        photo.transferTo(file);
        System.out.println(userInfo);
        return "redirect:/index.jsp";
    }
}
