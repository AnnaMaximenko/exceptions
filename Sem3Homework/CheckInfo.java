public class CheckInfo {

    public boolean correctDate(String[] input) {
        String[] array = null;
        String date = input[3];
        if (date.contains(".")) {
            array = date.split("\\.");
        } else
            throw new DateException();

        if (array.length != 3) {
            throw new DateException();
        }
        for (String el : array) {
            try {
                Integer.parseInt(el);
            } catch (NumberFormatException e) {
                throw new DateException();
            }
        }
        return true;
    }

    public boolean correctTel(String[] str) {
        String phone = str[4];

        try {
            Long.parseLong(phone);
            return true;
        } catch (NumberFormatException e) {
            throw new PhoneException();
        }
    }

    public boolean correctSex(String[] str) {
        String sex = str[5];
        if (sex.equals("f") | sex.equals("m"))
            return true;
        else
            throw new SexException();
    }

}
