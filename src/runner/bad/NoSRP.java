package runner.bad;

import shared.utils.Console;
import solid.srp.bad.TextEditor;

public class NoSRP {

    public static void run() {
        Console.write("<No SRP>");
        TextEditor textEditor = new TextEditor();
        textEditor.formatText();
        textEditor.spellCheck();
    }
}
