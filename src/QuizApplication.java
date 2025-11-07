import java.util.Scanner;

public class QuizApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] questions = {
                "1. Which language is used for Android app development?",
                "2. Who developed Java Programming Language?",
                "3. Which keyword is used to inherit a class in Java?",
                "4. Which of these is not a Java feature?",
                "5. Which method is used to start a thread in Java?"
        };

        String[][] options = {
                {"A. Kotlin", "B. Python", "C. JavaScript", "D. Swift"},
                {"A. James Gosling", "B. Dennis Ritchie", "C. Bjarne Stroustrup", "D. Guido van Rossum"},
                {"A. extends", "B. implement", "C. inherit", "D. import"},
                {"A. Object-Oriented", "B. Portable", "C. Dynamic", "D. Pointer Manipulation"},
                {"A. start()", "B. run()", "C. execute()", "D. init()"}
        };

        char[] answers = {'A', 'A', 'A', 'D', 'A'};
        int score = 0;

        System.out.println("🧠 Welcome to the Java Quiz!");
        System.out.println("-----------------------------");

        for (int i = 0; i < questions.length; i++) {
            System.out.println("\n" + questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }
            System.out.print("Enter your answer (A/B/C/D): ");
            char userAnswer = Character.toUpperCase(sc.next().charAt(0));

            if (userAnswer == answers[i]) {
                System.out.println("✅ Correct!");
                score++;
            } else {
                System.out.println("❌ Wrong! The correct answer is " + answers[i]);
            }
        }

        System.out.println("\n-----------------------------");
        System.out.println("Your final score: " + score + " / " + questions.length);
        System.out.println("Thank you for playing!");
        System.out.println("-----------------------------");

        sc.close();
    }
}