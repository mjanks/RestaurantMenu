package restaurant;

public class MenuItem {
    private static int currentId = 1;
    private int menuId;
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    public MenuItem(double price, String description, String category, boolean isNew) {
        menuId = currentId;
        currentId++;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }

    public int getId() {
        return menuId;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }
}
