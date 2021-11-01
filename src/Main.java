public class Main {
    public static void main(String[] args) throws ClassNotFoundException{
        ClassReader c = new ClassReader("Pet");

        System.out.println(c.getFullFunctions());
        System.out.println(c.getAllFields());
    }
}
