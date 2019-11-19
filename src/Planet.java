public enum Planet {
    EARTH("Земля"), MOON("Луна"), MARS("Марс");
    private String russian;

    Planet(String russian) {
        this.russian = russian;
    }

    String getRussian() {
        return russian;
    }
}
