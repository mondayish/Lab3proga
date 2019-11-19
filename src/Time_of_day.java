public enum Time_of_day {
    MORNING("Утро"), AFTERNOON("День"), EVENING("Вечер"), NIGHT("Ночь");
    private String russian;

    Time_of_day(String russian) {
        this.russian = russian;
    }

    String getRussian() {
        return russian;
    }

    void describe(String des) {
        System.out.println("Время: " + des + " " + russian);
    }
}
