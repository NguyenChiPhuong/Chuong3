package Bai3b;
import Bai3b.Diem;
public class Tamgiac extends Diem {
    protected int a,b,c,d,e,f;
    public void Tamgiac() {
        System.out.println("NHAP TOA DO DIEM A");
        Diem A = new Diem(a,b);
        System.out.println("NHAP TOA DO DIEM B");
        Diem B = new Diem(c,d);
        System.out.println("NHAP TOA DO DIEM C");
        Diem C = new Diem(e,f);
    }
