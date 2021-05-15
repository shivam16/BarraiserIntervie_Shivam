package com.barraiser.interview.quiz;

import com.barraiser.interview.question.Question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Quiz
{
    private final int id;
    private String name;
    private List<Question> questions = new ArrayList<>();
    private final String NEWLINE = "\n";

    public Quiz(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public List<Question> getQuestions()
    {
        return Collections.unmodifiableList(questions);
    }

    public void addQuestion(Question question)
    {
        questions.add(question);
    }

    public void removeQuestion(Question question)
    {
        questions.remove(question);
    }

    @Override
    public String toString()
    {
       StringBuilder sb = new StringBuilder();

       sb.append("Welcome to Quiz: ");
       sb.append(name);
       sb.append(NEWLINE);

       int questionNumber = 1;
       for(Question question : questions)
       {
           sb.append(questionNumber++);
           sb.append(" . ");
           sb.append(question);
           sb.append(NEWLINE);
       }
        return sb.toString();
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quiz quiz = (Quiz) o;
        return id == quiz.id && Objects.equals(name, quiz.name) && Objects.equals(questions, quiz.questions);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(id, name, questions);
    }
}
