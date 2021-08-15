

class ArrayOperations {
    public static int[][][] createCube() {
        int i = 0;
        int j = 0;
        int k = 0;
        int count = 0;
        int[][][] arr = new int[3][3][3];

        for (i = 0; i < 3; i++) {
            count = 0;
            for (j = 0; j < 3; j++) {
                for (k = 0; k < 3; k++) {
                    arr[i][j][k] = count;
                    count++;

                }

            }

        }
        return arr;
    }
}
