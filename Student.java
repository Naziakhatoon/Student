class Student  
{  
    int id;  
    String name;  
    int age;  
    //creating two arg constructor  
    Student(int i,String n){  
    id = i;  
    name = n;  
    }  
    //creating three arg constructor  
    Student(int i,String n,int a){  
    id = i;  
    name = n;  
    age=a;  
    }  
    void display(){System.out.println(id+" "+name+" "+age);}  
   
    public static void main(String args[]){  
    Student s1 = new Student(111,"Nazia",26);  
    Student s2 = new Student(222,"Ram",25);  
    s1.display();  
    s2.display();  
   }  
}
