package cn.itcast.hotel.abstractFactory;

public class XiaoMiFactory extends Factory{
    @Override
    public Phone createPhone() {
        return new XiaoMiPhone();
    }

    @Override
    public Computer createComputer() {
        return new XiaoMiComputer();
    }
}
