class Whisky{
void Pour(){
    System.out.println("pour 30 ml of whisky in a glass");
}
void addCondiment(){
    System.out.println("Add some Ice");
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
