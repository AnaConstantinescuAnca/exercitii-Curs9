import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Basket extends HashSet<String> {


    private List<String> listFruits;
    private HashSet<String> lista;

    public Basket() {

    }

    public Basket (HashSet<String> listFruits){
        System.out.println("sunt in constructor");
        lista= listFruits;
    }

    public void setLista(HashSet<String> lista) {
        this.lista = lista;
    }

    public HashSet<String> getLista() {
        return lista;
    }

    public List<String> getListFruits() {
        return listFruits;
    }


    public void setListFruits(List<String> listFruits) {
        this.listFruits = listFruits;
    }

    public boolean find(String fruit) {
        return this.listFruits.contains(fruit);
    }

    public boolean remove(String fruit){
        if (this.listFruits.contains(fruit)){
            this.listFruits.remove(fruit);
            return true;
        }
        return false;
    }

    public int position(String fruit){
        return this.listFruits.indexOf(fruit);

    }

    public int sizeBasket(List listFruits){
        return this.listFruits.size();
    }

   }
