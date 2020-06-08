package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	Wall wallSize = new Wall(1.125,-1.0);
        System.out.println(wallSize.getWidth());
        System.out.println(wallSize.getHeight());
        System.out.println(wallSize.getArea());
    }
}
