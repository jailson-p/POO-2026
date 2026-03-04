public class Argumentos {
    public static void main(String[] args) {

        if(args.length != 2){
            System.out.println("É necessário que tenha dois argumentos.");
            return;
        }

        System.out.println(args[0]);
        System.out.println(args[1]);
    }
}
