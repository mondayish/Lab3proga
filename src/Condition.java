public enum Condition {
    REST("отдыхает"), SLEEP("спит"), THINK("думает"), NOTICE("внимательно смотрит на что-то"), NOTHING("ничего не делает"), STAND("Стоит");
    private String russian;

    Condition(String russian) {
        this.russian = russian;
    }

    public String getRussian() {
        return russian;
    }
}
