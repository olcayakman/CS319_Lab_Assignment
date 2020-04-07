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

        System.out.println(sorted);

        System.out.println("Successfully reverted in Git");

    }

}