package chap006;

public class Car {
    String company;
    String model;
    int speed;

//    public Car(){
//        company = "현대자동차";
//    }
    Car(){
        company = "현대자동차";
    }

    // 오버로딩 : 이름이 같은 메서드(생성자)에 다양한 매개변수를 정의
    Car(String company){
        this.company = company;
    }

    Car(String company, int speed){
        this.company = company;
        this.speed = speed;
    }

    Car(String company, String model, int speed){
        this.company = company;
        this.model = model;
        this.speed = speed;
    }

    String printFiled(){
        return "company " + company + " model: " + model + " speed: " + speed;
    }

    void setSpeed(int speed){
        this.speed = speed;
    }

    public static void main(String[] args){
        Car car = new Car(); // Car 클래스 객체 생성
        System.out.println(car.company);

        Car car2 = new Car("기아자동차");
        System.out.println(car2.company);

        Car car3 = new Car("현대자동차", "Sonata", 300);
        System.out.println("car3: " + car3);//객체의 위치를 출력하게 됨
        System.out.println(car3.company);
        System.out.println(car3.model);
        System.out.println(car3.speed); //toString() override

        Car car4 = new Car("페라리", "Ferrari", 400);
        System.out.println("car4: " + car4.printFiled());
    }
}
