public enum Planet {
    EARTH("Земля", 3), MOON("Луна", 3.5), MARS("Марс", 4);
    private String russian;
    private double number_to_sun;

    Planet(String russian, double number_to_sun) {
        this.russian = russian;
        this.number_to_sun=number_to_sun;
    }

    double getNumber_to_sun(){
        return number_to_sun;
    }
    String getRussian() {
        return russian;
    }
}
