/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author eliot.villain
 */
public class Intervenir {
    
    private Caserne uneCaserne;
    private Pompier unPompier;
    
    public Intervenir(){
    }

    public Caserne getUneCaserne() {
        return uneCaserne;
    }

    public void setUneCaserne(Caserne uneCaserne) {
        this.uneCaserne = uneCaserne;
    }

    public Pompier getUnPompier() {
        return unPompier;
    }

    public void setUnPompier(Pompier unPompier) {
        this.unPompier = unPompier;
    }
}
