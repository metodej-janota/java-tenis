public class Main {

    public static void main(String[] args) {
        output output = new output();
        input input = new input();
        logic logic = new logic();

        output.Start();
        input.Input();
        logic.Ready(input, output);

        while (true){
            input.Input();
            logic.Ready(input, output);
        }
    }
}