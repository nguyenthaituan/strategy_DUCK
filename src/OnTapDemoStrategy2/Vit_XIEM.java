/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnTapDemoStrategy2;

/**
 *
 * @author Admin
 */
public class Vit_XIEM extends Duck{

    public Vit_XIEM(QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
        super(quackBehavior, flyBehavior);
    }

    @Override
    public void display() {
        System.out.println("\nDay la vit Xiem");
    }
    
}
