import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.List;

public class Tokenization {

    public static void main(String[] args) {

        StanfordCoreNLP stanfordCoreNLP = NLProcessor.getActionLine();

        String languageText = "I am Pramoj.";

        CoreDocument coreDocument = new CoreDocument(languageText);

        // test tokenization
        stanfordCoreNLP.annotate(coreDocument);

        // get tokens
        List<CoreLabel> coreLabelList = coreDocument.tokens();

//        for (CoreLabel coreLabel : coreLabelList) {
//            System.out.println(coreLabel.originalText());
//        }
        coreLabelList.forEach(item-> System.out.println(item.originalText()));
    }

}
