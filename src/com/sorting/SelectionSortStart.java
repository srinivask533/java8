package src.com.sorting;

public class SelectionSortStart {
    public static void main(String[] args){
        int[] arr = {10,6,-1,5,3,8};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[j]>arr[i]){
                    int temp = arr[j];
                    //System.out.println(temp+" temp");
                     arr[j] = arr[i];
                   // System.out.println(arr[j]+" arr[j]");
                     arr[i] = temp;
                    //System.out.println( arr[i]+" arr[i] ");
                }
            }
//           List<Integer> list = IntStream.of(arr).boxed().toList();
//            list.forEach(System.out::print);

        }
        for(int k:arr){
            System.out.print(k+" ");;
        }
    }
}
