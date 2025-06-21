package LocalRepo.EXTRAS_built_in_Strings;

public class ReplaceWord {
    public static void main(String[] args) {
        String sentence = "Java is fun and Java is powerful";
        String oldWord = "Java";
        String newWord = "Python";

        String modified = sentence.replace(oldWord, newWord);
        System.out.println(modified);
    }
}

