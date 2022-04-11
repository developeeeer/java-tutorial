package projava;

public class InstanceMethodSample {
    record Student(String name, int score1, int score2) {
        public int average() {
            return (this.score1() + this.score2()) / 2;
        }

        public int maxScore() {
            return Math.max(this.score1(), this.score2());
        }
    }

    ;

    public static void main(String[] args) {
        var kis = new Student("kis", 30, 40);
        var ave = kis.average();
        int max = kis.maxScore();
        System.out.println(ave);
        System.out.println(max);
    }
}
