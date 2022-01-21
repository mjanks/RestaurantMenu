package restaurant;

public class Restaurant {
    public static void main(String[] args) {
        MenuItem item1 = new MenuItem(3.23, "wings", "app", true);
        MenuItem item2 = new MenuItem(5.23, "queso", "app", true);
        MenuItem item3 = new MenuItem(6.50, "nachos", "app", false);
        System.out.println(item1.getId());
        System.out.println(item2.getId());
        System.out.println(item3.getId());
        Menu menu = new Menu();
        menu.addMenuItem(item1);
        menu.addMenuItem(item2);
        menu.addMenuItem(item3);
        menu.printMenu();

    }
}
