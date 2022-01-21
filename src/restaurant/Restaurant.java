package restaurant;

public class Restaurant {
    public static void main(String[] args) {
        MenuItem item1 = new MenuItem(3.23, "Buffalo wings", "app", true);
        MenuItem item2 = new MenuItem(5.23, "Queso", "app", true);
        MenuItem item3 = new MenuItem(6.50, "Nachos with cheese and stuff", "app", false);
        Menu menu = new Menu();

        menu.addMenuItem(item1);
        menu.addMenuItem(item2);
        menu.addMenuItem(item3);
        menu.printMenu();
        System.out.println();
        menu.printMenuItem(2);
        System.out.println();
        menu.removeMenuItem(2);
        menu.printMenu();

    }
}
