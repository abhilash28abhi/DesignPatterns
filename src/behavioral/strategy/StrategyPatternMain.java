package behavioral.strategy;

import behavioral.strategy.editor.TextEditor;
import behavioral.strategy.textformatter.TextFormatter;
import behavioral.strategy.textformatter.impl.CapTextFormatter;
import behavioral.strategy.textformatter.impl.LowerTextFormatter;

public class StrategyPatternMain {

    public static void main(String[] args) {
        TextFormatter formatter = new CapTextFormatter();
        TextEditor editor = new TextEditor(formatter);
        editor.publishText("Testing text in caps formatter");
        formatter = new LowerTextFormatter();
        editor = new TextEditor(formatter);
        editor.publishText("Testing text in lower formatter");
    }
}
