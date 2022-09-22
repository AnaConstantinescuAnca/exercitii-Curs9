import java.util.*;

public class Main {

    public static void main(String[] args) {

        Basket basket = new Basket();

        List<String > listaProduse = new ArrayList<>();

        //incarc lista de produse
        listaProduse.add("mar");
        listaProduse.add("para");
        listaProduse.add("caisa");


        //bag produsele in cos

        basket.setListFruits(listaProduse);
        //afisez produsele din cos
        System.out.println("In cos am urmatoarele fructe " + basket.getListFruits());

        //gasesc fructul introdus in cos?
        System.out.println(basket.find("mar"));

        //am scos fructul gasit in cos?
        System.out.println(String.format("Am scos fructul gasit din cos? %b",  basket.remove("mar")));

        //afisez fructele din cos ramase
        System.out.println("In cos au ramas urmatoarele fructe " + basket.getListFruits());

        //introduc un fruct in cos
        listaProduse.add("cirese");

        basket.setListFruits(listaProduse);
        System.out.println(basket.getListFruits());

        //intorc pozitia fructului introdus in cos
        System.out.println(String.format("Fructul introdus in cos se afla pe pozitia %d ",basket.position("cirese")));

        //dimensiunea cosului cu fructe
        System.out.println(basket.sizeBasket(listaProduse));

        // mai introduc o para in cos
        listaProduse.add("para");
        basket.setListFruits(listaProduse);
        System.out.println("Lista de fructe dupa ce am mai adaugat o fructa: " + basket.getListFruits());

        System.out.println("Pe prima pozitie avem " + listaProduse.get(0));

        // fac lista care nu permite dubluri
        HashSet<String> lista = new HashSet<String>();

        //incarc lista cu ce am in listaProduse (care are dubluri)
        lista.addAll(listaProduse);

        Basket newBasket = new Basket(lista);
        newBasket.setLista(lista);

        System.out.println("am obtinut lista distinct " + newBasket.getLista());



    }

}
