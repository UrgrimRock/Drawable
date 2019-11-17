public class Triangul implements Drawable {


    @Override
    public void draw() {
        int lenght = 6;
        String znak ="*";

        for (int i = 0; i < lenght; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(znak);
            }
            System.out.println();



        }
    }
}
