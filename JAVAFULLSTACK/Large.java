class Large{
    public static void main(String [] args){
        int a=12,b=65,c=25;
        if(a>b&&a>c){
            System.out.println( "number a=" +a+ " is the largest number");
        }
        if(b>a&&b>c){
            System.out.println( "number b=" +b+ " is the largest number");
        }
        else{
            System.out.println( "number c=" +c+ " is the largest number");
        }

    }
}