public class Castle {
    protected String name;
    protected boolean isAccessible;
    protected boolean isInTheCastle;

    public Castle(String name) {
        this.name = name;
        this.isAccessible = true;
        this.isInTheCastle = false;
    }

    public String getName() {
        return name;
    }

    public boolean isAccessible() {
        return isAccessible;
    }

    public void setAccessible(boolean accessible) {
        this.isAccessible = accessible;
    }

    public boolean isInTheCastle() {
        return isInTheCastle;
    }

    // Aliases for entering and exiting the castle
    public void enter() {
        goUp();
    }

    public void exit() {
        goDown();
    }

    public void goUp() {
        if (isAccessible && !isInTheCastle) {
            isInTheCastle = true;
            System.out.println("You have entered the " + name + ".");
        } else if (isInTheCastle) {
            System.out.println("You are already in the " + name + ".");
        } else {
            System.out.println("The " + name + " is not accessible right now.");
        }
    }

    public void goDown() {
        if (isInTheCastle) {
            isInTheCastle = false;
            System.out.println("You have exited the " + name + ".");
        } else {
            System.out.println("You are not in the " + name + " to exit.");
        }
    }
}
