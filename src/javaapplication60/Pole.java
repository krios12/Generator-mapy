/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication60;

/**
 *
 * @author Dawid
 */
public class Pole {
    boolean statek;
    boolean obokStatku;
    boolean wolne;
    boolean pudlo;
    boolean trafiony;
            
    public Pole()
    {
        this.statek = false;
        this.obokStatku = false;
        this.pudlo= false;
        this.trafiony = false;
        this.wolne = true;
    }

    public boolean isStatek() {
        return statek;
    }

    public void setStatek(boolean statek) {
        this.statek = statek;
    }

    public boolean isObokStatku() {
        return obokStatku;
    }

    public void setObokStatku(boolean obokStatku) {
        this.obokStatku = obokStatku;
    }

    public boolean isWolne() {
        return wolne;
    }

    public void setWolne(boolean wolne) {
        this.wolne = wolne;
    }

    public boolean isPudlo() {
        return pudlo;
    }

    public void setPudlo(boolean pudlo) {
        this.pudlo = pudlo;
    }

    public boolean isTrafiony() {
        return trafiony;
    }

    public void setTrafiony(boolean trafiony) {
        this.trafiony = trafiony;
    }


           
    
}
