package ch7.arrayListCollection;

import java.util.ArrayList;

public class ArrayListCollection {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<String>();
        items.add("RED");
        items.add(0, "YELLOW");

        System.out.print("Display list contents with counter-controlled loop: ");
        for (int i = 0; i < items.size(); i++) {
            System.out.printf("%s ", items.get(i));
        }
        display(items, "%nDisplay list contents with enhanced for statement: ");

        items.add("GREEN");
        items.add("BLUE");

        display(items, "List with two new elements: ");

        items.remove("YELLOW");
        display(items, "Remove first instance of yellow: ");

        items.remove(1);
        display(items, "Remove second list element (green): ");

        System.out.printf("\"RED\" is %sin the list%n", items.contains("RED") ? "" : "not ");

        System.out.printf("Size: %d%n", items.size());
    }

    public static void display(ArrayList<String> items, String header) {
        System.out.printf(header);
        for (String item : items) {
            System.out.printf("%s ", item);
        }
        System.out.println();
    }
}
