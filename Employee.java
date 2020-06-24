class Employee 
{  
    int id;  
    String name;  
    int age;  
    //creating two arg constructor  
    Employee(int i,String n){  
    id = i;  
    name = n;  
    }  
    //creating three arg constructor  
    Employee(int i,String n,int a){  
    id = i;  
    name = n;  
    age=a;  
    }  
    void display(){System.out.println(id+" "+name+" "+age);}  
   
    public static void main(String args[]){  
    Employee  e1 = new Employee(111,"Nazia",26);  
    Employee  e2 = new Employee(222,"Ram",25);  
    e1.display();  
    e2.display();  
   }  
}
