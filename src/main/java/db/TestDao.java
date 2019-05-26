package db;

public class TestDao {

    private MongoService mongoService;

    public TestDao()
    {mongoService=new MongoService("library","test");}

    public void test(String name,int age)
    {
        
    }

}
