//create a method add to sum up 4 numbers together using the generics and print the result using the method "display"
//a) int , int ,float, float
//b) string string,int,string
//c) float,float,float,string

package Others;

public class GenericAdder<T1, T2, T3, T4> {

    private T1 val1;
    private T2 val2;
    private T3 val3;
    private T4 val4;

    public GenericAdder(T1 val1, T2 val2, T3 val3, T4 val4) {
        this.val1 = val1;
        this.val2 = val2;
        this.val3 = val3;
        this.val4 = val4;
    }

    public Object add() {
        double sum = 0;
        StringBuilder resultString = new StringBuilder();

        if (val1 instanceof Number) {
            sum += ((Number) val1).doubleValue();
        } else if (val1 instanceof String) {
            resultString.append(val1);
        }

        if (val2 instanceof Number) {
            sum += ((Number) val2).doubleValue();
        } else if (val2 instanceof String) {
            resultString.append(val2);
        }

        if (val3 instanceof Number) {
            sum += ((Number) val3).doubleValue();
        } else if (val3 instanceof String) {
            resultString.append(val3);
        }

        if (val4 instanceof Number) {
            sum += ((Number) val4).doubleValue();
        } else if (val4 instanceof String) {
            resultString.append(val4);
        }

        if (resultString.length() > 0) {
            return resultString.toString();
        } else {
            return sum;
        }
    }

    public void display(Object result) {
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        GenericAdder<Integer, Integer, Float, Float> adder1 = new GenericAdder<>(10, 20, 15.5f, 10.5f);
        Object result1 = adder1.add();
        adder1.display(result1);

        GenericAdder<String, String, Integer, String> adder2 = new GenericAdder<>("Hello", "World", 2023, "!");
        Object result2 = adder2.add();
        adder2.display(result2);

        GenericAdder<Float, Float, Float, String> adder3 = new GenericAdder<>(10.5f, 5.5f, 3.0f, "sum");
        Object result3 = adder3.add();
        adder3.display(result3);
    }
}


