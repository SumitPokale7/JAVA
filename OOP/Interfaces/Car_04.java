public class Car_04 implements Engine_01, Brake_02, Media_03 {

    @Override
    public void Brake() {
        System.out.println("I Brake like a Normal Car");
    }

    @Override
    public void Start() {
        System.out.println("I start Engine like a Normal Car");
    }

    @Override
    public void Stop() {
        System.out.println("I stop Engine like a Normal Car");
    }

    @Override
    public void Acc() {
        System.out.println("I Accelerate like a Normal Car");
    }
}
