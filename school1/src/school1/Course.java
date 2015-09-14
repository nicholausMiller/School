
package school1;
import java.util.ArrayList;
public class Course {
 private int period;
 private Type type;
 private String name;
 public static Course addCourse(String _name, Type _type, int _period)
   {
    Course temp = new Course(_name, _type, _period);
    courses.add(temp);
    return(temp);
    
    
   }   
 public  enum Type {
       Math,Science,English,History,
       Language,Elective,PE
       
   }; 
    private static ArrayList<Course> courses = new ArrayList<Course>();
    Course(String _name, Type _type, int _period)
   {
       name = _name;
       type = _type;
       period = _period;
       
   };
    public void setPeriod(int _period){
       period = _period;
   }
   public int getPeriod()
   {
       return(period);
   }
   public void setType(Type _type){
       type = _type;
   }
   public Type getType()
   {
       return(type);
   }
   public void setName(String _name){
       name = _name;
   }
   public String getName()
   {
       return(name);
   }
   public static void printNamesOfType(Type _type)
   {
       System.out.println("==printNamesOfGender== " + _type);
       for(Course temp : courses)
       {
           if (temp.type == _type)
           {
               System.out.println(temp.getName());
           }  
       }    
   }
   public String toString()
{
return(name+" "+type+" "+period);
}
}
