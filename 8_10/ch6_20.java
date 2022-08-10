public class ch6_20 {
    int max(int[] arr){
        if(arr == null || arr.length == 0){
            return -999999;
        }
        int result = 0;
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] > result){
                result = arr[i];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        ch6_20 m = new ch6_20();
        int[] data = {1,3,5,6,3,2,8,7,3,7,3,1};
        System.out.println(java.util.Arrays.toString(data));
        System.out.println("최대값" + m.max(data));
        System.out.println("최대값" + m.max(null));
        System.out.println("최대값" + m.max(new int[]{}));


    }
}

// static int max(int[] arr){
//     if(arr == null || arr.length == 0){
//         return -999999;
//     }
//     int result = 0;
//     for(int i = 0; i < arr.length; i++){
//         if(arr[i] > arr[i++]){
//             result = arr[i];
//         }else if(arr[i] < arr[i++]){
//             result = arr[i++];
//         }
//     }
//     System.out.println(result);
//     return result;
// }