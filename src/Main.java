import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int action;
        Cat[] allCats = new Cat[4];
        allCats[0] = new Cat("Барсик", 10, false);
        allCats[1] = new Cat("Мурзик", 21, false);
        allCats[2] = new Cat("Черныш", 12, false);
        allCats[3] = new Cat("Белый", 34, false);


        Plate plate = new Plate(50);
        plate.info();
        for (int i = 0; i < allCats.length; i++) {
            if (allCats[i].fullness == false && allCats[i].appetite < plate.food){
                allCats[i].eat(plate);
                allCats[i].fullness = true;
                System.out.println("КОТ " + allCats[i].name + " покушал!");
            } else {
                System.out.println("КОТ " + allCats[i].name + " не покушал!");
            }
        }
        plate.info();
        System.out.println("сколько добавить корма?");
        action = sc.nextInt();
        plate.increaseFood(action);
        plate.info();
    }

}
