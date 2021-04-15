public class FoodStore {
    private String type;
    private String dish;

    public FoodStore(String type, String dish) {
        this.type = type;
        this.dish = dish;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDish() {
        return dish;
    }

    public void setDish(String dish) {
        this.dish = dish;
    }
}
