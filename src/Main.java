import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Question> questions = new ArrayList<>();
        File f = new File("questions.csv");

        if (f.exists()) {
            try {
                questions = loadFromCSV(f);
            } catch (Exception e) {
                e.printStackTrace();
                questions = builtInQuestions();
            }
        } else {
            questions = builtInQuestions();
        }

        final List<Question> qlist = questions;
        javax.swing.SwingUtilities.invokeLater(() -> {
            QuizModel model = new QuizModel(qlist);
            QuizView view = new QuizView();
            new QuizController(model, view);
        });
    }

    private static List<Question> builtInQuestions() {
        List<Question> list = new ArrayList<>();
        list.add(new Question(1, "Which planet is known as the Red Planet?",
                new String[]{"Earth", "Mars", "Jupiter", "Venus"}, 1));
        list.add(new Question(2, "Who wrote 'Romeo and Juliet'?",
                new String[]{"Mark Twain", "William Shakespeare", "Jane Austen", "Charles Dickens"}, 1));
        list.add(new Question(3, "Boiling point of water?", new String[]{"90", "95", "100", "105"}, 2));
        return list;
    }

    private static List<Question> loadFromCSV(File file) throws IOException {
        List<Question> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        while ((line = br.readLine()) != null) {
            if (line.trim().isEmpty() || line.startsWith("#")) continue;
            String[] parts = line.split(",", -1);
            int id = Integer.parseInt(parts[0].trim());
            String text = parts[1].trim();
            String[] opts = new String[]{parts[2], parts[3], parts[4], parts[5]};
            int correct = Integer.parseInt(parts[6].trim());
            list.add(new Question(id, text, opts, correct));
        }
        br.close();
        return list;
    }
}
