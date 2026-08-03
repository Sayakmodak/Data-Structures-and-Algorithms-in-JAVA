import java.util.ArrayList;

public class unionOfAnarray {
    public static void main(String[] args) {
       int arrA[] = {1,2,3,4,5};
       int arrB[] = {2,5,6,7};
        
       ArrayList<Integer> sameElm = new ArrayList<>(); // [2,5]
       ArrayList<Integer> arrAInter = new ArrayList<>();
       ArrayList<Integer> arrBInter = new ArrayList<>();


       for(int i=0; i<arrA.length; i++){
        boolean found = false;
        for(int j=0; j<arrB.length; j++){
            if(arrA[i] == arrB[j]){
                sameElm.add(arrA[i]);
                found = true;
                break;
            }
        }
        if(!found){
            arrAInter.add(arrA[i]);
        }
       }

       
       /* for(int i=0; i<arrA.length; i++){
        boolean found = false;
        for(int j=0; j<arrB.length; j++){
            if(arrA[i] == arrB[j]){
                found = true;
                break;
            }
        }
        if(!found){
            arrAInter.add(arrA[i]);
        }
       } */

       for(int i=0; i<arrB.length; i++){
        boolean found = false;
        
        for(int j=0; j<arrA.length; j++){
            if(arrB[i] == arrA[j]){
                found = true;
                break;
            }
        }
        if(!found){
            arrBInter.add(arrB[i]);
        }
       }

    //    System.out.println(arrAInter);
    //    System.out.println(arrBInter);
       
       sameElm.addAll(arrAInter);
       sameElm.addAll(arrBInter);
       System.out.println(sameElm);
    }}
