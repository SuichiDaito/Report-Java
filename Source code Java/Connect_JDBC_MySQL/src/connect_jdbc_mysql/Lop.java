/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connect_jdbc_mysql;


public class Lop {
    public int MaLop;
    public String TenLop;

    public int getMaLop() {
        return MaLop;
    }
    public void setMaLop(int Id) {
        this.MaLop = Id;
    }

    public Lop(int MaLop, String TenLop) {
        this.MaLop = MaLop;
        this.TenLop = TenLop;
    }
    public String getTenLop() {
        return TenLop;
    }

    public void setTenLop(String TenLop) {
        this.TenLop = TenLop;
    }
    
    
}
