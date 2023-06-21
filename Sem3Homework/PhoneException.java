public class PhoneException extends RuntimeException {

    public PhoneException() {
        super("Введите корректный номер телефона (целое беззнаковое число без форматирования)");
    }

}
