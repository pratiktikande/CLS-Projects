public class Questions extends QuizMain{
    String question;
    String optionA;
    String optionB;
    String optionC;
    String optionD;

    // Constructor
    public Questions(String question, String optionA, String optionB, String optionC, String optionD) {
        this.question = question;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
    }

    // Static method to return array of questions
    public static Questions[] getQuestions() {
        Questions[] questionList = new Questions[11];

        questionList[0] = new Questions(
            "What is the capital of India?",
            "A. Mumbai", "B. Delhi", "C. Kolkata", "D. Chennai"
        );

        questionList[1] = new Questions(
            "Which keyword is used to define a class in Java?",
            "A. method", "B. void", "C. class", "D. public"
        );

        questionList[2] = new Questions(
            "Which of the following is not a data type in Java?",
            "A. int", "B. float", "C. boolean", "D. real"
        );

        questionList[3] = new Questions(
            "Which loop is guaranteed to run at least once?",
            "A. for", "B. while", "C. do-while", "D. if"
        );

        questionList[4] = new Questions(
            "Which operator is used for comparison?",
            "A. =", "B. ==", "C. !=", "D. +="
        );

        questionList[5] = new Questions(
            "What is the capital of Australia?",
            "A.  Sydney", "B. Melbourne", "C. Canberra", "D. Brisbane"
        );

        questionList[6] = new Questions(
            "Which planet is known as the Red Planet?",
            "A. Earth", "B. Jupiter", "C. Mars", "D. Saturn"
        );

        questionList[7] = new Questions(
            "Who wrote the national anthem of India?",
            "A.  Bankim Chandra Chatterjee", "B. Rabindranath Tagore", "C. Sarojini Naidu", "D. Subhash Chandra Bose"
        );

        questionList[8] = new Questions(
            "What is the boiling point of water at sea level?",
            "A. 90°C", "B. 100°C", "C. 110°C", "D. 120°C"
        );

        questionList[9] = new Questions(
            "Which continent is the largest by land area?",
            "A.  Africa", "B. North America", "C. Asia", "D. Europe"
        );

        return questionList;
    }
}
