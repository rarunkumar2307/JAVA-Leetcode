package Proper;

import java.util.*;

class ProductOfNumbers {
    List<Integer> l=new ArrayList<>();

    public void add(int num) {
        l.add(num);
    }
    public int getProduct(int k) {
        if(l.isEmpty()){
            return 0;
        }
        int sum=1;
        for(int i=l.size()-1,j=1;j<=k;i--,j++){
            sum*=l.get(i);
        }
        return sum;
    }
}
class Main{
    static void main() {
        ProductOfNumbers obj = new ProductOfNumbers();
        int[] arr={3,0,2,5,4,2,3,4,8,2};
        for(int num:arr){
            obj.add(num);
        }
        System.out.println();
        System.out.println(obj.getProduct(2));
    }
}