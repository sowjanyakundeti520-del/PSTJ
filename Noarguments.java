class Noarguments{

        static int add() {
        int a = 10;
        int b = 20;
        return a + b;
    }

    public static void main(String[] args) {
        int result = add();  
        System.out.println("Sum = " + result);
    }
}