package test0621;

import java.util.Locale;

public class TestProgrammers {
    /**
     * 신규아이디 추천
     * @param args
     */

    public static void main(String[] args) {
        String new_id = "...!@BaT#*..y.abcdefghijklm";
        String new_id1 = "z-+.^.";
        String new_id2 = "=.=";
        String new_id3 = "123_.def";
        String new_id4 = "abcdefghijklmn.p";
        //{^a-z0-9-_.}, [.]{2,}, ^{.}., {.}$


        String test_id = solution(new_id4);
        System.out.println(test_id);



    }

    public static String solution(String new_id) {
        String answer = "";


        //first
        String first_id = new_id.toLowerCase(Locale.ROOT);


        //second
        String second_id = "";
        for (int i = 0; i < first_id.length(); i++) {
            char c = first_id.charAt(i);
            if (c >= 'a' && c <= 'z') {
                second_id += String.valueOf(c);
            } else if (c >= '0' && c <= '9') {
                second_id += String.valueOf(c);
            } else if (c == '.' || c == '-' || c == '_') {
                second_id += String.valueOf(c);
            }
        }


        //third
        for(int i = 0; i < second_id.length(); i++) {
            if(second_id.charAt(i) == '.') {
                int j = i+1;
                String dot = ".";

                while(j != second_id.length() && second_id.charAt(j) == '.') {
                    dot += ".";
                    j++;
                }

                if(dot.length() > 1)
                    second_id = second_id.replace(dot, ".");
            }
        }
        String third_id = second_id;


        //fourth
        if(third_id.startsWith(".")){
            third_id = third_id.substring(1, third_id.length());
        }
        if (third_id.endsWith(".")) {
            third_id = third_id.substring(0, third_id.length()-1);
        }
        String fourth_id = third_id;


        //fifth
        if (fourth_id.length() == 0) {
            fourth_id += "a";
        }

        String fifth_id = fourth_id;


        //sixth
            fifth_id = fifth_id.substring(0, 15);

        if (fifth_id.endsWith(".")) {
            fifth_id = fifth_id.substring(0, fifth_id.length() - 1);
        }
        String sixth_id = fifth_id;


        //seventh
        if (sixth_id.length() <= 2) {
            do {
                sixth_id += sixth_id.charAt(sixth_id.length()-1);
            } while (sixth_id.length()!=3);
        }

        String seventh_id = sixth_id;
        answer = seventh_id;





        System.out.println("first_id = " + first_id);
        System.out.println("second_id = " + second_id);
        System.out.println("third_id = " + third_id);
        System.out.println("fourth_id = " + fourth_id);
        System.out.println("fifth_id = " + fifth_id);
        System.out.println("sixth_id = " + sixth_id);
        System.out.println("seventh_id = " + seventh_id);



        return answer;
    }
}
