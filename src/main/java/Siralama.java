public class Siralama {

    public static void main(String[] args) {
        int[] liste = {30,20,1,8,100,3,5};
        sort(liste);
    }

    static int[] sort(int[] arr){


        for (int i = 0; i < arr.length; i++) {
            int enBuyuk = arr[0];
            for (int j = 0; j < arr.length; j++) {

                if(enBuyuk>arr[j]){
                    int tmp = arr[j];
                    arr[j] = enBuyuk;
                    arr[j-1] = tmp;
                }
                else{
                    enBuyuk = arr[j];
                }

                for (int k = 0; k < arr.length; k++) {
                    System.out.print(arr[k]);
                    if(k!=(arr.length-1)){
                        System.out.print(",");
                    }
                    else{
                        System.out.println();
                    }
                }

            }
        }

        return arr;
    }
}
