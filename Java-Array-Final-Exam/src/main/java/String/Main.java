package String;

import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        long myId = 66130500082L;
        int[] intArr = {3,5,2,1,10,6,7,3,8};
        String[] stringArr = {"Aa","Dd","Ww","Qq","Bb","Nn","Mm","Ww"};
        // Except 66-130-500-082
        System.out.println(stringFormatted(myId));
        System.out.println(stringJoin(stringArr));

        System.out.println(stringJoiner(stringArr).merge(stringJoiner1(stringArr)).toString());
    }
    public static String stringFormatted(long myId){
        return String.format("%02d-%03d-%03d-%03d",
                (myId / 1000000000L) % 100,
                (myId / 1000000L) % 1000,
                (myId / 1000L) % 1000,
                myId % 1000);
    }
    public static String stringJoin(String[] arr){
        return String.join(", ",arr);
    }

    public static String stringBulider(String[] arr) {
        StringBuilder builder = new StringBuilder();
        for(String str : arr) {
            //Check if str is not null since we need to call
            //the toString function();
            if(str == null) continue;
            builder.append(str);
            builder.append(", ");
        }

        // Remove the ", " on the last index since we dont need it speard
        return builder.toString().substring(0, builder.length() - 2);
    }

    public static StringJoiner stringJoiner(String[] arr){
        // prefix and suffix are optinal
        StringJoiner joiner = new StringJoiner(", ", "[", "]");
        for(String str : arr) {
            //Check if str is not null since we need to call
            //the toString function();
            if(str == null) continue;
            joiner.add(str);
            joiner.add(", ");
        }

        return joiner;
    }

    public static StringJoiner stringJoiner1(String[] arr){
        // prefix and suffix are optinal
        StringJoiner joiner = new StringJoiner(": ", "(", ")");
        for(String str : arr) {
            //Check if str is not null since we need to call
            //the toString function();
            if(str == null) continue;
            joiner.add(str);
            joiner.add(", ");
        }

        return joiner;
    }
}
