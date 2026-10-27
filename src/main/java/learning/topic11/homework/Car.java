package learning.topic11.homework;

/*
 * Тема 11: передача копии ссылки в метод.
 * Через эту ссылку метод может изменять поля исходного объекта.
 */

public class Car {
    String color;
    String engine;
    int doorCount;

    Car(String color, String engine, int doorCount) {
        this.color = color;
        this.engine = engine;
        this.doorCount = doorCount;
    }
}

class CarTest {
    void changeDoorCount(Car car, int newDoorCount) {
        car.doorCount = newDoorCount;
    }

    void swapColors(Car firstCar, Car secondCar) {
        // Поменяй цвета двух автомобилей местами
        String color = firstCar.color;
        firstCar.color = secondCar.color;
        secondCar.color = color;
    }
    void main(){
        Car car1 = new Car("red", "V8", 4);
        Car car2 = new Car("blue", "V6", 2);
        changeDoorCount(car1, 5);
        swapColors(car1, car2);
        IO.println("Цвет первой машины: " + car1.color + ", мотор первой машины: " + car1.engine + ", дверей у первой машины: " + car1.doorCount);
        IO.println("Цвет второй машины: " + car2.color + ", мотор второй машины: " + car2.engine + ", дверей у второй машины: " + car2.doorCount);
    }
}