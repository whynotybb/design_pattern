package behavior.template;

public class MysqlTemplate extends DBTemplate{
    @Override
    void open() {
        System.out.println("mysql has been opened");
    }

    @Override
    void select() {
        System.out.println("mysql has selected");
    }

    @Override
    void close() {
        System.out.println("mysql has been closed");
    }
}
