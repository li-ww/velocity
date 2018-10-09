package fun.lww.velocity;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("name", "li");
        model.addAttribute("a", new String[]{"1", "2", "3"});
        Map<String, String> map = new HashMap<>();
        map.put("1", "111");
        map.put("2", "222");
        model.addAttribute("b", map);
        User user = new User();
        user.setName("li");
        user.setAge(24);
        model.addAttribute("user", user);
        return "hello";
    }

}
