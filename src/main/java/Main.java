import ru.netology.NetologyJavaHW5.services.VacationCalc;

public class Main {
    public static void main(String[] args) {
        VacationCalc service = new VacationCalc();

        int income = 10_000;
        int expanses = 3000;
        int threshold = 20_000;
        int numberOfMonths = service.calculate(income, expanses, threshold);

        System.out.println(" В следующем году отдыхать " + numberOfMonths);

    }

}
