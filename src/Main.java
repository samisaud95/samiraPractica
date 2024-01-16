public class Main {
    public static void main(String[] args) throws Exception {

        Heladeria helado1 = new Heladeria(1,"Vainilla",PresentacionEnum.BARQUILLA,GustosHeladosEnum.VAINILLA);
        Heladeria helado2 = new Heladeria(1,"Vainilla",PresentacionEnum.TINA,GustosHeladosEnum.FRESA);
        Heladeria helado3 = new Heladeria(1,"Vainilla",PresentacionEnum.TINADELLEVAR,GustosHeladosEnum.PISTACHO);

       GestionHeladeria gestionHeladeria = new GestionHeladeria();
       gestionHeladeria.addGustoMappa(helado1);
       gestionHeladeria.addGusto(helado2);
        helado1.getGustosHeladosEnum();
        helado2.getGustosHeladosEnum();
        helado3.getGustosHeladosEnum();
        helado2.getGusto();
        helado1.getId();




        System.out.println("Hello world!");
    }
}