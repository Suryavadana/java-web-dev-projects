package org.example;

import java.util.List;
public class CheckboxQuestion extends Question{
    protected List<Integer> correctAnswerIndices;

    public CheckboxQuestion(String questionText, List<String> possibleAnswers, List<Integer> correctAnswerIndices) {
        super(questionText, possibleAnswers);
        this.correctAnswerIndices = correctAnswerIndices;
    }

    @Override
    public boolean checkAnswer(int answerIndex) {
        return correctAnswerIndices.contains(answerIndex);
    }
}
