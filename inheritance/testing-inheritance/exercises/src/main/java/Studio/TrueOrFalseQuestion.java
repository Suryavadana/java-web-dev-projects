package Studio;

import java.util.Arrays;

public class TrueOrFalseQuestion extends Question{
    protected boolean correctAnswer;

    public TrueOrFalseQuestion(String questionText, boolean correctAnswer) {
        super(questionText,  Arrays.asList("True", "False"));
        this.correctAnswer = correctAnswer;
    }

    @Override
    public boolean checkAnswer(int answerIndex) {
        // Assuming correctAnswer is represented by index 1 for "True" and index 2 for "False"
        if (correctAnswer) {
            return answerIndex == 1;
        } else {
            return answerIndex == 2;
        }
    }
}
