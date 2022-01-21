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
            System.out.println("Id: " + item.getId() + "\tDescription: " + item.getDescription() +
                    "\tPrice: $" + item.getPrice());
        }
    }

    public void printMenuItem(int id) {
        for(int i=0; i < menuItems.size(); i++) {
            if(menuItems.get(i).getId() == id) {
                System.out.println("Id: " + menuItems.get(i).getId() + "\tDescription: "
                        + menuItems.get(i).getDescription() + "\tPrice: $" + menuItems.get(i).getPrice());
            }
        }
    }

}
