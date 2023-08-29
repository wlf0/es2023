package cn.itcast.hotel.abstractFactory;

public class ApplyFactory extends Factory{
    @Override
    public Phone createPhone() {
        return new ApplyPhone();
    }

    @Override
    public Computer createComputer() {
        return new ApplyComputer();
    }
}
