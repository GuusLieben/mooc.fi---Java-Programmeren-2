public class Calculator {
    private Reader reader;
    private int calculations;

    public Calculator() {
        reader = new Reader();
        calculations = 0;
    }

    private int[] getValues() {
        int[] values = new int[2];

        System.out.print("Value 1: ");
        values[0] = reader.readInt();

        System.out.print("Value 2: ");
        values[1] = reader.readInt();

        return values;
    }

    private void sum() {
        int[] values = getValues();
        int sum = values[0] + values[1];
        System.out.println("Sum : " + sum);
    }

    private void difference() {
        int[] values = getValues();
        int difference = values[0] - values[1];
        System.out.println("Difference : " + difference);
    }

    private void product() {
        int[] values = getValues();
        int product = values[0] * values[1];
        System.out.println("Product : " + product);
    }

    private void statistics() {
        System.out.println("Calculations done : " + calculations);
    }

    public void start() {
        while (true) {
            System.out.print("Command : ");
            String command = reader.readString();

            if (command.equals("end")) break;

            if (command.equals("sum")) {
                sum();
                calculations++;
            } else if (command.equals("difference")) {
                difference();
                calculations++;
            } else if (command.equals("product")) {
                product();
                calculations++;
            }
        }

        statistics();
    }
}
