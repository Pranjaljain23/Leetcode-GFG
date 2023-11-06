// 832. Flipping an Image

class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n/2; j++) {
                int temp = image[i][j];
                image[i][j] = image[i][n - j - 1];
                image[i][n - j - 1] = temp;
            }

            for(int j = 0; j < n; j++) {
                if(image[i][j] == 0) {
                    image[i][j] = 1;
                }
                else{
                    image[i][j] = 0;
                }
            }
        }

        return image;
    }
}


//Two pointer approach

// class Solution {
//     public int[][] flipAndInvertImage(int[][] image) {
//         for(int i=0;i<image.length;i++){
//             int s=0,e=image.length-1;
//             while(s<=e){
//                 int t=(image[i][s]+1)%2;
//                 image[i][s]=(image[i][e]+1)%2;
//                 image[i][e]=t;
//                 s++;
//                 e--;
//             }
//         }
//         return image;
//     }
// }