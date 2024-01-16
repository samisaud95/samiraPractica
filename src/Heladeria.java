import java.util.Objects;

//crea la clase heladeria
public class Heladeria {
    //Agrego los atributos que tendra esta clase
    private Integer id;
    private String gusto;
    //anexo tambien creo un Enum para gestionar las diferentes versiones de presentacion de la heladeria
    private GustosHeladosEnum GustosHeladosEnum;
    private static Integer contador =1;
    private PresentacionEnum presentacionEnum;

    public Heladeria(Integer id, String gusto, PresentacionEnum presentacionEnum,GustosHeladosEnum gustosHeladosEnum) {
        ////Cada vez que se agrega un helado hara el conteo de acuerdo a los gustos ,no es una llave y no es un indice
        this.id =contador;
        this.gusto = gusto;
        this.presentacionEnum = presentacionEnum;
        this.GustosHeladosEnum=gustosHeladosEnum;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGusto() {
        return gusto;
    }

    public void setGusto(String gusto) {
        this.gusto = gusto;
    }

    public GustosHeladosEnum getGustosHeladosEnum() {
        return GustosHeladosEnum;
    }

    public void setGustosHeladosEnum(GustosHeladosEnum gustosHeladosEnum) {
        GustosHeladosEnum = gustosHeladosEnum;
    }

    public static Integer getContador() {
        return contador;
    }

    public static void setContador(Integer contador) {
        Heladeria.contador = contador;
    }

    public PresentacionEnum getPresentacionEnum() {
        return presentacionEnum;
    }

    public void setPresentacionEnum(PresentacionEnum presentacionEnum) {
        this.presentacionEnum = presentacionEnum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Heladeria heladeria = (Heladeria) o;
        return Objects.equals(id, heladeria.id) && Objects.equals(gusto, heladeria.gusto) && GustosHeladosEnum == heladeria.GustosHeladosEnum && presentacionEnum == heladeria.presentacionEnum;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, gusto, GustosHeladosEnum, presentacionEnum);
    }
}
