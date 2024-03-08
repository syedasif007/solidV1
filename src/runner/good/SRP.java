package runner.good;

import shared.utils.Console;
import solid.srp.good.SpellChecker;
import solid.srp.good.TextEditor;

public class SRP {

    public static void run() {
        Console.write("<SRP>");
        TextEditor textEditor = new TextEditor();
        textEditor.formatText();

        SpellChecker spellChecker = new SpellChecker();
        spellChecker.spellCheck();
    }
}
