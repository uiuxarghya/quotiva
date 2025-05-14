package dev.arghya.quotiva.service;

import dev.arghya.quotiva.model.Quote;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import java.io.IOException;
import java.util.List;
import java.util.Random;

@Service
public class QuoteService {
    private List<Quote> quotes;

    @PostConstruct
    public void loadQuotes() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        quotes = mapper.readValue(
                new ClassPathResource("data/quotes.json").getInputStream(),
                new TypeReference<List<Quote>>() {
                });
    }

    public Quote getRandomQuote() {
        return quotes.get(new Random().nextInt(quotes.size()));
    }
}
