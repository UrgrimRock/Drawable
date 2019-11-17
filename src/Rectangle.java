public class Rectangle {
    int a;
    int b;

    public Rectangle (int a, int b) {
        this.a=a;
        this.b=b;
    }

    public void draw(int a, int b) {
        String gwiazda="*";

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(gwiazda);
            }
            System.out.println();
        }
    }
}
