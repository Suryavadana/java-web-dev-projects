package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Quiz {
    protected List<Question> questions;

    public Quiz() {
        this.questions = new ArrayList<>();
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void runQuiz() {
        Scanner scanner = new Scanner(System.in);
        for (Question question : questions) {
            question.displayQuestion();
            question.displayPossibleAnswer();
            System.out.print("Enter your answer: ");
            int userAnswer = scanner.nextInt();
            boolean isCorrect = question.checkAnswer(userAnswer);
            System.out.println(isCorrect ? "Correct!" : "Incorrect!");
        }
        scanner.close();
    }
}
