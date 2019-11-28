/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negativepositive;


public class FibonacciSeries {
    public static void main(String argd[]){
    int bef=0,num=1;
    for (int i=0;i<1000;i++){
    if (num+bef==i){
        System.out.println(i);
        bef=num;
        num=i;
                } 
    }
}
     
}
