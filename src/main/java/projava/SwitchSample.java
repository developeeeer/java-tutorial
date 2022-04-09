package projava;

public class SwitchSample {
    public static void main(String[] args) {
        // if
        var a = 3;
        if (a == 1 || a == 2) {
            System.out.println("one-two");
        } else if (a == 3) {
            System.out.println("three");
        } else if (a == 4) {
            System.out.println("four");
        } else {
            System.out.println("other");
        }

        // switch
        switch (a) {
            case 1, 2 -> System.out.println("one-two");
            case 3 -> System.out.println("three");
            case 4 -> System.out.println("four");
            default -> System.out.println("other");

        }

    }
}
