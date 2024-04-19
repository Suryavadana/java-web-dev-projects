package org.example;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class QuizRunner {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        // Create a quiz
        Quiz quiz = new Quiz();

        // Add questions to the quiz

        quiz.addQuestion(new MultipleChoiceQuestion("What is the capital of France?",
                Arrays.asList("Paris", "London", "Berlin", "Rome"), 1));

        quiz.addQuestion(new CheckboxQuestion("Which are colors of the rainbow?",
                Arrays.asList("Red", "Blue", "Green", "Yellow", "Orange", "Purple"),
                Arrays.asList(0, 2, 3, 4))); // Indices of correct answers

        quiz.addQuestion(new TrueOrFalseQuestion("Is the sun a star?", true));

        // Run the quiz
        quiz.runQuiz();
    }
}
