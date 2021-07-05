public static int[] ar(int[] a){
  int i, j, sw, temp, n = 5;
  if(a[0] == 0 | a[0] < 1)
    return a;
  for(int i = 0; i < n-1; i++){
    sw = i;
      for(int j = i+1; j < n; j++){
        if(a[j] > a[sw])
          sw = j;
      }
    
    temp = a[j];
    a[i] = a[sw];
    a[sw] = temp;
  }
  return a;
}
public static void main(String[] args){
  int i;
  int n[] = {4,3,5,2,10}
  ar(n);
  for(int i = 0; i < 5; i++)
    System.out.printf("%d",result);
}
