import java.util.ArrayList;

public enum Recepies {
    APPLEJUICE(Fruit.APPLE), PEARJUICE(Fruit.PEAR), GRAPEAPPLEJUICE(new Fruit[] {Fruit.APPLE, Fruit.GRAPE});

    Recepies(Fruit name) {

    }

    Recepies(Fruit[] ingredients) {

    }


}
