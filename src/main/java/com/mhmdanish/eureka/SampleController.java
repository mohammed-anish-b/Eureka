package com.mhmdanish.eureka;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class SampleController {

    @PostMapping("/file")
    public String handleFileUpload(@RequestParam("file") MultipartFile file) {


        return file.toString();

    }
    @GetMapping("/file")
    public String test() {

        return "test";

    }

}
