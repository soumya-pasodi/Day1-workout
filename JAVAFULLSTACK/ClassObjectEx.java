class Student{
    int id;
    String name;
    String department;
    void display(){
        System.out.println(id + " " +name + " " +department);
    }
}
public class ClassObjectEx {
    public static void main(String[] args) {
        Student S1 = new Student();
        S1.id = 96;
        S1.name = "Soumya";
        S1.department = "CSE";
        S1.display();
        Student S2 = new Student();
        S2.id = 93;
        S2.name = "Shweta";
        S2.department = "CSE";
        S2.display();
    }
}
