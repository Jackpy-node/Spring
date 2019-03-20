package cn.kpy.SpringDI.InnerBeansDI;

/**
 * @auther: cn.kpy
 * @version: 1.0
 * @Package: cn.cn.kpy.SpringDI.DependencyInjection.InnerBeansDI
 * @data: 2019-3-20 8:39
 * @discription:
 **/
public class Computer {
    private MainBoard mainBoard;

    public void setMainBoard(MainBoard mainBoard) {
        this.mainBoard = mainBoard;
    }

    public void TurnOn(){
        mainBoard.Function();
    }
}
