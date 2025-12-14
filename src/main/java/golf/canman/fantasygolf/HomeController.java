package golf.canman.fantasygolf;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Canman Fantasy Golf is live 🏌️‍♂️";
    }
}
