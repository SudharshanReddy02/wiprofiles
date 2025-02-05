package httpserver;
import java.io.*;
import java.net.*;

// Serializable class for operation details
class Operation implements Serializable {
    int num1, num2;
    String operator;
    
    public Operation(int num1, int num2, String operator) {
        this.num1 = num1;
        this.num2 = num2;
        this.operator = operator;
    }
}

// Server
class TCPServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(9050)) {
            System.out.println("Server waiting...");
            while (true) {
                try (Socket socket = serverSocket.accept();
                     ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                     ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream())) {
                    
                    Operation op = (Operation) ois.readObject();
                    int result = calculate(op);
                    oos.writeObject(result);
                    System.out.println(op.num1 + " " + op.operator + " " + op.num2 + " = " + result);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int calculate(Operation op) {
        switch (op.operator) {
            case "+":
                return op.num1 + op.num2;
            case "-":
                return op.num1 - op.num2;
            case "*":
                return op.num1 * op.num2;
            case "/":
                return op.num2 != 0 ? op.num1 / op.num2 : 0;
            default:
                throw new IllegalArgumentException("Invalid operator");
        }
    }
}

// Client
class TCPClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 9050);
             ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
             ObjectInputStream ois = new ObjectInputStream(socket.getInputStream())) {
            
            Operation op = new Operation(5, 3, "+");
            oos.writeObject(op);
            System.out.println("Sent: " + op.num1 + " " + op.operator + " " + op.num2);
            
            int result = (int) ois.readObject();
            System.out.println("Result: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
