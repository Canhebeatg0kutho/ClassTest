public class Employee {
    private String name;
    private String id;
    private String employment;
    private String gender;
    private int age;

    public Employee(String name, String id, String employment, String gender, int age) {
        setName(name);
        setId(id);
        setEmployment(employment);
        setGender(gender);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()<3 && name.length()>25)
        {
            throw new IllegalArgumentException("Your name is too short");
        }else{
            this.name = name;

        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if(id.length()!=11)
        {
            throw new IllegalArgumentException("This is not a valid PPS number");
        }else{
            this.id = id;
        }
    }

    public String getEmployment() {
        return employment;
    }

    public void setEmployment(String employment) {
        switch (employment){
            case "Full-time":
            case "Part-time":
            case "Contract": this.employment = employment;break;
            default: throw new IllegalArgumentException("This is an invalid employment type");
        }

    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        switch(gender){
            case "Man":
            case "Woman":
            case "Non-Binary": this.gender = gender;break;
            default: throw new IllegalArgumentException("This is not a gender");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<16){
            throw new IllegalArgumentException("Age must be over 16");
        }
        else if(age>66){
            throw new IllegalArgumentException("Age must be under 66");
        } else {
            this.age = age;
        }
    }
}
