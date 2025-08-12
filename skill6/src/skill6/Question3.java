package skill6;

class Student {
    int id;
    String name;
    int a, b, c;

    public int findTotal() {
        return a + b + c;
    }

    public double findAverage() {
        return findTotal() / 3.0;
    }

    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + a + ", " + b + ", " + c);
        System.out.println("Total Marks: " + findTotal());
        System.out.println("Percentage: " + findAverage() + "%");
    }
}

public class Question3 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 101;
        s1.name = "Alice";
        s1.a = 85;
        s1.b = 78;
        s1.c = 92;

        Student s2 = new Student();
        s2.id = 102;
        s2.name = "Bob";
        s2.a = 75;
        s2.b = 88;
        s2.c = 80;

        s1.displayDetails();
        s2.displayDetails();
    }
}
