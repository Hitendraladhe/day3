// Java Program to print the elements of an array

class Main{
    public static  void main(String[] args){
        int [] marks =  {1, 2, 2, 3, 3, 3};

     //        print using for loop
        for(int i=0; i <  marks.length; i++){
            System.out.println(marks[i]);
        }
       //  print using for each
        for (int element: marks){
            System.out.println(element);
        }
        System.out.print("hello Java world I'm Hitendra");
    }
}