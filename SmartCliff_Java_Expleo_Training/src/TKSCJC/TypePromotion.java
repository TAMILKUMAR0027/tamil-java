/*
 * The automatic type coonvertion implementation
 */
package TKSCJC;

public class TypePromotion {
    public static void main(String[] args) {
        
        byte b= 50;
        b =(byte)(b * 2);  // promoted to int
        System.out.println(b);
        int a=10;
        float c= 20.0f;   
        double d=30;
        double res=a+c+d;
        System.out.println(res);
        System.out.println(((Object)res).getClass().getSimpleName());    
        }
}
