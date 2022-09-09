package space.loryhndol.fromzerotoexpert;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class indexController {
    @GetMapping("/")
    public String index(){
        return "From Zero To Expert.";
    }

    @GetMapping("/FromZerotoExpert")
    public String fromZeroToExpert(){
        return "嗨，欢迎您来到 from zero to expert.";
    }
}
