package de.q60.webmps.server;

/*Generated by MPS */


public class Main {
    public static void main(String[] args) {
        System.out.println("Server process started");

        System.out.println("Waiting ");

        try {
            String portStr = System.getenv("PORT");
            ModelServer server = new ModelServer(portStr == null ? 28101 : Integer.parseInt(portStr));
            server.start();
            System.out.println("Server started");
        } catch (Exception ex) {
            System.out.println("Server failed: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
