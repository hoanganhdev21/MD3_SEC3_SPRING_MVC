package org.example.md3_sec3_spring_mvc.ra.controller;


import org.example.md3_sec3_spring_mvc.ra.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


//@Controller là một annotation trong Java Spring MVC được sử dụng để đánh dấu một lớp Java là một controller. Các controller là các lớp chịu trách nhiệm xử lý các yêu cầu HTTP từ người dùng và trả về các phản hồi HTTP.
//Một lớp controller được đánh dấu bằng @Controller phải có một phương thức được đánh dấu bằng @RequestMapping. Phương thức này sẽ được gọi khi một yêu cầu HTTP đến khớp với đường dẫn được chỉ định bởi @RequestMapping.
@Controller
public class UserController {
    // Hàm register() có annotation @GetMapping("/register), nghĩa là hàm này sẽ được gọi khi người dùng truy cập vào đường dẫn /register. Hàm này có một tham số là model, là một đối tượng của lớp Model. Lớp Model được sử dụng để truyền dữ liệu từ controller sang view.
    // Khi người dùng truy cập vào đường dẫn /register, hàm register() sẽ được gọi.
    // Hàm register() sẽ tạo một đối tượng User mới.
    // Hàm register() sẽ truyền đối tượng user cho view register.
    // View register sẽ được hiển thị cho người dùng.
    @GetMapping("/register")
    public String register(Model model){
        // khởi tạo đối user new
        User user = new User();
        // mang dũ liệu sang view
        // Gán đối tượng user cho tham số model
        model.addAttribute("user", user);
        return "register"; // => trả về
    }

    // Chờ đợi yêu cầu đăng ký: @PostMapping("/post-register"): Dán nhãn cho phương thức này để xử lý các yêu cầu POST được gửi đến địa chỉ web "/post-register". Đây là nơi thường được sử dụng để gửi dữ liệu biểu mẫu, chẳng hạn như thông tin đăng ký.
    // Nhận thông tin người dùng: @ModelAttribute("user") User user: Tự động lấy thông tin người dùng được gửi từ biểu mẫu và đóng gói chúng vào đối tượng User. Điều này giúp bạn dễ dàng truy cập và làm việc với dữ liệu người dùng.
    @PostMapping("/post-register")
    public String postRegister(@ModelAttribute("user") User user){
        // In thông tin để kiểm tra
        System.out.println(user.getFullName());
        System.out.println(user.getEmail());
        System.out.println(user.getPassword());
        // Chuyển hướng đến trang chủ
        return "redirect:/"; // Gửi lệnh cho trình duyệt chuyển hướng đến trang chủ của trang web (/) sau khi xử lý đăng ký xong.
    }
}
