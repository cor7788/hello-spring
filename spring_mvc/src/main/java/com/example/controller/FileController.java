package com.example.controller;

import com.example.exception.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Controller
public class FileController {

    @RequestMapping("/file")
    public String file() {
        return "file";
    }

    @RequestMapping("/exception")
    public String exception() throws MyException {
        try {
            int i = 10 / 0;
        } catch(Exception e) {
            throw new MyException(e.getMessage());
        }
        return "hello";
    }

    @RequestMapping("/upload")
    public String upload(HttpServletRequest request, MultipartFile file) throws IOException {
        // 创建保存上传文件的目录
        String path = request.getServletContext().getRealPath("/uploads");
        File dirFile = new File(path);
        if(!dirFile.exists()) {
            dirFile.mkdirs();
        }
        // 保存上传文件
        String filename = file.getOriginalFilename();
        filename = UUID.randomUUID() + "_" + filename;
        file.transferTo(new File(dirFile, filename));
        return "success";
    }
}
