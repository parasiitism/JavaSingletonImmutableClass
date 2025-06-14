package javaSingletonImmutableClass;

public class BillPughDatabaseConnection {
    private BillPughDatabaseConnection(){

    }
    private static class BillPughDatabaseConnectionHelper{
        private static final BillPughDatabaseConnection INSTANCE_OBJECT=new BillPughDatabaseConnection();
    }
    public static BillPughDatabaseConnection getInstance(){
        return BillPughDatabaseConnectionHelper.INSTANCE_OBJECT;
    }
}
