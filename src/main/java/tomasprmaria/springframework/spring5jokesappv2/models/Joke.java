package tomasprmaria.springframework.spring5jokesappv2.models;

public class Joke {

    private String joke;

    public Joke(String joke) {
        this.joke = joke;
    }

    public String getJoke() {
        return joke;
    }

    public void setJoke(String joke) {
        this.joke = joke;
    }
}
