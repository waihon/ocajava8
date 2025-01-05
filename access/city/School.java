package access.city;

import access.school.*;

public class School {

  public static void main(String[] args) {
    System.out.println(Classroom.globalKey);
    Classroom room = null; // new Classroom(101, "Mrs. Anderson");
    System.out.println(room.roomNumber);
    System.out.println(room.floor);
    System.out.println(room.teacherName);
  }

}
