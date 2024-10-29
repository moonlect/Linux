public class PracticeCasting_2 {
    public static void main(String[] args) {
        short age = 30;
        char sex = 'W';
        byte iq = 110;
        int height = 164;
        long distance = 3000;
        float price = 90.99f;
        double money = 990.00;

        System.out.println("age = " + age);
        System.out.println("sex = " + sex);
        System.out.println("iq = " + iq);
        System.out.println("height = " + height);
        System.out.println("distance = " + distance);
        System.out.println("price = " + price);
        System.out.println("money = " + money);
        iq = (byte) height;
        distance = height;

        sex = (char) money;
        System.out.println("age = " + age);
        System.out.println("sex = " + sex);
        System.out.println("iq = " + iq);
        System.out.println("height = " + height);
        System.out.println("distance = " + distance);
        System.out.println("price = " + price);
        System.out.println("money = " + money);



    }
}
