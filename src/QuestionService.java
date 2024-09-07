import java.util.Scanner;

public class QuestionService {

    Question[] questions = new Question[5];
    String[] selection = new String[5];

    public QuestionService() {
        questions[0] = new Question(1, "Size of int.", "2", "6", "4", "8", "4");
        questions[1] = new Question(2, "Size of double.", "2", "6", "4", "8", "8");
        questions[2] = new Question(3, "Size of char.", "2", "6", "4", "8", "2");
        questions[3] = new Question(4, "Size of long.", "2", "6", "4", "8", "8");
        questions[4] = new Question(5, "Size of boolean.", "1", "2", "4", "8", "1");


    }

    public void playQuiz() {
        int i = 0;
        for (Question q : questions) {
            System.out.print("Question "+ q.getId()+": ");
            System.out.println(q.getQuestion());
            System.out.print("          :> "+q.getOpt1()+" bytes");
            System.out.println("   :> "+q.getOpt2()+" bytes");
            System.out.print("          :> "+q.getOpt3()+" bytes");
            System.out.println("   :> "+q.getOpt4()+" bytes");
            System.out.print("Your Answer is:");
            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();
            i++;

        }


        System.out.print("\n");
    }

    public void printScore() {
        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            Question que = questions[i];
            String answer = que.getAnswer();
            String userAnswer = selection[i];
            if (answer.equals(userAnswer)) {
                score++;
            }
        }
        System.out.println("Total Score :"+score+"/5");

        System.out.println("Percentage : "+(score*100)/5+"%");
    }
}