
class Kids {

    public String name;
    public int age;
    public String address;
}

public class Object_Array_Example {

    public static void main(String[] args) {

        Kids k1 = new Kids();
        k1.name = "Nabhya";
        k1.age = 2;
        k1.address = "Virar";

        Kids k2 = new Kids();
        k2.name = "Tanush";
        k2.age = 3;
        k2.address = "Goregoan";

        Kids k3 = new Kids();
        k3.name = "Nikhil";
        k3.age = 9;
        k3.address = "Goregoan";

        Kids kids[] = new Kids[3];
        kids[0] = k1;
        kids[1] = k2;
        kids[2] = k3;

        // for (int i = 0; i < kids.length; i++) {
        //     System.out.println(kids[i].name + " : " + kids[i].age + " : " + kids[i].address);
        // }
        for (Kids k : kids) {
            System.out.println(k.name + " : " + k.age + " : " + k.address);
        }
    }
}
