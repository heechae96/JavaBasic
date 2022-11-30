package ch7;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ch7_9 {
    public static void main(String[] args) {
        // 아래의 EventHandler를 익명클래스(anonymous class)로 변경하세요
        Frame f = new Frame();
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                e.getWindow().setVisible(false);
                e.getWindow().dispose();
                System.exit(0);
            }
        });
    }
}

//class EventHandler extends WindowAdapter{
//    public void windowClosing(WindowEvent e){
//        e.getWindow().setVisible(false);
//        e.getWindow().dispose();
//        System.exit(0);
//    }
//}
