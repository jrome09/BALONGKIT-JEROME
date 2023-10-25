import java.util.Scanner;
public class Student{
private String FirstName;
private String MiddleName;
private String LastName;
private String Suffix;


public Student(String FirstName, String MiddleName, String LastName, String Suffix){
this.FirstName = FirstName;
this.MiddleName = MiddleName;
this.LastName = LastName;
}
public String getFirstName(){
return FirstName;
}
public void setFirstName(String FirstName){
this.FirstName = FirstName;
}
public String getMiddleName(){
return MiddleName;
}
public void setMiddleName(String MiddleName){
this.MiddleName = MiddleName;
}
public String getLastName(){
return LastName;
}
public void setLastName(String LastName){
this.LastName = LastName;
}
public String getSuffix(){
return Suffix;
}
public void setSuffix(String Suffix){
this.Suffix = Suffix;
}

public String getFullName(){
return FirstName + " " + MiddleName +  " " + LastName;
}

public static void main(String[] a){
Student person = new Student("Jerome", "Enginila", "Balongkit", "none");
Scanner in = new Scanner(System.in);
System.out.print("Name: ");
String Fname = in.next();
System.out.print("Middle Name: ");
String Mname = in.next();
System.out.print("Last Name: " );
String Lname = in.next();
System.out.print("Suffix: " );
String Sname = in.next();
System.out.print("FullName: " + person.getFullName());

}
}