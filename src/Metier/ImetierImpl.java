package Metier;

import Dao.Idao;

public class ImetierImpl implements Imetier {
    private Idao dao=null;
    @Override
    public double calcul() {
        double Temp= dao.getdata();
        double res=Temp;

        return res;
    }

    public Idao getDao() {
        return dao;
    }

    public void setDao(Idao dao) {
        this.dao = dao;
    }
}
