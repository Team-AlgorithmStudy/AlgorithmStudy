package test0629;

public class MainProgrammers0629 {
    /**
     * 비밀지도
     * @param args
     */
    public static void main(String[] args) {
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};

        String[] result = solution(n, arr1, arr2);
        System.out.println(result.toString());

    }

    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = {};
        answer = new String[n];

        String[][] zido = new String[n][n];

        int[][] firstMap = new int[n][n];
        int[][] secondMap = new int[n][n];

        //firstMap 비밀지도 매칭
        for (int i = 0; i < arr1.length; i++) {
            int testNum = arr1[i];
            for (int j = n-1; j >= 0; j--) {
                firstMap[i][j] = testNum % 2;
                testNum /= 2;
            }
        }

        //secondMap 비밀지도 매칭
        for (int i = 0; i < arr2.length; i++) {
            int testNum = arr2[i];
            for (int j = n-1; j >= 0; j--) {
                secondMap[i][j] = testNum % 2;
                testNum /= 2;
            }
        }

        for (int i = 0; i < zido.length; i++) {
            for (int j = 0; j < zido[i].length; j++) {
                if (firstMap[i][j] == 1 || secondMap[i][j] == 1) {
                    zido[i][j] = "#";
                }else {
                    zido[i][j] = " ";
                }
            }
        }

        for (int i = 0; i < zido.length; i++) {
            String s = "";
            for (int j = 0; j < zido[i].length; j++) {
//                System.out.printf("%2s", zido[i][j]);
                s += zido[i][j];
            }
            answer[i] = s;
        }

        return answer;
    }
}
