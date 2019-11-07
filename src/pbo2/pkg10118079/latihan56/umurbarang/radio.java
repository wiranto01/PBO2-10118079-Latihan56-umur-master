/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118079.latihan56.umurbarang;

/**
 *
 * @author User
 */
public class radio extends barangantik{
    private String name;

    public radio(int umur) {
        super(umur);
    }

    public String getName() {
         System.out.println("Nama barang Antik : "+name+" AM");
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
    
    
}
