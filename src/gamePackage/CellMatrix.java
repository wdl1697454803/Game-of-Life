package gamePackage;

public class CellMatrix {
    // 矩阵高度
    private int height;
    // 矩阵宽度
    private int width;
    // 每两个状态之间的毫秒数
    private int duration;
    // 演化次数
    private int transfromNum = 0;
    // 矩阵状态，1表示活，0表示死
    private int[][] matrix;

    /**
     * @CellMatrix
     * @param heightinfo 细胞矩阵高度
     * @param widthinfo  细胞矩阵宽度
     * @param durationinfo 动画间隔时间
     * @param transfromNuminfo 演化次数
     * @param matrixinfo 细胞矩阵
     * 细胞类构造函数
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
     * 上一个状态到下一个状态的转移 1. 对于周围活着的细胞为3的情况,下一个状态该细胞总是为活. 2.
     * 对于周围活着的细胞为2的情况,下一个状态与上一状态相同.
     */
    public void transform() {
        int[][] nextMatrix = new int[width][height];
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                // 初始化
                nextMatrix[x][y] = 0;
                int nearNum = findLifedNum(x, y);

                // 等于3，则下一状态总是活
                if (nearNum == 3) {
                    nextMatrix[x][y] = 1;
                }
                // 等于2，则与上一状态一样
                else if (nearNum == 2) {
                    nextMatrix[x][y] = matrix[x][y];
                }
            }
        }
        matrix = nextMatrix;
        transfromNum++;
    }

    /*
     * 统计每个细胞周围活着的个数 x 横坐标 y 纵坐标
     */
    public int findLifedNum(int y, int x) {

        int num = 0;

        // 左边
        if (x != 0) {
            num += matrix[y][x - 1];
        }
        // 左上角
        if (x != 0 && y != 0) {
            num += matrix[y - 1][x - 1];
        }
        // 上边
        if (y != 0) {
            num += matrix[y - 1][x];
        }
        // 右上
        if (x != width - 1 && y != 0) {
            num += matrix[y - 1][x + 1];
        }
        // 右边
        if (x != width - 1) {
            num += matrix[y][x + 1];
        }
        // 右下
        if (x != width - 1 && y != height - 1) {
            num += matrix[y + 1][x + 1];
        }
        // 下边
        if (y != height - 1) {
            num += matrix[y + 1][x];
        }
        // 左下
        if (x != 0 && y != height - 1) {
            num += matrix[y + 1][x - 1];
        }
        return num;
    }

    // 矩阵高度
    public int getHeight() {
        return height;
    }

    // 矩阵宽度
    public int getWidth() {
        return width;
    }

    // 矩阵状态，1表示活，0表示死
    public int[][] getMatrix() {
        return matrix;
    }


    // 演化次数
    public int getTransfromNum() {
        return transfromNum;
    }

    // 每两个状态之间的毫秒数
    public int getDuration() {
        return duration;
    }

    // 速度改变
    public void changeDuration(int duration) {
        this.duration = duration;
    }

    // 初始化
    public void init() {
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                // 初始化
                matrix[x][y] = 0;
            }
        }
        transfromNum = 0;
    }

}
