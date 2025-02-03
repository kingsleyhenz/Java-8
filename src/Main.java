public class Main {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
//        System.out.println(numbers[4]);
        numbers[4] = 55;
//        System.out.println(numbers[4]);
//        for(int i = 0; i < numbers.length; i++){
//            System.out.println(numbers[i]);
//        }

//        for(int num : numbers){
//            System.out.println(num);
//        }

        int[][] TwoDim = {
                {1,2,3},
                {2,3,4},
                {3,4,5}
        };
//        System.out.println(TwoDim[0][1]);
        for(int i = 0; i < TwoDim.length; i++){
            for (int j = 0; j < TwoDim[i].length; j++){
                System.out.println(TwoDim[i][j]);
            }
        }

    }
}