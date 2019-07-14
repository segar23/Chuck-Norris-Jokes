package sgp.spring.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {

    private ChuckNorrisQuotes quotes = new ChuckNorrisQuotes();

    @Override
    public String getRandomQuote() {
        return quotes.getRandomQuote();
    }
}
