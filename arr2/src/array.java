public class array {
    public static void main(String[] args) {

        int[][] arr ={{1,2,3,4},
                     {10,11,12,5},
                     { 9,8,7,6}};

        for(int i=0; i<3; i++){      // print 1 2 3


            System.out.println(arr[0][i]);
            }

          for(int i=0; i<3; i++){
            System.out.println(arr[i][3]);  // print 4 5 6

              }

        for(int i=2; i>=0; i--){

            System.out.println(arr[2][i]);  // print 7 8 9
        }
        for(int i=0; i<3; i++){

            System.out.println(arr[1][i]);     // print
        }

        }
}