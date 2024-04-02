// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] array = new int[7];
        array[0] = 56;
        array[1] = 24;
        array[2] = 89;
        array[3] = 25;
        array[4] = -489;
        array[5] = -156;
        array[6] = 48;
        int minValue = array[0];

        for(int i=1; i< array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }

        System.out.println("Gia tri nho nhat trong mang là: "+ minValue);
    }
}