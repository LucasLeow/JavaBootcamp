import java.util.ArrayList;

public class Interface_And_Abstract_Runner {
    public static void main(String[] args) {
        ArrayList<iFlyable> flyingObjs = new ArrayList<iFlyable>();
        flyingObjs.add(new Bird());
        flyingObjs.add(new Aeroplane());

        for (iFlyable flyObj: flyingObjs) {
            flyObj.fly();
        }
    }
}
