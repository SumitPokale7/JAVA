
public class A_00_01 {

    int num;
    String Name;
    int Arr[];

    public int GetNum() {
        return num;
    }

    public void SetNum(int num) {
        this.num = num;
    }

    A_00_01(int num, String Name) {
        this.num = num;
        this.Name = Name;
        this.Arr = new int[num];
    }
}
