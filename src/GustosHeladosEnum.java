public enum GustosHeladosEnum {
    VAINILLA("Vainilla"),
    CHOCOLATE("Chocolate"),
    PISTACHO("Pistacho"),
    NUEZ("Nuez"),
    FRESA("Fresa"),
    LIMON("Limon"),
    MANGO("Mango"),
    CHUPICHUPI("Chupi chupi");
private String detallesGustos;
GustosHeladosEnum (String detallesGustos){
    this.detallesGustos=detallesGustos;
}

    public void setDetallesGustos(String detallesGustos) {
        this.detallesGustos = detallesGustos;
    }
}
