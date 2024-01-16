import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class GestionHeladeria {
    //Emplearemos las colleciones para gestir el funcionamiento de la heladeria
    private ArrayList <Heladeria> heladeriaArrayList;
    private HashMap<Integer,Heladeria> heladeriaHashMap;
    private HashSet<Heladeria>   heladeriaHashSet;

    public GestionHeladeria() {
        this.heladeriaArrayList = new ArrayList<>();
        this.heladeriaHashMap = new HashMap<>();
        this.heladeriaHashSet = new HashSet<>();
    }

    public ArrayList<Heladeria> getHeladeriaArrayList() {
        return heladeriaArrayList;
    }

    public void setHeladeriaArrayList(ArrayList<Heladeria> heladeriaArrayList) {
        this.heladeriaArrayList = heladeriaArrayList;
    }

    public HashMap<Integer, Heladeria> getHeladeriaHashMap() {
        return heladeriaHashMap;
    }

    public void setHeladeriaHashMap(HashMap<Integer, Heladeria> heladeriaHashMap) {
        this.heladeriaHashMap = heladeriaHashMap;
    }

    public HashSet<Heladeria> getHeladeriaHashSet() {
        return heladeriaHashSet;
    }

    public void setHeladeriaHashSet(HashSet<Heladeria> heladeriaHashSet) {
        this.heladeriaHashSet = heladeriaHashSet;
    }
    //Creo un metodo para agregar gustos a la heladeria siempre y cuando no sean los que ya tenemos en la lista
    public void addGusto(Heladeria heladeria) throws Exception {
        if(!heladeriaArrayList.contains(heladeria)){
            addGusto(heladeria);
        }else{
            throw new Exception("El gusto ya se encuentra en la heladeria");
        }
    }
    public void addGustoMappa(Heladeria heladeria) throws Exception{
        if(heladeriaHashMap.isEmpty()){
            heladeriaHashMap.put(heladeria.getId(),heladeria);
        }else{
            if(!heladeriaHashMap.containsKey(heladeria.getId())) {
                heladeriaHashMap.put(heladeria.getId(),heladeria);
            }else{
                throw new Exception("El gusto ya esta es nuestra mappa");
            }
        }

    }
    public void detallesGustoMappa(){
        for(Integer heladeria : heladeriaHashMap.keySet()){
            System.out.println(heladeria);
        }
    }
    public void addGustoSet(Heladeria heladeria) throws Exception{
        //Recurro a una variable de apoyo
        //Si la especie animal no se encuentra
        Boolean isPresenteGusto=false;
        //Si dentro del hashSet es vacio
        if(heladeriaHashSet.isEmpty()){
            //Agrego gusto a mi HashSet
            heladeriaHashSet.add(heladeria);
        } else {
            //de lo contrario voy a revisar dentro de mi base de datos si encuentro la especie que esta ingresando
            for (Heladeria heladeria1 : heladeriaHashSet){
                //Si la especie que estoy introduciendo es igual a la especie que se encuentra dentro del enum
                if(heladeria1.getGustosHeladosEnum().equals(heladeria1.getGustosHeladosEnum())){
                    isPresenteGusto= true;
                }

            }
        }
        //Por lo tanto la especia ya esta presente dentro del HashSet
        if(!isPresenteGusto){
            heladeriaHashSet.add(heladeria);
            //lanzo una gestion de una exepcion para indicar que ya es dentro del set la especie
        } else{
            throw new Exception("La Specie è già nel nostro dataSet : " + heladeria.getGustosHeladosEnum()
            );
        }


    }
}
