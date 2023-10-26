import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var phones = new ArrayList<Phone>();

        var iphone = new Iphone();
        var samsung = new Samsung();
        var pixel = new Pixel();

        phones.add(iphone);
        phones.add(samsung);
        phones.add(pixel);

        for(Phone p : phones){
            System.out.println(p.brand());
        }
    }
}
