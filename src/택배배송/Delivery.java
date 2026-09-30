package 택배배송;

public class Delivery {
    String name;
    public Delivery(String name) {
        this.name = name;
    }

    public void send(Vehicle vehicle){
        System.out.print(name + "의 ");
        vehicle.send();
    }
}