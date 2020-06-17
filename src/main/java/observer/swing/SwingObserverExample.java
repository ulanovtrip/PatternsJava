package observer.swing;

import javax.swing.*;

public class SwingObserverExample {
    JFrame frame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    private void go() {
        frame = new JFrame();

        JButton button = new JButton("Should I do it?");
        //назначение объектов слушателями событий кнопки
//        button.addActionListener(new AngelListener());
//        button.addActionListener(new DevilListener());

        button.addActionListener(actionEvent -> System.out.println("Don't do it"));
        button.addActionListener(actionEvent -> System.out.println("Do it"));
    }
}
