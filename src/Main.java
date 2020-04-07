import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();

        list1.add(100);
        list1.add(500);
        list1.add(900);

        list2.add(800);
        list2.add(600);
        list2.add(300);

        list3.add(400);
        list3.add(700);
        list3.add(200);

        ArrayOrganizer ao = new ArrayOrganizer();

        ArrayList<Integer> sorted = ao.concatAndSort(list1, list2, list3);

        System.out.println("Result => " + sorted);

        System.out.println("==================================");

        Player p1, p2, p3, p4;

        p1 = new Player("Tom");
        p2 = new Player ("John");
        p3 = new Player ("James");
        p4 = new Player("Henry");

        Die die = new Die();

        for (int i = 0; i < 5; i++) {
            int dieValue = die.rollDie();
            p1.addScore(dieValue);
        }

        for (int i = 0; i < 5; i++) {
            int dieValue = die.rollDie();
            p2.addScore(dieValue);
        }

        for (int i = 0; i < 5; i++) {
            int dieValue = die.rollDie();
            p3.addScore(dieValue);
        }

        for (int i = 0; i < 5; i++) {
            int dieValue = die.rollDie();
            p4.addScore(dieValue);
        }

        System.out.println(p1.getName() + " has " + p1.getScore() + " points.");
        System.out.println(p2.getName() + " has " + p2.getScore() + " points.");
        System.out.println(p3.getName() + " has " + p3.getScore() + " points.");
        System.out.println(p4.getName() + " has " + p4.getScore() + " points.");



    }

}