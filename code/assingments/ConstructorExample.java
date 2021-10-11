public class ConstructorExample {

    private int id;
    private String name;

    public  ConstructorExample(int id,String name){

        this.id = id;
        this.name = name;

    }

    public void Show(){
        System.out.println("id:| " + id + ", name: "+ name);
    }
}
