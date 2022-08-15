public class No495 {
    public static void main(String[] args) {
        int[] t = {1, 2};
        int d = 2;
        System.out.println(findPoisonedDuration(t, d));
    }
    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        int s = timeSeries[0] + duration;
        int result = duration;
        for(int i = 1; i < timeSeries.length; ++i){
            if(s <= timeSeries[i]){
                result += duration;
            }else{
                result += (duration - s + timeSeries[i]);
            }
            s = timeSeries[i] + duration;
        }
        return result;
    }
}
