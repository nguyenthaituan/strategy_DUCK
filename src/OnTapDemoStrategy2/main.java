/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnTapDemoStrategy2;

public class main {

    public static void main(String[] args) {
   
        Duck vitXiem = new Vit_XIEM(new QuackQuack(), new Fly_With_Wings());
        vitXiem.display();
        vitXiem.fly();
        vitXiem.quack();
        
        
        Duck vitDoChoi = new VIT_DO_CHOI(new KHONG_KEU_DUOC(), new KHONG_BAY_DUOC());
        vitDoChoi.display();
        vitDoChoi.fly();
        vitDoChoi.quack();

        
//        vitXiem.setQuackBehavior(new KHONG_KEU_DUOC());
//        vitXiem.quack();
    }
    
}
