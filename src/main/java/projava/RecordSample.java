package projava;


import java.util.HashMap;

// Javaには構造体がなかったらしい。。。Record結構便利そう
public class RecordSample {
    public static void main(String[] args) {
        Exam exam1 = new Exam("Java", 100);
        Exam exam2 = new Exam("C", 20);
        Exam exam3 = new Exam("Pytho", 60);

        System.out.println("%s:%s".formatted(exam1.name, exam1.score));
        System.out.println("%s:%s".formatted(exam2.name, exam2.score));
        System.out.println("%s:%s".formatted(exam3.name, exam3.score));

        var animals = new HashMap<String, String>();
        animals.put("dog", "犬");
        System.out.println(animals.get("dog"));

    }

    record Exam(String name, int score){}
}
