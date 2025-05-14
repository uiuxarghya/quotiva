package dev.arghya.quotiva.controller;

import dev.arghya.quotiva.model.Quote;
import dev.arghya.quotiva.service.QuoteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QuoteController {

    private final QuoteService quoteService;

    public QuoteController(QuoteService quoteService) {
        this.quoteService = quoteService;
    }

    @GetMapping("/")
    public String home(Model model) {
        Quote quote = quoteService.getRandomQuote();
        model.addAttribute("quote", quote);
        return "index";
    }

}
