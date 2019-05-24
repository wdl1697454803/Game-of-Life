package gamePackage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

///**
// * @UI
// * UI�࣬������ӻ�����
// * */
public class UI extends JFrame {

    private static final long serialVersionUID = 1L;
    private boolean isStart = false; // ��Ϸ��ʼ�ı�־
    private boolean stop = true; // ��Ϸ��ͣ�ı�־
    private int duration = 200; // ����Ĭ��ʱ����200ms
    private static CellMatrix cellMatrix; // ϸ������
    private static int[][] matrix;

    // �����������
    private static UI mainframe = new UI();
    private JPanel contentPane = new JPanel(); // �м�����

    private JMenuBar menuBar = new JMenuBar(); // �˵�
    private JMenu menu1 = new JMenu("��Ϸ����"); // ��Ϸ���Ʋ˵�
    private JMenuItem menuItem1 = new JMenuItem("��Ϸ��ʼ"); // ��Ϸ��ʼ
    private JMenuItem menuItem2 = new JMenuItem("��Ϸ��ͣ"); // ��Ϸ��ͣ
    private JMenuItem menuItem3 = new JMenuItem("��ս���"); // ��ս���

    private JMenu Menu2 = new JMenu("�����С"); // �����С�˵�
    private JMenuItem MenuItem4 = new JMenuItem("20*20"); // 20*20
    private JMenuItem MenuItem5 = new JMenuItem("30*30"); // 30*30
    private JMenuItem MenuItem6 = new JMenuItem("40*40"); // 40*40
    private JMenuItem MenuItem7 = new JMenuItem("50*50"); // 50*50

    private JMenu Menu3 = new JMenu("�ݻ�����"); // �ݻ����ʲ˵�
    private JMenuItem MenuItem8 = new JMenuItem("�Ͽ��ٶ�"); // �Ͽ��ٶ�
    private JMenuItem MenuItem9 = new JMenuItem("�е��ٶ�"); // �е��ٶ�
    private JMenuItem MenuItem10 = new JMenuItem("�����ٶ�"); // �����ٶ�

    private JMenu Menu4 = new JMenu("ͼ��Ԥ��"); // ͼ��Ԥ��˵�
    private JMenuItem MenuItem11 = new JMenuItem("�����ߣ�20*20��"); // �����ߣ�20*20��
    private JMenuItem MenuItem12 = new JMenuItem("�����ǣ�20*20��"); // �����ǣ�20*20��

    private static JButton[][] btns; // ��ť���ɽ���

    private static JLabel Message = new JLabel("�ݻ�������");

    /**
     * @frame
     * @param height ϸ������߶�
     * @param width  ϸ��������
     * ��������
     * */
    public void frame(final int height, final int width) {

        mainframe.setTitle("������Ϸ");
        mainframe.setSize(765, 872);
        mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainframe.setLocationRelativeTo(null); // ʹ��������������
        mainframe.setResizable(false); // ���ڴ�С���ɱ�

        // �˵�
        mainframe.setJMenuBar(menuBar);

        // ��Ϸ���Ʋ˵�
        menu1.setFont(new Font("������κ", Font.PLAIN, 20));
        menuBar.add(menu1);

        // ��Ϸ��ʼ
        menuItem1.addActionListener(new MenuItemActionListener());
        menuItem1.setFont(new Font("������κ", Font.PLAIN, 20));
        menu1.add(menuItem1);

        // ��Ϸ��ͣ
        menuItem2.addActionListener(new MenuItemActionListener());
        menuItem2.setFont(new Font("������κ", Font.PLAIN, 20));
        menu1.add(menuItem2);

        // ��ս���
        menuItem3.addActionListener(new MenuItemActionListener());
        menuItem3.setFont(new Font("������κ", Font.PLAIN, 20));
        menu1.add(menuItem3);

        // �����С�˵�
        Menu2.setFont(new Font("������κ", Font.PLAIN, 20));
        menuBar.add(Menu2);

        // 20*20
        MenuItem4.addActionListener(new MenuItemActionListener());
        MenuItem4.setFont(new Font("������κ", Font.PLAIN, 20));
        Menu2.add(MenuItem4);

        // 30*30
        MenuItem5.addActionListener(new MenuItemActionListener());
        MenuItem5.setFont(new Font("������κ", Font.PLAIN, 20));
        Menu2.add(MenuItem5);

        // 40*40
        MenuItem6.addActionListener(new MenuItemActionListener());
        MenuItem6.setFont(new Font("������κ", Font.PLAIN, 20));
        Menu2.add(MenuItem6);

        // 50*50
        MenuItem7.addActionListener(new MenuItemActionListener());
        MenuItem7.setFont(new Font("������κ", Font.PLAIN, 20));
        Menu2.add(MenuItem7);

        // �ݻ����ʲ˵�
        Menu3.setFont(new Font("������κ", Font.PLAIN, 20));
        menuBar.add(Menu3);

        // �Ͽ��ٶ�
        MenuItem8.addActionListener(new MenuItemActionListener());
        MenuItem8.setFont(new Font("������κ", Font.PLAIN, 20));
        Menu3.add(MenuItem8);

        // �е��ٶ�
        MenuItem9.addActionListener(new MenuItemActionListener());
        MenuItem9.setFont(new Font("������κ", Font.PLAIN, 20));
        Menu3.add(MenuItem9);

        // �����ٶ�
        MenuItem10.addActionListener(new MenuItemActionListener());
        MenuItem10.setFont(new Font("������κ", Font.PLAIN, 20));
        Menu3.add(MenuItem10);

        // ͼ��Ԥ��˵�
        Menu4.setFont(new Font("������κ", Font.PLAIN, 20));
        menuBar.add(Menu4);

        // �����ߣ�20*20��
        MenuItem11.addActionListener(new MenuItemActionListener());
        MenuItem11.setFont(new Font("������κ", Font.PLAIN, 20));
        Menu4.add(MenuItem11);

        // �����ǣ�20*20��
        MenuItem12.addActionListener(new MenuItemActionListener());
        MenuItem12.setFont(new Font("������κ", Font.PLAIN, 20));
        Menu4.add(MenuItem12);

        // �м�����
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        mainframe.setContentPane(contentPane);
        contentPane.setLayout(null);

        // ��Ϣ��ʾ����
        JPanel panel1 = new JPanel();
        panel1.setBounds(5, 5, 750, 50);
        panel1.setLayout(new BorderLayout(0, 0));
        contentPane.add(panel1);

        // ��Ϣ��ʾ��
        Message.setFont(new Font("������κ", Font.PLAIN, 20));
        Message.setOpaque(true);
        panel1.add(Message);

        // ϸ�����
        JPanel panel2 = new JPanel();
        panel2.setBounds(5, 55, 750, 750);
        contentPane.add(panel2);

        matrix = new int[width][height];
        cellMatrix = new CellMatrix(width, height, duration, 0, matrix);

        panel2.setLayout(new GridLayout(width, height, 0, 0));
        btns = new JButton[width][height];

        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                JButton temp = new JButton();
                btns[x][y] = temp;
                btns[x][y].addActionListener(new buttonaction());
                btns[x][y].setBackground(Color.white);
                matrix[x][y] = 0;
                panel2.add(btns[x][y]);
            }
        }
        mainframe.setVisible(true);
    }

    private void showMatrix() {
        for (int x = 0; x < cellMatrix.getWidth(); x++) {
            for (int y = 0; y < cellMatrix.getHeight(); y++) {
                if (matrix[x][y] == 1) {
                    btns[x][y].setBackground(Color.BLACK);
                } else {
                    btns[x][y].setBackground(Color.WHITE);
                }
            }
        }
        Message.setText("�ݻ�������" + cellMatrix.getTransfromNum());
    }

    private class buttonaction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton buttontemp = (JButton) e.getSource(); // �����صİ�ť�¼�ǿ��ת���ɰ�ť
            for (int x = 0; x < cellMatrix.getWidth(); x++) {
                for (int y = 0; y < cellMatrix.getHeight(); y++) {
                    if ((matrix[x][y] == 0) && (buttontemp == btns[x][y])) {
                        btns[x][y].setBackground(Color.BLACK);
                        matrix[x][y] = 1;
                    } else if ((matrix[x][y] == 1) && (buttontemp == btns[x][y])) {
                        btns[x][y].setBackground(Color.WHITE);
                        matrix[x][y] = 0;
                    }
                }
            }
        }
    }

    private class MenuItemActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JMenuItem jmi = (JMenuItem) e.getSource();
            String item = jmi.getText();
            if (item.equals("��Ϸ��ʼ")) {
                if (!isStart) {
                    stop = false;
                    new Thread(new GameControlTask()).start();
                    isStart = true;
                    showMatrix();
                } else {
                    JOptionPane.showMessageDialog(mainframe, "��Ϸ�Ѿ���ʼ", "", JOptionPane.ERROR_MESSAGE);
                }
            } else if (item.equals("��Ϸ��ͣ")) {
                stop = true;
                isStart = false;
            } else if (item.equals("��ս���")) {
                stop = true;
                isStart = false;
                cellMatrix.init();
                showMatrix();
            } else if (item.equals("20*20")) {
                stop = true;
                isStart = false;
                mainframe.dispose();
                UI frame = new UI();
                frame.frame(20, 20);
            } else if (item.equals("30*30")) {
                stop = true;
                isStart = false;
                mainframe.dispose();
                UI frame = new UI();
                frame.frame(30, 30);
            } else if (item.equals("40*40")) {
                stop = true;
                isStart = false;
                mainframe.dispose();
                UI frame = new UI();
                frame.frame(40, 40);
            } else if (item.equals("50*50")) {
                stop = true;
                isStart = false;
                mainframe.dispose();
                UI frame = new UI();
                frame.frame(50, 50);
            } else if (item.equals("�Ͽ��ٶ�")) {
                cellMatrix.changeDuration(100);
            } else if (item.equals("�е��ٶ�")) {
                cellMatrix.changeDuration(200);
            } else if (item.equals("�����ٶ�")) {
                cellMatrix.changeDuration(500);
            } else if (item.equals("�����ߣ�20*20��")) {
                stop = true;
                isStart = false;
                if (cellMatrix.getHeight() != 20) {
                    JOptionPane.showMessageDialog(mainframe, "��ѡ����ȷ�Ľ����С", "", JOptionPane.ERROR_MESSAGE);
                } else {
                    gliders_20();
                }
            } else if (item.equals("�����ǣ�20*20��")) {
                stop = true;
                isStart = false;
                if (cellMatrix.getHeight() != 20) {
                    JOptionPane.showMessageDialog(mainframe, "��ѡ����ȷ�Ľ����С", "", JOptionPane.ERROR_MESSAGE);
                } else {
                    pulsar_20();
                }
            }
        }
    }

    // �����ߣ�20*20��
    private void gliders_20() {
        cellMatrix.init();
        cellMatrix.getMatrix()[0][1] = 1;
        cellMatrix.getMatrix()[0][18] = 1;
        cellMatrix.getMatrix()[1][2] = 1;
        cellMatrix.getMatrix()[1][17] = 1;
        cellMatrix.getMatrix()[2][0] = 1;
        cellMatrix.getMatrix()[2][1] = 1;
        cellMatrix.getMatrix()[2][2] = 1;
        cellMatrix.getMatrix()[2][17] = 1;
        cellMatrix.getMatrix()[2][18] = 1;
        cellMatrix.getMatrix()[2][19] = 1;
        cellMatrix.getMatrix()[17][0] = 1;
        cellMatrix.getMatrix()[17][1] = 1;
        cellMatrix.getMatrix()[17][2] = 1;
        cellMatrix.getMatrix()[17][17] = 1;
        cellMatrix.getMatrix()[17][18] = 1;
        cellMatrix.getMatrix()[17][19] = 1;
        cellMatrix.getMatrix()[18][2] = 1;
        cellMatrix.getMatrix()[18][17] = 1;
        cellMatrix.getMatrix()[19][1] = 1;
        cellMatrix.getMatrix()[19][18] = 1;
        showMatrix();
    }

    private void pulsar_20() {
        cellMatrix.init();
        cellMatrix.getMatrix()[3][5] = 1;
        cellMatrix.getMatrix()[3][6] = 1;
        cellMatrix.getMatrix()[3][12] = 1;
        cellMatrix.getMatrix()[3][13] = 1;
        cellMatrix.getMatrix()[4][6] = 1;
        cellMatrix.getMatrix()[4][7] = 1;
        cellMatrix.getMatrix()[4][11] = 1;
        cellMatrix.getMatrix()[4][12] = 1;
        cellMatrix.getMatrix()[5][3] = 1;
        cellMatrix.getMatrix()[5][6] = 1;
        cellMatrix.getMatrix()[5][8] = 1;
        cellMatrix.getMatrix()[5][10] = 1;
        cellMatrix.getMatrix()[5][12] = 1;
        cellMatrix.getMatrix()[5][15] = 1;
        cellMatrix.getMatrix()[6][3] = 1;
        cellMatrix.getMatrix()[6][4] = 1;
        cellMatrix.getMatrix()[6][5] = 1;
        cellMatrix.getMatrix()[6][7] = 1;
        cellMatrix.getMatrix()[6][8] = 1;
        cellMatrix.getMatrix()[6][10] = 1;
        cellMatrix.getMatrix()[6][11] = 1;
        cellMatrix.getMatrix()[6][13] = 1;
        cellMatrix.getMatrix()[6][14] = 1;
        cellMatrix.getMatrix()[6][15] = 1;
        cellMatrix.getMatrix()[7][4] = 1;
        cellMatrix.getMatrix()[7][6] = 1;
        cellMatrix.getMatrix()[7][8] = 1;
        cellMatrix.getMatrix()[7][10] = 1;
        cellMatrix.getMatrix()[7][12] = 1;
        cellMatrix.getMatrix()[7][14] = 1;
        cellMatrix.getMatrix()[8][5] = 1;
        cellMatrix.getMatrix()[8][6] = 1;
        cellMatrix.getMatrix()[8][7] = 1;
        cellMatrix.getMatrix()[8][11] = 1;
        cellMatrix.getMatrix()[8][12] = 1;
        cellMatrix.getMatrix()[8][13] = 1;
        cellMatrix.getMatrix()[10][5] = 1;
        cellMatrix.getMatrix()[10][6] = 1;
        cellMatrix.getMatrix()[10][7] = 1;
        cellMatrix.getMatrix()[10][11] = 1;
        cellMatrix.getMatrix()[10][12] = 1;
        cellMatrix.getMatrix()[10][13] = 1;
        cellMatrix.getMatrix()[11][4] = 1;
        cellMatrix.getMatrix()[11][6] = 1;
        cellMatrix.getMatrix()[11][8] = 1;
        cellMatrix.getMatrix()[11][10] = 1;
        cellMatrix.getMatrix()[11][12] = 1;
        cellMatrix.getMatrix()[11][14] = 1;
        cellMatrix.getMatrix()[12][3] = 1;
        cellMatrix.getMatrix()[12][4] = 1;
        cellMatrix.getMatrix()[12][5] = 1;
        cellMatrix.getMatrix()[12][7] = 1;
        cellMatrix.getMatrix()[12][8] = 1;
        cellMatrix.getMatrix()[12][10] = 1;
        cellMatrix.getMatrix()[12][11] = 1;
        cellMatrix.getMatrix()[12][13] = 1;
        cellMatrix.getMatrix()[12][14] = 1;
        cellMatrix.getMatrix()[12][15] = 1;
        cellMatrix.getMatrix()[13][3] = 1;
        cellMatrix.getMatrix()[13][6] = 1;
        cellMatrix.getMatrix()[13][8] = 1;
        cellMatrix.getMatrix()[13][10] = 1;
        cellMatrix.getMatrix()[13][12] = 1;
        cellMatrix.getMatrix()[13][15] = 1;
        cellMatrix.getMatrix()[14][6] = 1;
        cellMatrix.getMatrix()[14][7] = 1;
        cellMatrix.getMatrix()[14][11] = 1;
        cellMatrix.getMatrix()[14][12] = 1;
        cellMatrix.getMatrix()[15][5] = 1;
        cellMatrix.getMatrix()[15][6] = 1;
        cellMatrix.getMatrix()[15][12] = 1;
        cellMatrix.getMatrix()[15][13] = 1;
        showMatrix();
    }

    private class GameControlTask implements Runnable {
        @Override
        public void run() {
            while (!stop) {
                cellMatrix.transform();
                matrix = cellMatrix.getMatrix();
                showMatrix();
                try {
                    TimeUnit.MILLISECONDS.sleep(cellMatrix.getDuration());
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        UI frame = new UI();
        frame.frame(20, 20);
    }

}
