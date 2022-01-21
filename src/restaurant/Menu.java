package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private Date lastUpdated;

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void addMenuItem(MenuItem itemToAdd) {
        menuItems.add(itemToAdd);
    }

    public void removeMenuItem(int id) {
        for(int i=0; i < menuItems.size(); i++) {
            if(menuItems.get(i).getId() == id) {
                menuItems.remove(i);
            }
        }
    }

    public boolean isNew(int id) {
        for(int i=0; i < menuItems.size(); i++) {
            if(menuItems.get(i).getId() == id) {
                return menuItems.get(i).isNew();
            }
        }
        return false;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void printMenu() {
        for(MenuItem item : menuItems) {
            System.out.println("Id: " + item.getId() + " Description: " + item.getDescription() +
                    " Price: " + item.getPrice());
            System.out.println();
        }
    }

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
