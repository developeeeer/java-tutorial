package projava;

import javax.swing.*;

public class SampleForm {
    public static void main(String[] args) {
        var frame = new JFrame("sample");
        frame.setSize(600, 400 );

        // JFrameを閉じた時にプログラムを終了させるやつ
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        var text1 = new JTextField();
        frame.add("North", text1);

        var text2 = new JTextField();
        frame.add("South", text2);

        var button = new JButton("大文字");
        button.addActionListener(ae ->
                text2.setText(text1.getText().toUpperCase())
        );
        frame.add(button);

        frame.setVisible(true);


    }
}
