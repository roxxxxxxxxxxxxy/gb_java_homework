package hm5;

public class InfoAboutEmployee {
    private static final int MIN = 40;
    private static final int COUNT = 5;

    public static void main(String[] args) {
        Employee[] employees = new Employee[COUNT];
        for (int i = 0; i < COUNT; i++){
            employees[i]= infoEmployee(i);
        }
        for (Employee employee: employees){
            if(employee.getAge() > MIN){
                employee.info();
            }
        }
    }

    private static Employee infoEmployee (int i){
        return new Employee("name" + i,
                "Programmer",
                "mail" + i + "@mail.ru",
                55332 + i,
                10000 + i,
                i * 10 + 18);
    }
}
