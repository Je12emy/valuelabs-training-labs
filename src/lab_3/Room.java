package lab_3;

public class Room {
    private int roomNumber;
    private String roomType;
    private String roomArea;
    private String acMachine;

    public void setData(int number, String type, String area, String machine) {
        this.roomNumber = number;
        this.roomType = type;
        this.roomArea = area;
        this.acMachine = machine;
    }

    public void displayData() {
        System.out.println("Displaying Room: " + this.roomNumber +
                "\n- Type: " + this.roomType +
                "\n- Area: " + this.roomArea +
                "\n- AC Machine: " + this.acMachine);
    }
}
