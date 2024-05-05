class Sweet{
    void price(){
    System.out.println("sweet=10");
}
}
class Sugar extends Sweet{
    void price(){
        super.price()
        Sytem.out.println("sugar=20");
}
}
class Javaprog{
    public static void main(String[],args){
    Sugar su=new Sugar()
    su.price()
}
}