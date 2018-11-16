package behavioral.strategy.textformatter.impl;

import behavioral.strategy.textformatter.TextFormatter;

public class CapTextFormatter implements TextFormatter {

    @Override
    public void format(String text) {
        System.out.println("[CapTextFormatter]: " + text.toUpperCase());
    }
}
