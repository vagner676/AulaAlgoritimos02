class Main {
  public static void main(String[] args) {
   int [] vetor={7, 2, 10, 9};
    int diff = bigDiff(vetor);
    System.out.println("Diferença: " + diff);
  }
  
  
   public static int bigDiff(int[] nums) {
   int min = nums[0];
   int max = nums[0];
    for(int i = 1; i < nums.length; i++){
      if(nums[i] < min) {
        min= nums[i];
      }
      if(nums[i] > max) {
        max= nums[i];
    }
    }
    return max-min;
}
}