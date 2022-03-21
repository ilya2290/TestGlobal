package Lambda;




public class Implementor {

    public static void main(String[] args) {

        Printable printable = new Printable() {
            @Override
            public void print() {
                System.out.println("Print something");
            }
        };
        printable.print();


        Operation operation = ((x, y) -> x+y);
        int a = operation.calculation(20,30);
        System.out.println(a);
    }
}
