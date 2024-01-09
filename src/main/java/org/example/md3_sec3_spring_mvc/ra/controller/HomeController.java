package org.example.md3_sec3_spring_mvc.ra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    // @RequestMapping("/") ánh xạ phương thức xử lý home() với đường dẫn URL là "/".
    // Khi người dùng truy cập vào URL "/" thì phương thức xử lý home() sẽ được thực thi.
    // Phương thức xử lý home() trả về chuỗi văn bản có giá trị là "home".
    @RequestMapping("/")
    public String home() {
        return "home";
    }

    // Annotation @GetMapping map một request HTTP GET tới một method trong controller.
    // Phương thức about() trả về một chuỗi.
    // Khi một request HTTP GET được gửi tới URL /about, Spring MVC sẽ gọi method about() và trả về chuỗi đó.
    @GetMapping("/about")
    public String about() {
        return "about";
    }
}
