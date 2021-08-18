package tomasprmaria.springframework.spring5jokesappv2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import tomasprmaria.springframework.spring5jokesappv2.models.Joke;
import tomasprmaria.springframework.spring5jokesappv2.services.GenerateJokeService;

@Controller
public class GenerateJokeController {

    public final GenerateJokeService generateJokeService;

    public GenerateJokeController(GenerateJokeService generateJokeService) {
        this.generateJokeService = generateJokeService;
    }

    @RequestMapping("/")
    public String GenerateJoke(Model model) {
        model.addAttribute("joke", new Joke(generateJokeService.getJoke()));
        return "index";
    }
}
