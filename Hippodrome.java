import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    private List<Horse> horses; //приватное поле horses

    public Hippodrome(List<Horse> horses) { //конструктор класса Hippodrome с одним параметром типа List.
        this.horses = horses; //инициализируем поле horses
    }

    public List<Horse> getHorses() { //Метод для получения списка лошадей ипподрома
        return horses;
    }

    static Hippodrome game; //статическое поле game типа Hippodrome

    //Добавляем методы run, move и print без параметров:
    void run(){ //забег
        for (int i = 0; i<100; i++){
            move();
            print();
            try {
                Thread.sleep(500);
            }
            catch (InterruptedException e) {
            }
        }
    }
    void move(){ //В методе move класса Hippodrome должен быть вызван метод move по одному разу для каждой лошади(каждого элемента списка horses).
        for (Horse horse : horses){
            horse.move();
        }

    }
    void print(){ //В методе print класса Hippodrome должен быть вызван метод print по одному разу для каждой лошади(каждого элемента списка horses).
        for (Horse horse : horses){
            horse.print();
        }
        for (int i = 0; i<10; i++){ //В методе print должны быть выведены на экран 10 пустых строк.
            System.out.println();
        }
    }

    public Horse getWinner(){ //В классе Hippodrome должен быть создан метод getWinner без параметров.
        //Метод getWinner должен возвращать лошадь пробежавшую наибольшую дистанцию.
        double dist = 0;
        Horse winner = null;
        for (Horse horse : getHorses()){
            if (horse.getDistance()>dist){
                dist = horse.getDistance();
                winner = horse;
            }
        }
        return winner;
    }

    public void printWinner(){ //В классе Hippodrome должен быть создан метод printWinner без параметров.
        //Метод printWinner должен выводить на экран имя победителя на экран в формате заданном в условии задачи.
        System.out.println("Winner is " + getWinner().getName() + "!");

    }

    public static void main(String[] args) {
        game = new Hippodrome(new ArrayList<>()); //Создаем объект типа Hippodrome и сохраняем его в поле game.
        //Создаем 3 объекта типа Horse:
        Horse horse_1 = new Horse("Jack", 3,0);
        Horse horse_2 = new Horse("Bill", 3,0);
        Horse horse_3 = new Horse("Aurum", 3,0);
        //Добавляем объекты типа Horse в список лошадей horses:
        game.getHorses().add(horse_1);
        game.getHorses().add(horse_2);
        game.getHorses().add(horse_3);
        game.run(); //Вызываем метод run у объекта класса Hippodrome
        game.printWinner(); //Метод printWinner должен быть вызван в методе main после метода run.
    }
}

