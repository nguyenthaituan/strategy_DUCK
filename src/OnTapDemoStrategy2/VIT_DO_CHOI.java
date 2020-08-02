/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnTapDemoStrategy2;

public class VIT_DO_CHOI extends Duck{

    public VIT_DO_CHOI(QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
        super(quackBehavior, flyBehavior);
    }
    
    @Override
    public void display() {
        System.out.println("ĐÂY LÀ VỊT ĐỒ CHƠI");
    }
}
