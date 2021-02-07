/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ras;
import java.awt.event.KeyEvent;
import java.awt.*;
/**
 *
 * @author desalegn
 */
public class keyPreessed {
   public void evtPressed(java.awt.event.KeyEvent evt) {
       char iNumber = evt.getKeyChar();
      if(!((Character.isDigit(iNumber))||(iNumber==KeyEvent.VK_BACK_SPACE)||(iNumber==KeyEvent.VK_DELETE)))
              evt.consume();
      
   }

   

    
}
