abstract class Beverage{
    private void Pour(int qty){
        System.out.println("pour"+qty+"ml of beverage into a glass");
        }
    abstract void addCondiment();
    protected void Stir(){
        System.out.println("stir for 25 sec");
    }
    private void Serve(){
        System.out.println("Serve through waiter");
    }
    public void templateMethod(int qty){
        Pour(qty);
        addCondiment();
        Stir();
        Serve();
    }
}