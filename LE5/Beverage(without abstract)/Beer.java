class Beer{
void Pour(){
    System.out.println("pour beer in a glass");
}
void Serve(){
    System.out.println("serve through waiter");
}
void templateMethod(){
    Pour();
    Serve();
}
}