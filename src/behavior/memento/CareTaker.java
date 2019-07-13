package behavior.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * 备忘录管理类
 */
public class CareTaker {
  private List<Memento> mementos=new ArrayList<>();
  public void addMemento(Memento memento){
      mementos.add(memento);
  }
  public Memento getMemento(int index){
      return mementos.get(index);
  }

    public static void main(String[] args) {
      OneObj oneObj=new OneObj();
      CareTaker careTaker=new CareTaker();
      oneObj.setState("state#1");
      oneObj.setState("state#2");
      careTaker.addMemento(oneObj.saveStateToMemento());
        oneObj.setState("state#3");
        oneObj.setState("state#4");
        careTaker.addMemento(oneObj.saveStateToMemento());
        oneObj.setState("state#5");
        careTaker.addMemento(oneObj.saveStateToMemento());
        //恢复2
        Memento memento=careTaker.getMemento(0);
        oneObj.getStateFromMemento(memento);
        System.out.println(oneObj.getState());
    }
}
