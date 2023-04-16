public class ArrayStudy1 {
    public static void main(String[] args) {

        int sum=0;
        float average =0f;

        int[] score = new int[5];

        for(int i = 0; i <score.length; i++){
            score[i] = (int)(Math.random()*100)+1;
        sum += score[i];
            System.out.printf("입력된 점수는%s입니다\n",score[i]);
        }
        average = sum/(float)score.length;

        System.out.printf("총점 = %s\n",sum);
        System.out.printf("평균 = %s", average);
    }
}