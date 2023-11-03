import java.util.*;
class BMI{
    
    float calculate(int weight,int height){
        return weight/height;
    }
    void criteria(float bmi){
        if(bmi<18.5){
            System.out.print("UnderWeight");
        }
        else if(bmi>18.5 && bmi<24.9){
            System.out.print("Normal Weight");
        }
        else if(bmi>24.9 && bmi<29.9){
            System.out.print("Overweight");
        }
        else
            System.out.print("Obese");
    }
}
class Main{
    public static void main(String[] args){
        BMI a=new BMI();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Body Weight of a person (kg) : ");
        int weight=sc.nextInt();
        System.out.print("Enter Height of a person (Cm) : ");
        int height=sc.nextInt();
        float bmi=a.calculate(weight,height);
        a.criteria(bmi);
    }
}
