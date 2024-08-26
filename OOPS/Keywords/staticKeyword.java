// package Keywords;

public class staticKeyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.SchoolName = "JMV";
        
        Student s2 = new Student();
        System.out.println(s2.SchoolName);

        //if we change the scl name for s3 then scl name for s1 and s2 will also be change

        Student s3 = new Student();
        s3.SchoolName = "Chitkara Internationl School";
        System.out.println(s1.SchoolName);
    }c  
}

class Student{
    String name;
    int roll;

    static String SchoolName;
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
}