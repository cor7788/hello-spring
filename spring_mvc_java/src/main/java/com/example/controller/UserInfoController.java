package com.example.controller;

import com.example.domain.UserInfo;
import com.example.exception.DuplicateUserException;
import com.example.exception.UserNotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.File;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserInfoController {

    /*@ExceptionHandler(DuplicateUserException.class)
    public String handleDuplicateUser() {
        return "error/duplicate";
    }*/

    @RequestMapping("/register")
    public String register() {
        return "register";
    }

    @RequestMapping(path = "/signUp", method = RequestMethod.POST)
    public String signUp(@Valid UserInfo userInfo, Errors errors, MultipartFile photo,
                         HttpServletRequest request) throws IOException {
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

    @RequestMapping("/{userId}")
    public String user(@PathVariable Integer userId) {
        // 假设根据 userId 找不到对应的 UserInfo，抛出一个异常
        // 此时服务器会报 500 异常，将其转为 404 更为合适。
        if(123 == userId) throw new UserNotFoundException();
        // DuplicateUserException 使用异常处理方法处理。
        if(456 == userId) throw new DuplicateUserException();
        return "home";
    }

    @RequestMapping(path = "/login", method = RequestMethod.POST)
    public String login(UserInfo userInfo, Model model) {
        model.addAttribute("username", userInfo.getUsername());
        model.addAttribute("id", userInfo.getId());
        return "redirect:/user/{username}";
    }

    @RequestMapping(path = "login2", method = RequestMethod.POST)
    public String login2(UserInfo userInfo, RedirectAttributes model) {
        model.addAttribute("username", userInfo.getUsername());
        model.addFlashAttribute("userInfo", userInfo);
        return "redirect:/user/{username}";
    }

    @RequestMapping("/{username}")
    public String user(@PathVariable String username, Model model) {
        // 如果 Model 对象中没有 userInfo 属性
        if(!model.containsAttribute("userInfo")) {
            // 根据username 查询 UserInfo
        }
        return "home";
    }
}
