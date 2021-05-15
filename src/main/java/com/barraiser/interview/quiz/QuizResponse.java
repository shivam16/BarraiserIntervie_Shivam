package com.barraiser.interview.quiz;

import com.barraiser.interview.users.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuizResponse
{
    private final int id;
    private final User user;
    private final int quizId;
    private List<String> responses = new ArrayList<>();

    public QuizResponse(int id, User user, int quizId)
    {
        this.id = id;
        this.user = user;
        this.quizId = quizId;
    }

    public int getId()
    {
        return id;
    }

    public int getQuizId()
    {
        return quizId;
    }


    public List<String> getResponses()
    {
        return Collections.unmodifiableList(responses);
    }

    public void addResponse(String answer)
    {
        responses.add(answer);
    }
}
