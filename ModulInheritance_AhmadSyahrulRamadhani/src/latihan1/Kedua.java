/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1;

/**
 *
 * @author user
 */
public class Kedua extends Pertama{
    private int b = 8;
    protected void BacaSuper(){
        System.out.println("Nilai b :"+b);
        terlindungi();
        info();
    }
}
