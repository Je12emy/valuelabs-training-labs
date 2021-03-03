package lab_3;

public class ex_1 {
    public static void main(String[] args) {
        /*
        3.1 Write a program to create a room class, the attributes of this class are roomno, roomtype, roomarea and ACmachine.
        In this class the member functions are setdata and displaydata. x
         */
            Room myRoom = new Room();
            myRoom.setData(1, "Large", "A-9-10", "AC-130");
            myRoom.displayData();
    }
}


