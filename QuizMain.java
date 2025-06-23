import java.util.Scanner;

public class QuizMain {
    public static void main(String[] args) {
        Questions[] questions = Questions.getQuestions();
        char[] correctAnswers = Answers.getCorrectAnswers();
        Scanner sc = new Scanner(System.in);
        int score = 0;

        System.out.println("Welcome to the Java Quiz!");

        for (int i = 0; i < questions.length; i++) {
            Questions q = questions[i];

            System.out.println("Q" + (i + 1) + ": " + q.question);
            System.out.println(q.optionA);
            System.out.println(q.optionB);
            System.out.println(q.optionC);
            System.out.println(q.optionD);
            System.out.print("Your answer (A/B/C/D): ");
            char userAnswer = sc.next().toUpperCase().charAt(0);

            if (userAnswer == correctAnswers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect! Correct answer is: " + correctAnswers[i] + "\n");
            }
        }

        System.out.println("Quiz Finished!");
        System.out.println("Your Score: " + score + "/" + questions.length);
        sc.close();
    }
}
