package takeru.core;

import takeru.core.entity.Prefecture;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        Prefecture.findById(1L);
        // Population p = new Population();
    }
}