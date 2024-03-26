import java.util.Random;

public class Main {
    public static void main(String[] args) {
        double[] weight = new double[10];
        for (int i = 0; i < weight.length; i++) {
            weight[i] = (new Random().nextDouble()* 60) + 40;
            System.out.println(weight[i]);

        }
        double summ = 0;
        for (int i = 0; i < weight.length; i++){
            summ = summ + weight[i] ;
            if (weight[i]>=60 && weight[i]<=80){
                System.out.println("Вес в диапазоне от 60 до 80: " + weight[i]);
            }
        } System.out.println("Средний вес: "+ summ/ weight.length);
        int peopleCount = 0;
for(int i = 0; i < weight.length; i++){
    if(weight[i]>= 60 && weight[i]<=80){
        peopleCount++;
    }
}
        System.out.println("Кол-во людей: "+ peopleCount);
    }
}
