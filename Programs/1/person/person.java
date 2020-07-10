public class person{
    private int age;
    private String name, job, hobby;
    
    public person(int age, String name, String job, String hobby){
        this.age = age;
        this.name = name;
        this.job = job;
        this.hobby = hobby;
    }

    public void put(){
        System.out.println("Name: "+this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Job" + this.job);
        System.out.println("Hobbies: " + this.hobby);
    }

    public static void main(String[] args){
        person me = new person(27, "Swaroop", "Developer", "Gaming and yoyoing");
        me.put();
    }
}