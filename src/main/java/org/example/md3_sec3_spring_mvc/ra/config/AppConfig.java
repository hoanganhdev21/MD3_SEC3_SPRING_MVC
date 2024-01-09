package org.example.md3_sec3_spring_mvc.ra.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@Configuration // Annotation này chỉ định rằng lớp chứa nó là một cấu hình Spring. Một cấu hình Spring là một lớp định nghĩa cách cấu hình ứng dụng Spring.
@EnableWebMvc // Annotation này bật hỗ trợ Spring MVC cho ứng dụng. Spring MVC là một khuôn khổ MVC (Model-View-Controller) cho Java.
@ComponentScan(basePackages = "org.example.md3_sec3_spring_mvc.ra") // Annotation này chỉ định rằng Spring nên quét các lớp trong gói được chỉ định để tìm các thành phần Spring. Trong trường hợp này, gói là "org.example.md3_sec3_spring_mvc.ra".
/**
 * The AppConfig class is a configuration class that sets up a view resolver for JSP views in a Java
 * web application.
 */
public class AppConfig implements WebMvcConfigurer {
    // Annotation @Bean được sử dụng để định nghĩa một bean trong Spring. Một bean là một đối tượng được tạo ra và quản lý bởi Spring IoC container.
    // Cách sử dụng annotation @Bean rất đơn giản. Bạn chỉ cần đánh dấu một phương thức trong một lớp có annotation @Configuration là một bean. Phương thức này sẽ được Spring gọi để tạo ra bean.
    @Bean
    // public ViewResolver viewResolver() { ... }định nghĩa một phương thức tạo và trả về công cụ này.
    public ViewResolver viewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver(); // tạo một phiên bản của công cụ được thiết kế đặc biệt để xử lý các trang JSP.
        viewResolver.setPrefix("/views/"); // yêu cầu công cụ tìm kiếm các trang JSP trong thư mục có tên "views".
        viewResolver.setSuffix(".jsp"); // hướng dẫn nó mong đợi các tệp kết thúc bằng ".jsp" là các trang JSP thực tế.
        return viewResolver; // trả về công cụ đã được cấu hình để Spring có thể sử dụng nó để tìm và hiển thị các trang JSP.
    }
}
