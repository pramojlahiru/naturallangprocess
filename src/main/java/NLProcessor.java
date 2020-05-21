import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.Properties;

public class NLProcessor {

    private static Properties properties;

    private static String actionName = "tokenize";

    private static StanfordCoreNLP stanfordNLP;

    public NLProcessor() {

    }

    static {

        properties = new Properties();
        properties.setProperty("annotators", actionName);

    }

    public static StanfordCoreNLP getActionLine() {

        if (stanfordNLP == null) {
            stanfordNLP = new StanfordCoreNLP(properties);
        }

        return stanfordNLP;
    }
}
