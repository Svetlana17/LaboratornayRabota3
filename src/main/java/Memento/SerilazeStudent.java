package Memento;

import Command.Student;

import java.io.*;

public class SerilazeStudent  {
    public static  void main(String args[]) throws IOException, ClassNotFoundException {
    ByteArrayOutputStream byteArrayOutputStream=new ByteArrayOutputStream();
    ObjectOutput objectOutput=new ObjectOutputStream(byteArrayOutputStream);

    Student student=new Student("petrov" , 2);
    objectOutput.writeObject(student);
    objectOutput.flush();
   // System.out.println("Данные записаны");

//    ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("student.dat"));
//    Student student1= (Student) objectInputStream.readObject();
//    student1.toString();
//    System.out.println(student1.toString());
}
}