class Runner {
    public void run(Executable e) {
        System.out.println("Executing code block ...");
        int value = e.execute(15);
        System.out.println("value: " + value);
    }
}