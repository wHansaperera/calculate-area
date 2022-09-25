/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatearea;

/**
 *
 * @author HANZA
 */
public class Calculatearea {
float radiusOfCrcle=6.913f;
float radiusOfCylinder=7.81f;
int lengthOfSqar=7;
int heigtOfTriangle=9;
int baseOfTriangle= 6;    
int heightOfcylnder=13;
float pi=3.14f;
    float area(float pi,float radiusOfCrcle ){
    
   return  pi*radiusOfCrcle *radiusOfCrcle ;
    
    
    }
    int area(int lengthOfSqar ){
    
   return   lengthOfSqar* lengthOfSqar ;
    
    
    }
    int area(int baseOfTriangle,int heigtOfTriangle ){
    
   return   (baseOfTriangle*heigtOfTriangle)/2 ;
    
    
    }
   float area(float pi,float radiusOfCylinder,int heightOfcylnder ){
    
   return   2*pi*radiusOfCylinder*radiusOfCylinder+ 2*pi*radiusOfCylinder*heightOfcylnder;
    
    
    }
    
    
    
    
    public static void main(String[] args) {
        Calculatearea a=new Calculatearea();
        System.out.println("area of circle="+a.area(3.14f, 6.913f));
        System.out.println("area of squar="+a.area(7));
        System.out.println("area of triangle="+a.area(6, 9));
       System.out.println("area of cylinder="+a.area(3.14f, 7.81f, 13));
        
        
        
       
    }
    
}
