package equals;

public class GenerationCar {
    public static void main(String[] args) {
        Car dodgeCharger = new Car("Black", "Dodge", "Charger");
        Car dodgeCharger2 = new Car("Black", "Dodge", "Charger");
        Car ferrari812 = new Car("Red", "Ferrari", "812");
        Car bmwM3 = new Car("Gray", "BMW", "M3");

        System.out.println(dodgeCharger.equals(dodgeCharger2)); // Irá retornar false, pois está sendo comparado dois OBJETOS diferentes

        Car dodgeCharger3 = dodgeCharger;
        System.out.println(dodgeCharger.equals(dodgeCharger3)); // Irá retornar true, pois mesmo que dodgeCharger e dodgeCharger3 sejam iguais, eles apontam para o mesmo lugar na memória
    }
}
