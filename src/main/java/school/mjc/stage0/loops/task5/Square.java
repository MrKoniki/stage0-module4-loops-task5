package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength){
        String side = "";

        for(int i = 1; i < sideLength + 1; i++) {
            side = "";
            for(int j = 1; j < sideLength + 1; j++) {
                if ((i == 1 || i == sideLength) || (j == 1 || j == sideLength)) {
                    side = side + "8";
                } else {
                    side = side + " ";
                }
            }
            System.out.println(side);
        }
    }
}
