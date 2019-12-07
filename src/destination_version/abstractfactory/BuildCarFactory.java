package destination_version.abstractfactory;

public class BuildCarFactory implements Provider{
    @Override
    public Sender produce(){
        return new CarSender();
    }


    public CarBody buildBody(){
        return new CarBody();
    }

    public CarWheel buildWheel(){
        return new CarWheel();
    }

    public CarBone buildBone(){
        return new CarBone();
    }

    public Car buildCarOK(CarBody body,CarBone bone,CarWheel wheel){
        body.who();
        bone.who();
        wheel.who();
        return new Car();
    }
}
