import ru.netology.javaqacycles.hw_cycles.services.CalcMonthRest;

public class Main {

    public static void main(String[] args) {
        CalcMonthRest service = new CalcMonthRest();
        System.out.println(service.calcMonth(100_000, 60_000, 150_000));
    }
}
