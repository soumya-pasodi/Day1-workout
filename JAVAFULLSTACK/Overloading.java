class Student{
    Student(){
        System.out.println("1st Constructor working");
    }
    Student(int a){
        System.out.println("2nd Constructor working");
    }
    Student(float a, float b){
        System.out.println("3rd Constructor working");
    }
}
public class Overloading{
    public static  void main(String [] args){
        Student S1 = new Student();
         Student S2 = new Student(20);
          Student S3 = new Student(10,20);
    }
    
}
