public class Main {
    public static void main(String[] args) {
        System.out.println("Переменные и типы данных");


//      int= 4 byte


        int age = 52;

 //       age = 5;

        System.out.println("Возраст: " + age + ".");


//      byte от-128 до 127 (занимает 1 байт)
        // short от -32768 до 32767 (занимает 2 байта)
        // int от -2147483648 до 2147483647 (занимате 4 байта)
        // long от -9 223 372 036 854 775 808 до 9 223 372 036 854 775 807 (занимает 8 байт)


        byte age1 = 45;
        short num1 = 1488;
        int num2 = 525252;
        long num3 =299792458;


        // float для не целых чисел (52.2)
        float num4 = 52.52f;
        // double в 2 раза больше чисел после точки чем в float
        double num5 = 52.52525252525252d;

        //char в одинарных ковычках '' и любой символ
        String ch = "52";
        String user_name = "Lyer";
//      boolean ток либо тру либо фолс
        boolean isSad = true


        System.out.println(user_name);
    }
}