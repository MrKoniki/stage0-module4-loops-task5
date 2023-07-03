package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        String side = "";

        for(int i = 1; i < cathetusLength + 1; i++) {
            side = "";
            for(int j = 1; j < cathetusLength + 1; j++) {
                if (i >= j) {
                    side = side + "8";
                } else {
                    side = side + "";
                }
            }
            System.out.println(side);
        }
    }
}
