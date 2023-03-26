package ext;

import Dao.Idao;

public class DaoImpl2 implements Idao {

    @Override
    public double getdata() {
        System.out.println("version capteurs");
        double temp=1000;
        return temp;
    }
}
