public class Nice_Car_08 {
    private Engine_01 Engine;
    private Media_03 player = new CDPlayer_05();

    public Nice_Car_08() {
        Engine = new Power_Engine_06();
    }

    public Nice_Car_08(Engine_01 engine) {
        Engine = engine;
    }

    public void Start() {
        Engine.Start();
    }

    public void Stop() {
        Engine.Stop();
    }

    public void StartMusic() {
        player.Start();
    }

    public void StopMusic() {
        player.Stop();
    }

    public void UpgradeEngine() {
        this.Engine = new Electric_Engine_07();
    }

}