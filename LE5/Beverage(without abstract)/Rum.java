class Rum{
void Pour(){
    System.out.println("pour 30 ml of rum in a glass");
}
void addCondiment(){
    System.out.println("Add some cold drink");
}
void Stir(){
    System.out.println("Stir for 30 sec");
}
void Serve(){
    System.out.println("serve through waiter");
}
void templateMethod(){
    Pour();
    addCondiment(); 
    Stir(); 
    Serve();
}
}
