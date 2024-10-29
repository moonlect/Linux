public class ShortHandOperator_2 {
    public static void main(String[] args) {
        int x = 5, y = 3;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("++x = " + ++x);
        System.out.println("y++= " + y++);
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        x = 4;
        y = 8;
        int z;
        z = ++x +y;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = ++x + y = " + z);

        int i = 3, j = 5, k = 7, m =-4, n =13;
        i += 9;
        j -= 3;
        k *= 5;
        m /= 4;
        n %= 3;
        System.out.println("i += 9 получаем " + i);
        System.out.println("j -= 3 получаем " + j);
        System.out.println("k *= 5 получаем " + k);
        System.out.println("m /= 4 получаем " + m);
        System.out.println("n %= 3 получаем " + m);

        System.out.println(Math.pow(2,3));
        System.out.println(Math.sin(2));

        char a = 'd';
        char b = 'D';
        System.out.println(" a += 8 получаем " + (a += 8));
        System.out.println(" b += 1 получаем " + (b += 1));

        x = 1;
        y = x++ + x;
        System.out.println("-----y = " + y);

        System.out.println('3' - '2' + 'm' / 'n');

        x = 10;
        y = 10;
        boolean zz = (y > 10) && (x++ >10);
        System.out.println("zz = " + z);

        x = 10;
        y = 10;
        zz = (y > 10) && (x++ >10);
        System.out.println("|| x= " + x);

        System.out.println("-24/-5 = " + (-24 % 5));
        System.out.println("-24.2/-5.5 = " + (-24.2 % 5.5));

        System.out.println("'A' + 1 = " + ('A' + 1));
    }
}
