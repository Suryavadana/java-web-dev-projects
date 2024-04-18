package Studio;
import java.util.List;
public class MultipleChoiceQuestion extends Question{
    protected int correctAnswerIndex;

    public MultipleChoiceQuestion(String questionText, List<String> possibleAnswers, int correctAnswerIndex) {
        super(questionText, possibleAnswers);
        this.correctAnswerIndex = correctAnswerIndex;
    }

    @Override
    public boolean checkAnswer(int answerIndex) {
        return answerIndex==correctAnswerIndex;
    }
}
