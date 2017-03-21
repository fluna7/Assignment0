
public class pet {
	
    private String name;
    private int age;
    private double weight;

   
    public void Dog(String initName)
    {
        name = initName;
        age = 0;
        weight = 0;
    }

    
    public String getName()
    {
        return name;
    }

    public String setName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public int getDogYears()
    {
        return age*5;
    }

    public void addAYear()
    {
        age = age + 1;
    }

    public int setAge()
    {
        return age;
    }

    public double getWeight()
    {
        return weight;
    }

    public void setWeight()
    {
        weight = weight;
    }

    public String getData()
    {
        String data = "";
        data = name;
        data = data + "\n\tAge: " + age;
        data = data + "\n\tWeight: " + weight;


        return data;
    }
}


