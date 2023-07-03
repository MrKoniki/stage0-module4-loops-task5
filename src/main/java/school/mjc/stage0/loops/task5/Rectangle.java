package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        String side = "";

        for(int i = 1; i < height + 1; i++) {
            side = "";
            for(int j = 1; j < length + 1; j++) {
                if ((i == 1 || i == height) || (j == 1 || j == length)) {
                    side = side + "8";
                } else {
                    side = side + " ";
                }
            }
            System.out.println(side);
        }
    }
}
