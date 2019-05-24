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
// * UI类，负责可视化界面
// * */
public class UI extends JFrame {

    private static final long serialVersionUID = 1L;
    private boolean isStart = false; // 游戏开始的标志
    private boolean stop = true; // 游戏暂停的标志
    private int duration = 200; // 动画默认时间间隔200ms
    private static CellMatrix cellMatrix; // 细胞矩阵
    private static int[][] matrix;

    // 界面组件创建
    private static UI mainframe = new UI();
    private JPanel contentPane = new JPanel(); // 中间容器

    private JMenuBar menuBar = new JMenuBar(); // 菜单
    private JMenu menu1 = new JMenu("游戏控制"); // 游戏控制菜单
    private JMenuItem menuItem1 = new JMenuItem("游戏开始"); // 游戏开始
    private JMenuItem menuItem2 = new JMenuItem("游戏暂停"); // 游戏暂停
    private JMenuItem menuItem3 = new JMenuItem("清空界面"); // 清空界面

    private JMenu Menu2 = new JMenu("界面大小"); // 界面大小菜单
    private JMenuItem MenuItem4 = new JMenuItem("20*20"); // 20*20
    private JMenuItem MenuItem5 = new JMenuItem("30*30"); // 30*30
    private JMenuItem MenuItem6 = new JMenuItem("40*40"); // 40*40
    private JMenuItem MenuItem7 = new JMenuItem("50*50"); // 50*50

    private JMenu Menu3 = new JMenu("演化速率"); // 演化速率菜单
    private JMenuItem MenuItem8 = new JMenuItem("较快速度"); // 较快速度
    private JMenuItem MenuItem9 = new JMenuItem("中等速度"); // 中等速度
    private JMenuItem MenuItem10 = new JMenuItem("较慢速度"); // 较慢速度

    private JMenu Menu4 = new JMenu("图形预设"); // 图形预设菜单
    private JMenuItem MenuItem11 = new JMenuItem("滑翔者（20*20）"); // 滑翔者（20*20）
    private JMenuItem MenuItem12 = new JMenuItem("脉冲星（20*20）"); // 脉冲星（20*20）

    private static JButton[][] btns; // 按钮构成界面

    private static JLabel Message = new JLabel("演化代数：");

    /**
     * @frame
     * @param height 细胞矩阵高度
     * @param width  细胞矩阵宽度
     * 创建窗口
     * */
    public void frame(final int height, final int width) {

        mainframe.setTitle("生命游戏");
        mainframe.setSize(765, 872);
        mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainframe.setLocationRelativeTo(null); // 使窗口在桌面中央
        mainframe.setResizable(false); // 窗口大小不可变

        // 菜单
        mainframe.setJMenuBar(menuBar);

        // 游戏控制菜单
        menu1.setFont(new Font("华文新魏", Font.PLAIN, 20));
        menuBar.add(menu1);

        // 游戏开始
        menuItem1.addActionListener(new MenuItemActionListener());
        menuItem1.setFont(new Font("华文新魏", Font.PLAIN, 20));
        menu1.add(menuItem1);

        // 游戏暂停
        menuItem2.addActionListener(new MenuItemActionListener());
        menuItem2.setFont(new Font("华文新魏", Font.PLAIN, 20));
        menu1.add(menuItem2);

        // 清空界面
        menuItem3.addActionListener(new MenuItemActionListener());
        menuItem3.setFont(new Font("华文新魏", Font.PLAIN, 20));
        menu1.add(menuItem3);

        // 界面大小菜单
        Menu2.setFont(new Font("华文新魏", Font.PLAIN, 20));
        menuBar.add(Menu2);

        // 20*20
        MenuItem4.addActionListener(new MenuItemActionListener());
        MenuItem4.setFont(new Font("华文新魏", Font.PLAIN, 20));
        Menu2.add(MenuItem4);

        // 30*30
        MenuItem5.addActionListener(new MenuItemActionListener());
        MenuItem5.setFont(new Font("华文新魏", Font.PLAIN, 20));
        Menu2.add(MenuItem5);

        // 40*40
        MenuItem6.addActionListener(new MenuItemActionListener());
        MenuItem6.setFont(new Font("华文新魏", Font.PLAIN, 20));
        Menu2.add(MenuItem6);

        // 50*50
        MenuItem7.addActionListener(new MenuItemActionListener());
        MenuItem7.setFont(new Font("华文新魏", Font.PLAIN, 20));
        Menu2.add(MenuItem7);

        // 演化速率菜单
        Menu3.setFont(new Font("华文新魏", Font.PLAIN, 20));
        menuBar.add(Menu3);

        // 较快速度
        MenuItem8.addActionListener(new MenuItemActionListener());
        MenuItem8.setFont(new Font("华文新魏", Font.PLAIN, 20));
        Menu3.add(MenuItem8);

        // 中等速度
        MenuItem9.addActionListener(new MenuItemActionListener());
        MenuItem9.setFont(new Font("华文新魏", Font.PLAIN, 20));
        Menu3.add(MenuItem9);

        // 较慢速度
        MenuItem10.addActionListener(new MenuItemActionListener());
        MenuItem10.setFont(new Font("华文新魏", Font.PLAIN, 20));
        Menu3.add(MenuItem10);

        // 图形预设菜单
        Menu4.setFont(new Font("华文新魏", Font.PLAIN, 20));
        menuBar.add(Menu4);

        // 滑翔者（20*20）
        MenuItem11.addActionListener(new MenuItemActionListener());
        MenuItem11.setFont(new Font("华文新魏", Font.PLAIN, 20));
        Menu4.add(MenuItem11);

        // 脉冲星（20*20）
        MenuItem12.addActionListener(new MenuItemActionListener());
        MenuItem12.setFont(new Font("华文新魏", Font.PLAIN, 20));
        Menu4.add(MenuItem12);

        // 中间容器
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        mainframe.setContentPane(contentPane);
        contentPane.setLayout(null);

        // 信息显示界面
        JPanel panel1 = new JPanel();
        panel1.setBounds(5, 5, 750, 50);
        panel1.setLayout(new BorderLayout(0, 0));
        contentPane.add(panel1);

        // 信息显示框
        Message.setFont(new Font("华文新魏", Font.PLAIN, 20));
        Message.setOpaque(true);
        panel1.add(Message);

        // 细胞面板
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
        Message.setText("演化代数：" + cellMatrix.getTransfromNum());
    }

    private class buttonaction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton buttontemp = (JButton) e.getSource(); // 将返回的按钮事件强行转换成按钮
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
            if (item.equals("游戏开始")) {
                if (!isStart) {
                    stop = false;
                    new Thread(new GameControlTask()).start();
                    isStart = true;
                    showMatrix();
                } else {
                    JOptionPane.showMessageDialog(mainframe, "游戏已经开始", "", JOptionPane.ERROR_MESSAGE);
                }
            } else if (item.equals("游戏暂停")) {
                stop = true;
                isStart = false;
            } else if (item.equals("清空界面")) {
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
            } else if (item.equals("较快速度")) {
                cellMatrix.changeDuration(100);
            } else if (item.equals("中等速度")) {
                cellMatrix.changeDuration(200);
            } else if (item.equals("较慢速度")) {
                cellMatrix.changeDuration(500);
            } else if (item.equals("滑翔者（20*20）")) {
                stop = true;
                isStart = false;
                if (cellMatrix.getHeight() != 20) {
                    JOptionPane.showMessageDialog(mainframe, "请选择正确的界面大小", "", JOptionPane.ERROR_MESSAGE);
                } else {
                    gliders_20();
                }
            } else if (item.equals("脉冲星（20*20）")) {
                stop = true;
                isStart = false;
                if (cellMatrix.getHeight() != 20) {
                    JOptionPane.showMessageDialog(mainframe, "请选择正确的界面大小", "", JOptionPane.ERROR_MESSAGE);
                } else {
                    pulsar_20();
                }
            }
        }
    }

    // 滑翔者（20*20）
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
