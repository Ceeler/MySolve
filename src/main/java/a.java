import java.util.Scanner;

class Main {

    static int solve(int a, int b, int k){

        final int MAX_DAYS = 99; //Максимальное число дней на турникете
        int days = 0;
        int va;
        int vb;
        int min;
        //Делаем число a всегда большим
        if(b > a){
            int max = b;
            b = a;
            a = max;

        }

        //Цикл пока меньшее число(b) не станет 0
        while (b > 0){
            //Отображение на табло
            if(a > MAX_DAYS) va = MAX_DAYS;
            else va = a;
            if(b > MAX_DAYS) vb = MAX_DAYS;
            else vb = b;


            //Проверка условия задачи
            if(k*vb == va){
               return days;
            }
            //Если два числа больще 99, пропускаем дни пока 1 не начнет меняться
            min = Math.min(a,b);
            if(min > 99){
                days = min - 99;
                a -= days;
                b -= days;
            }
            else {
                days++;
                b--;
                a--;
            }

        }
        return -1;

    }

    public static void main(String args[]) {
            int t;
            int a;
            int b;
            int k;
            int days;

            Scanner sc = new Scanner(System.in);
            t = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < t; i++) {
                //Считывание данных с консоли
                String str = sc.nextLine();
                a = Integer.parseInt(str.split(" ")[0]);
                b = Integer.parseInt(str.split(" ")[1]);
                k = Integer.parseInt(str.split(" ")[2]);
            //Функция поиска решения
            days = solve(a, b, k);
            System.out.println(days);

        }
    }}