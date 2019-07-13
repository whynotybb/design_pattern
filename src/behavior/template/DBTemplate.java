package behavior.template;

public abstract class DBTemplate {
    abstract void open();
    abstract void select();
    abstract void close();

    final void selectTemplate(){
        open();
        select();
        close();
    }
}
