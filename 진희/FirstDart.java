class Solution {
    public int solution(String dartResult) {
        String[] arr = dartResult.split("");
        double[] arrInt = new double[3];
        int idx = 0;
        double num = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].matches("[1-9]")) {
                num = Integer.parseInt(arr[i]);
            } else if(arr[i].equals("0")){
                if(num==1){
                    num = 10;
                } else{
                    num = 0;
                }
            } else{
                switch (arr[i]){
                    case "S" :
                        num = Math.pow(num, 1);
                        if(i+1!=arr.length){
                            if(!arr[i+1].matches("[*#]")){
                                arrInt[idx]=num;
                                idx++;
                            }
                        } else{
                            arrInt[idx]=num;
                            idx++;
                        }
                        break;
                    case "D" :
                        num = Math.pow(num, 2);
                        if(i+1!=arr.length){
                            if(!arr[i+1].matches("[*#]")){
                                arrInt[idx]=num;
                                idx++;
                            }
                        } else{
                            arrInt[idx]=num;
                            idx++;
                        }
                        break;
                    case "T" :
                        num = Math.pow(num, 3);
                        if(i+1<arr.length){
                            if(!arr[i+1].matches("[*#]")){
                                arrInt[idx]=num;
                                idx++;
                            }
                        } else{
                            arrInt[idx]=num;
                            idx++;
                        }
                        break;
                    case "*" :
                        num = num*2;
                        if(idx-1!=-1){
                            arrInt[idx-1]= arrInt[idx-1]*2;
                        }
                        arrInt[idx]=num;
                        idx++;
                        break;
                    case "#" :
                        num = num*(-1);
                        arrInt[idx]=num;
                        idx++;
                        break;
                }
            }
        }//for
        for (double s:arrInt
             ) {
            sum += (int) s;
        }
        return sum;
    }
}
