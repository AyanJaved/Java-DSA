public class _47accessmod {
    public static void main(String[] args) {
        bankaccount obj= new bankaccount();
        System.out.println(obj.username="rahul");
        obj.setpass("gita");
    }
}
class bankaccount{
    public String username;
    private String password;
    public void setpass(String pwd){
        password=pwd;
    }
}
