package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        StringBuilder phrase = new StringBuilder();
        for (char c : chars) {
            phrase.append(c);
        }
        System.out.println(phrase.toString());
    }
}

