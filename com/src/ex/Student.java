package ex;

public class Student {

    public int id;

    public static int counter = 0;

    private Student(int id) {
        this.id = id;
        counter ++;
    }

    public static class Utils {
        public static int counter = 0;

        public static Student getStudent() {
            counter ++;
            return new Student(counter);
        }
    }

}
