package nauka

import org.apache.tools.ant.types.resources.selectors.None

class Klasy {
    static void main(String[] args) {
        Student member = new Student();
        member.setterSurname("Kowalski");
        member.setterName("Błażej");
        member.setterCountry("USA");
//        println(member.getterFullName());
        member.setterId(223);
        member.addMarks(3);
        member.addMarks(3);
        member.addMarks(4);
        member.addMarks(5);
        member.addMarks(2);
        /*println(member.getterMarks());
        println(member.getAvgMarks());*/

        Job pracownik = new Job()
        pracownik.setterSurname("Jaworski")
        pracownik.setterName("Andrzej")
        pracownik.setterCountry("Poland")
        pracownik.setterPosition('Programista')
        pracownik.setterSallary(5000)
        /*println(pracownik.getterFullName())
        println(pracownik.getterInfo())*/
        println(pracownik.DisplayPerson())
        println(pracownik.DisplayJob())
        println("Next person")
        println(member.DisplayPerson())
        println(member.DisplayStudent())
    }
}

interface introducePerson{
    void DisplayPerson();
}

class Person{
    private String Name
    private String Surname
    private String Country

    void setterCountry(String pCountry= null){
        Country = pCountry
    }
    void setterSurname(String pSurname){
        Surname = pSurname
    }
    void setterName(String pName){
        Name = pName
    }
    String getterSurname(){
        return this.Surname
    }
    String getterName(){
        return this.Name
    }
    String getterFullName(){
        if (this.Country != null) {
            return this.Name + " " + this.Surname + " from " + this.Country
        }
        else {
            return this.Name + " " + this.Surname
        }
    }
    void DisplayPerson(){
        if (this.Country != null) {
            println(this.Name + " " + this.Surname + " from " + this.Country)
        }
        else {
            println(this.Name + " " + this.Surname)
        }
    }
}

interface introduceJob{
    void DisplayJob();
}

class Job extends Person{
    private String position
    private int salary

    void setterPosition(pPosition = null){
        position = pPosition
    }
    void setterSallary(pSalary = 0){
        salary = pSalary
    }
    String getterInfo(){
        if (position != null && salary==0) {
            return "I'am on position: " + position
        } else if (position == null && salary!=0){
            return "I'm earning: " + salary
        } else {
            return "I'm on position '"+position+"' and I'm earning: " +salary
        }
    }

    void DisplayJob(){
        if (position != null && salary==0) {
            println("I'am on position: " + position)
        } else if (position == null && salary!=0){
            println("I'm earning: " + salary)
        } else {
            println("I'm on position '"+position+"' and I'm earning: " +salary)
        }
    }

    public Job(){
        super()
    }
}
interface introduceStudent{
    void DisplayStudent();
}
class Student extends Person {
    private ArrayList marks = []
    private int Id
    private float avg

    void addMarks(int pMark) {
        marks.add(pMark)
    }

    void setterId(int pId) {
        Id = pId
    }

    ArrayList getterMarks() {
        if (marks.size() == 0) {
            return [0]
        } else {
            return this.marks
        }
    }

    float getAvgMarks() {
        if (marks.size() == 0) {
            return 0
        } else {
            for (float d : marks)
                avg += d;
            avg /= marks.size();
        }
    }
    void DisplayStudent(){
        if (marks.size()==0){
            println("no grades saved")
        } else {
            println("Number of saved marks: "+marks.size())
            println("Avg of marks: "+this.getAvgMarks())
        }

    }

    public Student() {
        super();
    }
}