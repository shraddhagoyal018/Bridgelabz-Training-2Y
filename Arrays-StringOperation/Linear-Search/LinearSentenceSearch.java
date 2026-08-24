public class LinearSentenceSearch {
    public static void main(String[] args) {
        String[] sentences = {
                "Java is easy to learn",
                "Linear search is simple",
                "Binary search is fast"
        };

        String word = "search";
        String answer = "Not Found";

        for (int i = 0; i < sentences.length; i++) {
            if (sentences[i].contains(word)) {
                answer = sentences[i];
                break;
            }
        }

        System.out.println(answer);
    }
}