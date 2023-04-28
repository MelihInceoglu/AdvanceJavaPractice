import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C02 {
    public static void main(String[] args) {
        String str = "hello world";
        String enCokTekrarEdenHarf ="";
        String[] cumleArr = str.split(" ");

        for (int i = 0; i<cumleArr.length;i++){
            for (int j = 0; j < cumleArr[i].length(); j++){
                if(cumleArr[i].contains(cumleArr[i].substring(j,j+1))){
                }
            }


            }
    }
}
