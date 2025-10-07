class Student
{
    private String name;
    private int age;

    public void setName(String n)
    {
        name = n;
    }

    public String getName()
    {
        return name;
    }

    public void setAge(int a)
    {
        age = a;
    }
    public int getAge()
    {
        return age;
    }
}

public class Details
{
    public static void main(String[] args)
    {
        Student s1 = new Student();
        s1.setName("Saira");
        s1.setAge(19);
        
        System.out.println("Name:" + s1.getName() + "Age:" + s1.getAge());
    }
}