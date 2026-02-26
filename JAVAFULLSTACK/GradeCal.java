class GradeCal{ 
    public static void main( String[]  args){
        int marks=85;
        if(marks>=90){
            System.out.println("The grade is A");
        }
        else if(marks >= 75 && marks <= 89){
            System.out.println("The grade is B");
        }
        else if(marks >= 50 && marks <= 74){
            System.out.println("The grade is C");
        }
        else{
            System.out.println("Fail");
        }
    }
}