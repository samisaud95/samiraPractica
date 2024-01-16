public enum PresentacionEnum {
    BARQUILLA("Barquilla"),
    TINA("Tinita"),
    TINADELLEVAR("Tina de Llevar");

   private String detallesPresentacion;
   PresentacionEnum(String detallesPresentacion){
       this.detallesPresentacion= detallesPresentacion;
   }

    public void setDetallesPresentacion(String detallesPresentacion) {
        this.detallesPresentacion = detallesPresentacion;
    }
}
