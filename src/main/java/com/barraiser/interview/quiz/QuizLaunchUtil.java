package com.barraiser.interview.quiz;

import com.barraiser.interview.question.Question;
import com.barraiser.interview.users.User;

import java.util.List;
import java.util.Scanner;

public class QuizLaunchUtil
{
    private static final String NEWLINE = "\n";

    public static QuizResponse launchQuiz(Quiz quiz, int id, User user)
    {
        List<Question> questions = quiz.getQuestions();
        StringBuilder sb = new StringBuilder();
        QuizResponse quizResponse = new QuizResponse(id, user, quiz.getId());

        sb.append("Welcome to Quiz: ");
        sb.append(quiz.getName());
        sb.append(NEWLINE);

        System.out.println(sb.toString());
        System.out.println("Press y when ready");

        Scanner sc= new Scanner(System.in);
        String input = sc.next();
        while(!"y".equals(input))
        {
            input = sc.next();
        }

        int questionNumber = 1;
        for(Question question : questions)
        {
            sb.append("Question");
            sb.append(questionNumber++);
            sb.append(": ");
            sb.append(question);
            sb.append(NEWLINE);

            System.out.println(sb.toString());
            System.out.println("Enter your answer: ");
            String response = sc.next();
            quizResponse.addResponse(response);
        }
        System.out.println("Thanks for taking the quiz. Your response has been recorded.");
        return quizResponse;
    }
}
