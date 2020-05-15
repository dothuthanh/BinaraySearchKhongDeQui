package app;

public class BinaraySeacrch {
    static int[] list =  {1,2,3,5,7,9,10,34,56,4,78};
    static int binaraySreach(int[] list, int key){
        int low =0;
        int higt = list.length - 1;
     while (higt>= low){
         int mid = (low + higt)/2;
         if(key < list[mid]){
             higt = mid - 1;
         }else if(key == list[mid]){
             return mid;
         }else
             low = mid+ 1;
     }
     return -1;
    }

}
