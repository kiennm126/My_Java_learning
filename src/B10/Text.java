package B10;

public class Text {
    private String text;

    public Text() {
        this.text = "";
    }

    public Text(String st) {
        this.text = st;
    }

    public int countWords() {
        String[] words = text.trim().split("\\s+");
        return words.length;
    }

    public int countCharactersA() {
        String lowerCaseText = text.toLowerCase();
        int count = 0;
        for (int i = 0; i < lowerCaseText.length(); i++) {
            if (lowerCaseText.charAt(i) == 'a') {
                count++;
            }
        }
        return count;
    }

    public void standardizeText() {
        text = text.trim().replaceAll("\\s+", " ");
    }

    public String getText() {
        return text;
    }

    public void setText(String st) {
        this.text = st;
    }
}