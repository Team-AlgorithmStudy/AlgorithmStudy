package test0621;

import java.util.Locale;

public class TestProgrammers {
    /**
     * 신규아이디 추천(정규 표현식을 )
     * @param args
     */

    public static void main(String[] args) {
        String new_id = "...!@BaT#*..y.abcdefghijklm";
        String new_id1 = "z-+.^.";
        String new_id2 = "=.=";
        String new_id3 = "123_.def";
        String new_id4 = "abcdefghijklmn.p";
        //{^a-z0-9-_.}, [.]{2,}, ^{.}., {.}$


        String test_id = solution(new_id);
        System.out.println(test_id);



    }

    public static String solution(String new_id) {
        String answer = "";


        //first
        //모든 문자를 소문자로 치환
        String first_id = new_id.toLowerCase(Locale.ROOT);


        //second
        // 알파벳 소문자, 숫자, 빼기, 밑줄, 마침표를 제외한 모든 문자를 제거
        String secondRegex = "[^a-z0-9-_.]";
        String second_id = "";

        second_id = first_id.replaceAll(secondRegex, "");


        //third
        //마침표가 2번이상 연속된 부분을 하나의 마침표로 치환
        //replaceAll을 쓰면 조건에 안맞을때까지 반복하는것 같다?
        String thirdRegex = "[.]{2,}";
        String third_id = second_id.replaceAll(thirdRegex,".");


        //fourth
        //마침표가 처음이나 끝에 위치한다면 제거
        String fourth_id = third_id;

        if(third_id.startsWith(".")){
            fourth_id = fourth_id.substring(1, fourth_id.length());
        }
        if (third_id.endsWith(".")) {
            fourth_id = fourth_id.substring(0, fourth_id.length()-1);
        }


        //fifth
        //빈 문자열이라면 a를 대입
        String fifth_id = fourth_id;
        if (fifth_id.length() == 0) {
            fifth_id += "a";
        }


        //sixth
        //길이가 16자 이상이면 15자 초과된 문자들은 제거
        String sixth_id = fifth_id;
        sixth_id = sixth_id.substring(0, 15);

        if (sixth_id.endsWith(".")) {
            sixth_id = sixth_id.substring(0, fifth_id.length() - 1);
        }

        //seventh
        //길이가 2자 이하라면 마지막문자를 길이가 3이 될때까지 반복해서 추가
        String seventh_id = sixth_id;
        if (seventh_id.length() <= 2) {
            do {
                seventh_id += seventh_id.charAt(sixth_id.length()-1);
            } while (seventh_id.length()!=3);
        }

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
