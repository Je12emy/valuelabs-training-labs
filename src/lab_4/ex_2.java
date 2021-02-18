package lab_4;

import lab_3.Room;

public class ex_2 {
    public static void main(String[] args) {
        /*
        4.2 Write a program for reuse class. For this program use the above ‘room class’ program. x
         */
        Room myRoom = new Room();
        myRoom.setData(1, "S-7-8", "Seccond floor", "AC-753");
        myRoom.displayData();
    }
}
