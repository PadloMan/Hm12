public class Main {
    public static void main(String[] args) {

        Employee emp = new Employee("Pasha Kozub", "Developer", "crazyfunboom@gmail.com", "+123456789", 27);
        System.out.println("Employee Full Name: " + emp.getFullName());
        System.out.println("Employee Position: " + emp.getPosition());
        System.out.println("Employee email: " + emp.getEmail());
        System.out.println("Employee phone: " + emp.getPhone());
        System.out.println("Employee age: " + emp.getAge() );
        Car car = new Car();
        car.start();
    }
}

