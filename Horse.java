public class Horse {
    //Создаем 3 поля для класса Horse:
    String name;
    double speed;
    double distance;

    public Horse(String name, double speed, double distance) { //Создаем конструктор и инициализируем поля
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }

    //Создаем сеттеры и геттеры:
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    //Создаем методы move, print без параметров:
    public void move() {
        distance = distance + (speed * Math.random()); //Увеличиваем значение поля дистанция
    }

    public void print() { //Выводим на экран количество точек и имя лошади
        for (int i = 0; i < (int) distance; i++) {
            System.out.print(".");
        }
        System.out.println(getName());
    }
}
