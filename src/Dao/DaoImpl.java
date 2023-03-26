package Dao;

public class DaoImpl implements Idao {
    @Override
    public double getdata() {
        double Temp=Math.random()*40;
        return Temp;
    }
}
