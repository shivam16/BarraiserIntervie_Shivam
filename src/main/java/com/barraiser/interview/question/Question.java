package com.barraiser.interview.question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Question
{
    private final int id;
    private String summary;
    private String description;
    private List<String> possibleAnswers = new ArrayList<>();
    private final String NEWLINE = "\n";

    public Question(int id, String summary)
    {
        this.id = id;
        this.summary = summary;
    }

    public int getId()
    {
        return id;
    }

    public String getDescription()
    {
        return description;
    }

    public String getSummary()
    {
        return summary;
    }

    public List<String> getPossibleAnswers()
    {
        return Collections.unmodifiableList(possibleAnswers);
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public void setSummary(String summary)
    {
        this.summary = summary;
    }

    public void addPossibleAnswer(String possibleAnswer)
    {
        possibleAnswers.add(possibleAnswer);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question question = (Question) o;
        return id == question.id && Objects.equals(summary, question.summary) && Objects.equals(description, question.description) && Objects.equals(possibleAnswers, question.possibleAnswers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, summary, description, possibleAnswers);
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(summary);
        sb.append(NEWLINE);
        sb.append(description);
        sb.append(NEWLINE);
        sb.append("Options: ");
        sb.append(NEWLINE);

        int optionNumber = 1;
        for(String possibleAnswer : possibleAnswers)
        {
            sb.append(optionNumber++);
            sb.append(" . ");
            sb.append(possibleAnswer);
            sb.append(NEWLINE);
        }

        return sb.toString();
    }
}
