package hm5;

public class Employee {
    private String name;
    private String post;
    private String mail;
    private int phone;
    private int salary;
    private int age;

    public Employee(String name, String post, String mail, int phone, int salary, int age) {
        this.name = name;
        this.post = post;
        this.mail = mail;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public Employee(String name, String programmer) {
        this(name, programmer, null, 0, 0, 0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void info() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Employee:" + "Name - " + name + "; "
                + "Post - " + post + "; "
                + "Email - " + mail + "; "
                + "Phone number - " + phone + "; "
                + "Salary - " + salary + "; "
                + "Age - " + age + ".";
    }
}
