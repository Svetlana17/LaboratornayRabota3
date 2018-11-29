package Command;

import Classes.Pupil;


import java.io.*;
import java.util.Arrays;

public class Student implements Pupil, Serializable {

//

    private  String secondName;
    private  int[] marks;
    private  String[] subjects;

    public Student(String secondName, int initialCountOfSubjects) {
        this.secondName = secondName;
        this.marks = new int[initialCountOfSubjects];
        this.subjects = new String[initialCountOfSubjects];

    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    @Override
    public int getMarkAt(int index) {
        return marks[index];
    }
   @Override
    public   void setMarkAt(int index, int mark) {
        marks[index] = mark;
    }
    @Override
    public String getSecondName() {
        return secondName;
    }
     @Override
    public String getSubjectAt(int index) {
        return subjects[index];
    }
    @Override
    public void setSubjectAt(int index, String subject) {
        subjects[index] = subject;
    }
    @Override
    public void addSubjectAndMark(String subjectName, int subjectMark) {
        subjects = Arrays.copyOf(subjects, subjects.length + 1);
        subjects[subjects.length - 1] = subjectName;
        marks = Arrays.copyOf(marks, marks.length + 1);
        marks[marks.length - 1] = subjectMark;
    }
    @Override
    public int getSubjectsCount() {
        return subjects.length;
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        Student clone = (Student) super.clone();
        clone.subjects = Arrays.copyOf(subjects, subjects.length);
        clone.marks = Arrays.copyOf(marks, marks.length);
        return clone;
    }
    @Override
    public String toString() {
        return "Command.Student{" +
                "secondName='" + secondName + '\'' +
                ", marks=" + Arrays.toString(marks) +
                ", subjects=" + Arrays.toString(subjects) +
                '}';
    }
    public void setPrintCommand(Command command) throws IOException {
        command.execute(this);
    }

    public  void createMemento() throws IOException {
        Memento.setStudent(this);
    };

    public void setMemento() throws IOException, ClassNotFoundException {
      Student student=Memento.getStudent();
       this.setSecondName(student.secondName);

    };

   public static  class  Memento{

        private static byte[] arBate;
        public Memento(Student student) throws IOException {//создание
          serialize(student);
        }

  public static Student getStudent() throws IOException, ClassNotFoundException {
            return deserialize(arBate);
  }
  public  static  void  setStudent(Student student) throws IOException {
      serialize(student);
  }

        public static void serialize(Student obj) throws IOException {
            try(ByteArrayOutputStream b = new ByteArrayOutputStream()){
                try(ObjectOutputStream o = new ObjectOutputStream(b)){
                    o.writeObject(obj);
                               }
              arBate=b.toByteArray();
           }
        }


        private static Student deserialize(byte[] bytes) throws IOException, ClassNotFoundException {
            try(ByteArrayInputStream b = new ByteArrayInputStream(bytes)){
                try(ObjectInputStream o = new ObjectInputStream(b)){
                    return (Student)o.readObject();

                }
            }
        }
    }
}
