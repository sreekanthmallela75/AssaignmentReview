public class Methodoverloading {
    public int add(int a, int b, int c){
        return a+b+c;
    }
    public int add(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        Methodoverloading mo = new Methodoverloading();
        System.out.println( mo.add(14,16,18));
        System.out.println(mo.add(10,20));
        System.out.println(mo.add(1,2,3));
    }
}
