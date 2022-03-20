public class Main {
    public static void main(String[] args) {

        //переменные

        int startBudget = 100; //стартовая сумма счета
        int refill = 1110; //сумма пополнения
        int bonus; //сумма бонуса
        int totalBudget; //итоговая сумма счета

        //логика кода

        if (refill > 1000) {        //если пополняем больше, чем на 1000, то рассчитываем сумму бонуса
            bonus = refill / 100;
        } else {
            bonus = 0;              //если пополняем меньше, чем на 1000, то бонус равен 0
        }

        totalBudget = startBudget + refill + bonus; //итоговая сумма на счете
        System.out.println("Сумма счета после пополнения равна: " + totalBudget);
        System.out.println("Количество бонусных рублей составило: " + bonus);
    }
}
