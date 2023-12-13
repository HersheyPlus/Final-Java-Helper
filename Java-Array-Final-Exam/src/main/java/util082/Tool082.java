package util082;
import valuable082.Container082;
public class Tool082 {
    public static Boolean isUseable082(String str){
        return str != null && !str.isBlank();
    }

    public static Boolean isUseable082(Object[] obj){
        return obj != null && obj.length > 0;
    }

    public static int count082(Object[] obj){
        int count = 0;
        if (!isUseable082(obj)) return -1;
        for (Object elem: obj){
            if (elem != null) count++;
        }
        return count;
    }
}
