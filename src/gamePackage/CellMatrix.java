package gamePackage;

public class CellMatrix {
    // ����߶�
    private int height;
    // ������
    private int width;
    // ÿ����״̬֮��ĺ�����
    private int duration;
    // �ݻ�����
    private int transfromNum = 0;
    // ����״̬��1��ʾ�0��ʾ��
    private int[][] matrix;

    /**
     * @CellMatrix
     * @param heightinfo ϸ������߶�
     * @param widthinfo  ϸ��������
     * @param durationinfo �������ʱ��
     * @param transfromNuminfo �ݻ�����
     * @param matrixinfo ϸ������
     * ϸ���๹�캯��
     * */
    public CellMatrix(final int heightinfo, final int widthinfo,
            final int durationinfo, final int transfromNuminfo,
            final int[][] matrixinfo) {
        this.height = heightinfo;
        this.width = widthinfo;
        this.duration = durationinfo;
        this.transfromNum = transfromNuminfo;
        this.matrix = matrixinfo;
    }


    /**
     * @transform
     * ��һ��״̬����һ��״̬��ת�� 1. ������Χ���ŵ�ϸ��Ϊ3�����,��һ��״̬��ϸ������Ϊ��. 2.
     * ������Χ���ŵ�ϸ��Ϊ2�����,��һ��״̬����һ״̬��ͬ.
     */
    public void transform() {
        int[][] nextMatrix = new int[width][height];
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                // ��ʼ��
                nextMatrix[x][y] = 0;
                int nearNum = findLifedNum(x, y);

                // ����3������һ״̬���ǻ�
                if (nearNum == 3) {
                    nextMatrix[x][y] = 1;
                }
                // ����2��������һ״̬һ��
                else if (nearNum == 2) {
                    nextMatrix[x][y] = matrix[x][y];
                }
            }
        }
        matrix = nextMatrix;
        transfromNum++;
    }

    /*
     * ͳ��ÿ��ϸ����Χ���ŵĸ��� x ������ y ������
     */
    public int findLifedNum(int y, int x) {

        int num = 0;

        // ���
        if (x != 0) {
            num += matrix[y][x - 1];
        }
        // ���Ͻ�
        if (x != 0 && y != 0) {
            num += matrix[y - 1][x - 1];
        }
        // �ϱ�
        if (y != 0) {
            num += matrix[y - 1][x];
        }
        // ����
        if (x != width - 1 && y != 0) {
            num += matrix[y - 1][x + 1];
        }
        // �ұ�
        if (x != width - 1) {
            num += matrix[y][x + 1];
        }
        // ����
        if (x != width - 1 && y != height - 1) {
            num += matrix[y + 1][x + 1];
        }
        // �±�
        if (y != height - 1) {
            num += matrix[y + 1][x];
        }
        // ����
        if (x != 0 && y != height - 1) {
            num += matrix[y + 1][x - 1];
        }
        return num;
    }

    // ����߶�
    public int getHeight() {
        return height;
    }

    // ������
    public int getWidth() {
        return width;
    }

    // ����״̬��1��ʾ�0��ʾ��
    public int[][] getMatrix() {
        return matrix;
    }


    // �ݻ�����
    public int getTransfromNum() {
        return transfromNum;
    }

    // ÿ����״̬֮��ĺ�����
    public int getDuration() {
        return duration;
    }

    // �ٶȸı�
    public void changeDuration(int duration) {
        this.duration = duration;
    }

    // ��ʼ��
    public void init() {
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                // ��ʼ��
                matrix[x][y] = 0;
            }
        }
        transfromNum = 0;
    }

}
