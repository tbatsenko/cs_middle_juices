import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JuiceFactory implements JuiceCreator{
    private Fruit[] juiceRecepie;


    public JuiceFactory(){
        juiceRecepie = new Fruit[] {};
    }

    public boolean getRecipie(){
        System.out.println("You are going to create a new juice!\n");
        Scanner scanner = new Scanner( System.in );


        System.out.println("Would you like to create a new recepie? Type 'yes' or 'no' \n" );
        String input = scanner.nextLine();

        while(!input.contains("yes") && !input.contains("no")){
            System.out.println(input);
            System.out.println("Incorrect input! Try again: \n");
            input = scanner.nextLine();
        }

        if (input.contains("no")) {
            System.out.println("Please, pick some existing recipies: \n");
            System.out.println(java.util.Arrays.asList(Recepies.values()));
            System.out.println("Print recipie number: \n");
            input = scanner.nextLine();
            int numOfRecepie = Integer.parseInt(input);

            while (numOfRecepie >= Recepies.values().length || numOfRecepie < 0){
                System.out.println("Incorrect input! Try again: \n");
                input = scanner.nextLine();
                numOfRecepie = Integer.parseInt(input);
            }

            Recepies[] recepies = Recepies.values();
            System.out.println(numOfRecepie);

            System.out.println("Congrads! We made " + recepies[numOfRecepie].name());

        }

        if (input.contains("yes")) {

            ArrayList newRecipie = new ArrayList();

            System.out.println("Please, add some fruits from this list to your recipie: \n");
            System.out.println(java.util.Arrays.asList(Fruit.values()));

            System.out.println("Print fruit number that you want to add: \n");
            input = scanner.nextLine();
            int numOfFruit = Integer.parseInt(input);

            while (numOfFruit >= Fruit.values().length || numOfFruit < 0){
                System.out.println("Incorrect input! Try again: \n");
                input = scanner.nextLine();
                numOfFruit = Integer.parseInt(input);
            }

            Fruit[] fruits = Fruit.values();
            System.out.println(numOfFruit);

            System.out.println("You added " + fruits[numOfFruit].toString() + "\n");
            newRecipie.add(fruits[numOfFruit]);

            System.out.println("Do you want to add more fruits to your recipie?");
            input = scanner.nextLine();

            if (input.contains("no")) {
                Juice newJuice = new Juice((Fruit[]) newRecipie.toArray());
                System.out.println("We made a new juice!" + newJuice);
            }

            if (input.contains("yes")) {
                System.out.println(java.util.Arrays.asList(Fruit.values()));

                System.out.println("Print fruit number that you want to add: \n");
                input = scanner.nextLine();
                numOfFruit = Integer.parseInt(input);

                while (numOfFruit >= Fruit.values().length || numOfFruit < 0){
                    System.out.println("Incorrect input! Try again: \n");
                    input = scanner.nextLine();
                    numOfFruit = Integer.parseInt(input);
                }

                System.out.println(numOfFruit);

                System.out.println("You added " + fruits[numOfFruit].toString() + "\n");
                newRecipie.add(fruits[numOfFruit]);

                System.out.println("Do you want to add more fruits to your recipie?");
                input = scanner.nextLine();

                if (input.contains("no")) {
                    Juice newJuice = new Juice((Fruit[]) newRecipie.toArray());
                    System.out.println("We made a new juice!" + newJuice);
                }

                if (input.contains("yes")) {
                }


            }
            // TODO: support more than 3 fruits


            while(!java.util.Arrays.asList(Fruit.values()).contains(input)){
                System.out.println("Incorrect input! Try again: \n");
                input = scanner.nextLine();
            }
        }
        
        return false;
    }

    public String makeJuice(ArrayList<Fruit> ingredients) {

        return null;
    }
}
