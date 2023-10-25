public class Person{
private String FirstName;
private String MiddleName;
private String LastName;
private int age;
private String birthday;
private String address;

public Person(String FirstName, String MiddleName, String LastName, int age, String birthday, String address){
this.FirstName = FirstName;
this.MiddleName = MiddleName;
this.LastName = LastName;
this.age = age;
this.birthday = birthday;
this.address = address;
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
public int getAge(){
return age;
}
public String getbirthday(){
return birthday;
}
public void setbirthday(String birthday){
this.birthday = birthday;
}
public String getaddress(){
return address;
}
public void setaddress(String address){
this.address = address;
}
public static void main(String[] a){
Person person = new Person("Jerome", "Enginila", "Balongkit", 20, "5-09-23", "Cogon Pardo");
System.out.println("Name: " + person.getFirstName());
System.out.println("Name: " + person.getMiddleName());
System.out.println("Name: " + person.getLastName());
System.out.println("Age: " + person.getAge());
System.out.println("Birthday: " + person.getbirthday());
System.out.println("Address: " + person.getaddress());
}
}