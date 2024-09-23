public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        simpleCircle simple = new simpleCircle();
        Rectangle rectangle = new Rectangle();
        Employee employee = new Employee(01, "Neilas", "Sunklodas", 400);
        InvoiceItem item = new InvoiceItem("Sneil", "Gerulis", 100, 20.0);
        Account account = new Account("LT1234567890", "Neilas Sunklodas", 1000);
        Date date = new Date(11,10,2001);

        System.out.println(circle);
        System.out.println(simple);
        System.out.println(rectangle);
        System.out.println(employee);
        System.out.println(item);
        System.out.println(account);
        System.out.println(date);
    }
}
