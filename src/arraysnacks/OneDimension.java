package arraysnacks;

public class OneDimension {
    public static void main(String[] args) {
        int [] arrays = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11,
                        12, 13, 14, 15, 16, 17, 18, 19, 20};

        for (int i = 10; i < arrays.length ; i++) {
            arrays[i] = 0;
        }
        for (int i = 0; i < arrays.length ; i++) {
            arrays[i] *= 2;
        }
        for (int i = 0; i < arrays.length ; i++) {
            if (arrays[i] != 0){
                System.out.println(arrays[i]);
            }
        }
    }
}
