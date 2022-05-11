package tacos.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Slf4j
@Controller
public class HomeController {
    @GetMapping("/home")
    public String home() {
        return "home";
    }
    @PostMapping("/home")
    public String processDesign() {
        return "home";

    }
}
