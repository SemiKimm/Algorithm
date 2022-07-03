package search;

public class Sequential{
    public static void main(String[] args){
        int[] arr = new int[]{1,4,6,5,3,234};
        int value = 2;
        //Sequential.searchByFor(arr, value);
        Sequential.searchByWhile(arr, value);
    }

    static void searchByFor(int[] arr, int value){
        int len = arr.length;
        for(int i = 0; i < len; i++){
            if(arr[i]==value){
                System.out.println(value + "는 존재합니다. index : " + i);
                return;
            }
        }
        System.out.println(value + "를 찾을 수 없습니다.");
    }

    static void searchByWhile(int[] arr, int value){
        int i = 0;
        int len = arr.length;
        while(i<len){
            if(arr[i]==value){
                System.out.println(value + "는 존재합니다. index : " + i);
                return;
            }
            i++;
        }
        System.out.println(value + "를 찾을 수 없습니다.");
    }
}