package Studio;
import java.util.List;
public class Question {
    protected String questionText;
    protected List<String> possibleAnswers;

    public Question(String questionText, List<String> possibleAnswers) {
        this.questionText = questionText;
        this.possibleAnswers = possibleAnswers;
    }

    public void displayQuestion(){
        System.out.println(questionText);
    }

    public void displayPossibleAnswer(){
        int index=1;
        for(String answer: possibleAnswers )
        {
            System.out.println(index + ": " + answer);
            index++;
        }
    }

    public boolean checkAnswer(int answerIndex){
        return false;
    }
}
