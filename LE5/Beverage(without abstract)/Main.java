class Main{
    public static void main (String args[]){
        Whisky w = new Whisky();
        w.templateMethod();
        
        Beer b = new Beer();
        b.templateMethod();
        
        Rum r = new Rum();
        r.templateMethod();
    }
}
