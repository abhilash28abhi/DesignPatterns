package behavioral.strategy.editor;

import behavioral.strategy.textformatter.TextFormatter;

public class TextEditor {

    private final TextFormatter textFormatter;

    public TextEditor(TextFormatter textFormatter) {
        this.textFormatter = textFormatter;
    }

    public void publishText(String text) {
        textFormatter.format(text);
    }
}
