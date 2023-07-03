package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        String side = "";

        for(int i = 1; i < height + 1; i++) {
            side = "";
            for(int j = 1; j < height + 1; j++) {
                if (i == 1 || i == height || (i <= height/2 && (j >= i && j <= height + 1 - i)) || (i >= height / 2 && (j >= height + 1 - i && j <= i))) {
                    side = side + "8";
                } else {
                    side = side + " ";
                }
            }
            System.out.println(side);
        }
    }
}
