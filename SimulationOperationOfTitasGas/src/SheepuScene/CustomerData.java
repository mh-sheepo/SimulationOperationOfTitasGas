/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SheepuScene;

/**
 *
 * @author Sheepo
 */
public class CustomerData {
    private int id,phoneno;
    private String name,address;

    public CustomerData(int id, int phoneno, String name, String address) {
        this.id = id;
        this.phoneno = phoneno;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(int phoneno) {
        this.phoneno = phoneno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "CuatomerData{" + "id=" + id + ", phoneno=" + phoneno + ", name=" + name + ", address=" + address + '}';
    }
    
            
    
}
