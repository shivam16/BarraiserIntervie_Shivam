import com.barraiser.interview.question.Question;
import com.barraiser.interview.quiz.Quiz;
import com.barraiser.interview.quiz.QuizLaunchUtil;
import com.barraiser.interview.users.User;

/**
 * Design and Develop APIs for a Quiz.
 * As part of creating quiz, following actions have to be performed through APIs
 * Creating a Quiz, (A quiz will consist of multiple questions)
 * Creating a Question (One question could be part of multiple quiz)
 * Creating possible answers to a question
 * Listing the quizzes in a paginated manner.
 * Submitting response for a Quiz, a quiz could have multiple responses, one for each submission
 * Instructions:
 * Use an in-memory or an external database like HSQLDB, SQLite, Postgres etc for performing operations on the data.
 * Write a few Unit Tests as a demonstration.
 * Try to be as close as possible to production quality coding conventions
 * Handle failures wherever applicable
 * Since time is limited, please prioritize tasks in the order they have been mentioned in the problem.
 */
public class Main
{
    public static void main(String[] args)
    {
        Question question1 = new Question(1, "Capital City of India");
        question1.setDescription("Which among the following cities is capital city of India?");
        question1.addPossibleAnswer("New Delhi");
        question1.addPossibleAnswer("Mumbai");
        question1.addPossibleAnswer("Kolkata");
        question1.addPossibleAnswer("Chennai");

        Question question2 = new Question(2, "Capital City of USA");
        question2.setDescription("Which among the following cities is capital city of USA?");
        question2.addPossibleAnswer("Washington DC");
        question2.addPossibleAnswer("Texas");
        question2.addPossibleAnswer("Calfornia");
        question2.addPossibleAnswer("New York");

        Quiz quiz = new Quiz(1, "testQuiz");
        quiz.addQuestion(question1);
        quiz.addQuestion(question2);

        User user1 = new User(1, "Shivam");
        QuizLaunchUtil.launchQuiz(quiz, 1, user1);
    }
}
