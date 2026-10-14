/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kalıtım;

public class Bisiklet extends Arac {

        private int vitesSayisi;

        public Bisiklet(int vitesSayisi, String marka, int sene) {
            super(marka, sene);
            this.vitesSayisi = vitesSayisi;
        }

        @Override
        public void hareketEt() {
            System.out.println("bisiklet yavaş hareket ediyor");
        }

        @Override
        public void frenYap() {
            System.out.println("bisiklet yumuşak fren yaptı");
        }
        
        public void zil(){
            System.out.println("Ring ring");
        }
        public void biskletBilgiGöster(){
            bilgiGoster();
            System.out.println("Bisikletin vites sayısı =" + vitesSayisi);
        }

    }