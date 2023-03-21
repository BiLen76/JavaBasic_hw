package Homeworks;

public class Box {

    int length;
    int width;
    int height;

    public Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;

        System.out.println(length);
        System.out.println(width);
        System.out.println(height);

        System.out.println("Box1: l = " + length + ", w = " + width + ", h = " + height);
        System.out.println("Volume Box1 = " + (length * width * height));

    }
    public Box(int length, int width) {
        this.length = length;
        this.width = width;
        height = 30;

        System.out.println(length);
        System.out.println(width);
        System.out.println(height);

        System.out.println("Box2: l = " + length + ", w = " + width + ", h = " + height);
        System.out.println("Volume Box2 = " + (length * width * height));
    }
    public Box(int length) {
        this.length = length;
        width = 40;
        height = 20;

        System.out.println(length);
        System.out.println(width);
        System.out.println(height);

        System.out.println("Box3: l = " + length + ", w = " + width + ", h = " + height);
        System.out.println("Volume Box3 = " + (length * width * height));
    }
    public Box() {
        length = 35;
        width = 25;
        height = 15;

        System.out.println(length);
        System.out.println(width);
        System.out.println(height);

        System.out.println("Box4: l = " + length + ", w = " + width + ", h = " + height);
        System.out.println("Volume Box4 = " + (length * width * height));

    }
}
