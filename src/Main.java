//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        WordMatch w = new WordMatch("concatenation");
        System.out.println(w.scoreGuess("ten"));
        System.out.println(w.scoreGuess("nation"));
        System.out.println(w.findBetterGuess("ten", "nation"));
        System.out.println(w.scoreGuess("con"));
        System.out.println(w.scoreGuess("cat"));
        System.out.println(w.findBetterGuess("con", "cat"));
    }
}