package behavioral.strategy.textformatter.impl;

import behavioral.strategy.textformatter.TextFormatter;

public class LowerTextFormatter implements TextFormatter {

    @Override
    public void format(String text) {
        System.out.println("[LowerTextFormatter]: " + text.toLowerCase());
    }
}
