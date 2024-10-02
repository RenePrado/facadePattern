public class Valet implements HotelService{
    private String plateNumber;

    public Valet(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public void pickUpVehicle() {
        System.out.println("Valet parking vehicle with plate " + plateNumber);
    }

    @Override
    public void service() {
        pickUpVehicle();
    }
}
