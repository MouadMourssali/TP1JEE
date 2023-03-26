package pres;

import Dao.DaoImpl;
import Metier.ImetierImpl;
import ext.DaoImpl2;

public class Presentation {
    public static void main(String[] args) {
        DaoImpl2 dao=new DaoImpl2();
        ImetierImpl Metier=new ImetierImpl();
        Metier.setDao(dao);
        System.out.println(Metier.calcul());
    }
}
