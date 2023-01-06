public class Main {
    public static void main(String[] args) {
        Product a = new Product("Patatine",0.057,20,4,2024);
        Product a2 = new Product("Carne",0.388,12,1,2023);
        Product a3 = new Product("Tortellini",0.250,5,2,2023);
        Product a4 = new Product("Tonno",0.239,8,1,2023);
        Product a5 = new Product("Lenticchie",0.400,1,10,2025);
        Product a6 = new Product("Riso",1.0,6,12,2025);


        a.print();
        a2.print();
        a3.print();
        a4.print();
        a5.print();
        a6.print();


        System.out.println();
    }
}