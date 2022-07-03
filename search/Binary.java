package search;

public class Binary {
    public static void main(String[] args){
        int[] arr = new int[]{54, 23, 12, 11, 8, 4, 3, 2, 1, 0};
        int key = 0;
        Binary.search(arr, key);
    }
    
    static void search(int[] arr, int key){
        int len = arr.length;
        int li = len - 1;
        int fi = 0;
        int mi = findMiddleValue(li, fi);
        
        while(mi < len){
            if(arr[mi]==key){
                System.out.println(key + " 값을 찾았습니다. index : " + mi);
                return;
            }
            if(arr[mi] > key){
                fi = mi + 1;
                mi = findMiddleValue(li, fi);
                continue;
            }
            if(arr[mi] < key){
                li = mi - 1;
                mi = findMiddleValue(li, fi);
            }
        }
        System.out.println(key + " 값이 존재하지 않습니다.");
    }

    private static int findMiddleValue(int li, int fi){
        int tmp = li + fi;
        if(tmp % 2 == 0){
            return tmp/2; 
        }
        return tmp/2 + 1;
    }
}
