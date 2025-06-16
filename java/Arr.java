import java.util.ArrayList;
import java.util.Arrays;

public class Arr {

    public static void main(String[] args) {
        Student s1 = new Student(101,"Sok",60,43,67);
        Student s2 = new Student(102,"HI Na", 60,48,80);
        

        ArrayList<Student> Student = new ArrayList<>(Arrays.asList(s1,s2));
        boolean hass1 = Student.contains(s2);
        System.out.println(hass1);
       
        System.out.println(s2.total());
        System.out.println(s2.arverage());
        System.out.println("Id : " + s1.sid +" "+ s1.name + " " + s1.math + " "+ s1.english +" "+ s1.khmer);
        
        System.out.println("Total = " + s1.total());
        System.out.println("Average = " + s1.arverage());
        

        
    }

    
      
}

class Student {
    public int sid;
    String name;
    double math;
    double english;
    double khmer;
    public Student(int sid, String name, double math, double english,double khmer){
        this.sid = sid;
        this.name = name;
        this.math = math;
        this.english = english;
        this.khmer = khmer;
    }
   double total(){
      return  math + english + khmer;
    }
    double arverage(){
      return total()/3;
    }
}