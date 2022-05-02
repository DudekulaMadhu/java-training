package core_java;

@FunctionalInterface
public interface inex {
    public void start();
}
class impl implements inex{
    @Override
    public void start(){
        System.out.println("hello");
    }
}