package twentyThree;

public class dataType {
    public static void main(String[] args) {
        System.out.println(dataType.dataTypeSize("Character"));
    }
    static int dataTypeSize(String str){
        if(str.equals("Character")){
         return 2;
        }else if (str.equals("Integer") || str.equals("Float")) {
           return 4; 
        }else if(str.equals("Long") || str.equals("double")){
            return 8;
        }else{
            return -1;
        }

    }
    
    
}
