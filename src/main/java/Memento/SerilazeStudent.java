package Memento;

import Command.Student;

import java.io.*;

public class SerilazeStudent  {
    public static  void main(String args[]) throws IOException, ClassNotFoundException {
        Student student=new Student("Petrov", 3);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(student);
        oos.flush();
        byte [] data = bos.toByteArray();

        ByteArrayInputStream byteArrayInputStream=new ByteArrayInputStream(data);
        ObjectInputStream objectInputStream=new ObjectInputStream(byteArrayInputStream);
        Student student1= (Student) objectInputStream.readObject();
        System.out.println(student1.getSecondName());
        Student student2=new Student("Ivanova",3);
        student2.setMemento();
        student2.setSecondName("Jons");
        System.out.println(student2.getSecondName());
        student2.setMemento();
        System.out.println(student2.getSecondName());
    }
}