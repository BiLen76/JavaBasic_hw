package Homeworks;

public class BoxNew {

    int length;
    int width;
    int height;

    public BoxNew(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;

        System.out.println("*** BOX 1 ***");
        System.out.println(length);
        System.out.println(width);
        System.out.println(height);

        System.out.println("BoxNew1: l = " + length + ", w = " + width + ", h = " + height);
        System.out.println("Volume BoxNew1 = " + (length * width * height));

        System.out.println("*** BOX 2 ***");
        System.out.println("BoxNew2: l = " + length + ", w = " + width);

    }
    public BoxNew(int length, int width) {
        this.length = length;
        this.width = width;
        height = 10;

        System.out.println("*** BOX 2 ***");
        System.out.println(length);
        System.out.println(width);
        System.out.println(height);

        System.out.println("BoxNew2: l = " + length + ", w = " + width + ", h = " + height);
        System.out.println("Volume BoxNew2 = " + (length * width * height));

        System.out.println("*** BOX 3 ***");
        System.out.println("BoxNew3: h = " + height);
    }
    public BoxNew(int length) {
        this.length = length;
        width = 30;
        height = 10;

        System.out.println("*** BOX 3 ***");
        System.out.println(length);
        System.out.println(width);
        System.out.println(height);

        System.out.println("BoxNew3: l = " + length + ", w = " + width + ", h = " + height);
        System.out.println("Volume BoxNew3 = " + (length * width * height));
    }
    public BoxNew() {
        length = 30;
        width = 20;
        height = 10;

        System.out.println("*** BOX 4 ***");

        System.out.println(length);
        System.out.println(width);
        System.out.println(height);

        System.out.println("BoxNew4: l = " + length + ", w = " + width + ", h = " + height);
        System.out.println("Volume BoxNew4 = " + (length * width * height));

    }
}
