/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package school1;


public class School1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person joe = Person.addPerson("joe",Person.Gender.Male,152);
        Person billy = Person.addPerson("billy",Person.Gender.Male,60);
        Person suzy = Person.addPerson("suzy",Person.Gender.Female,70);
        Person.printName();
        Person.printNamesOfGender(Person.Gender.Female);
        System.out.println(billy);
        
        Course CS1 = Course.addCourse("CS1",Course.Type.Elective,2);
        Course geom = Course.addCourse("geom",Course.Type.Math,1);
        System.out.println(geom);
    }
}
