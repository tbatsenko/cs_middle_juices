import java.util.ArrayList;

public class Juice {
    private Fruit[] ingredients;

    public Juice(Fruit[] ingredients){
        this.ingredients = ingredients;
    }

    public Fruit[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(Fruit[] ingredients) {
        this.ingredients = ingredients;
    }
}
