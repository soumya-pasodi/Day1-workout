class Swap{
    public static void main(String []args){
int a = 5;
int b = 10;
System.out.println("Before Swapping the numbers a="+a);
System.out.println("Before Swapping the numbers b="+b);
a = a+b;
b= a-b;
a= a- b;
System.out.println("After swapping the numbers a=" +a);
System.out.println("After Swapping the numbers b="+b);
    }
     
}