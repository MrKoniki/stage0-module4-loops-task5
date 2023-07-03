package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        String side = "";

        for(int i = 1; i < sideLength + 1; i++) {
            side = "";
            for(int j = 1; j < sideLength + 1; j++) {
                if ((j == sideLength / 2 + 1) || (i == sideLength / 2 + 1)) {
                    side = side + "8";
                } else {
                    side = side + " ";
                }
            }
            System.out.println(side);
        }
    }
}
