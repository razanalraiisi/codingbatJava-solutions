public int scoresAverage(int[] scores) {
    int mid=scores.length/2;
    int firstHalf=average(scores,0,mid-1);
    int secondHalf=average(scores,mid,scores.length-1);
    if(firstHalf>secondHalf){
        return firstHalf;
    }
    return secondHalf;

}

public int average(int[] scores, int start, int end){
    int sum=0;
    for(int i = start; i <= end; i++){
        sum+=scores[i];
    }
    return sum/(end-start+1);
}
