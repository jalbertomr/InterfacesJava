package interfaces;

/**
 * Interfaces and Inheritances - Using an Interface as a Type
 * Created by Bext on 09/01/2017.
 *
 * This class test de methods of Relatable (isLargerThan) of classes that implements from Relatable
 */
public class TestRelatable {

    // Esto trabaja bien si los objetos son de la misma clase, de lo contrario
    // se tiene que implementar en cada clase de objeto isLargerThan considerando
    // la clase del objeto, identificandola con instanceof y segun la clase
    // hacer la referencia de getArea con una variable de clase instanciada del tipo de clase
    // del objeto pasado como parametro.
    public Object findLarger(Object object1, Object object2){
        Relatable obj1 = (Relatable) object1;
        Relatable obj2 = (Relatable) object2;
        if ((obj1).isLargerThan(obj2) > 0)
            return object1;
        else
            return object2;
    }

    public Object findSmaller(Object object1, Object object2){
        Relatable obj1 = (Relatable) object1;
        Relatable obj2 = (Relatable) object2;
        if (obj1.isLargerThan(obj2) < 0)
            return object1;
        else
            return object2;
    }

    public Object isEqual(Object object1, Object object2){
        Relatable obj1 = (Relatable) object1;
        Relatable obj2 = (Relatable) object2;
        if (obj1.isLargerThan(obj2) == 0)
            return true;
        else
            return false;
    }

    public static void main(String... args){

        TestRelatable tr = new TestRelatable();

        //     .-.-.-.-.-.-.-.-.-.-.-.
        //    9.
        //    8.
        //    7.
        //    6.
        //    5.
        //    4.
        //    3.
        //    2.
        //    1.
        //     .-.-.-.-.-.-.-.-.-.-.-.
        //       1 2 3 4 5 6 7 8 9 1 0
        RectanglePlus recPlusA = new RectanglePlus(5,5);
        RectanglePlus recPlusB = new RectanglePlus(2,2);
        TrianglePlus triPlusA = new TrianglePlus(2,3);
        TrianglePlus triPlusB = new TrianglePlus(3,4);

        System.out.println("findLarger: " + tr.findLarger( recPlusA, recPlusB));
        System.out.println("findSmaller: " + tr.findSmaller( recPlusA, recPlusB));
        System.out.println("findLarger: " + tr.findLarger( triPlusA, triPlusB));
        System.out.println("findSmaller: " + tr.findSmaller( triPlusA, triPlusB));
        System.out.println("findLarger: " + tr.findLarger( triPlusB, recPlusB));
        System.out.println("findLarger: " + tr.findLarger( recPlusB, triPlusB));
    }


}
