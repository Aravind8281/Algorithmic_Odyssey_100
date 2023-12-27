public class Main{
    static void PhoneNumberCombination(String p,String Up){
        if(Up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit=Up.charAt(0)-'0';
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char)('a'+i);
            PhoneNumberCombination(p+ch,Up.substring(1));
        }
    }
    public static void main (String[] args) {
        PhoneNumberCombination("","12");
    }
}
