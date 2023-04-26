package Casestady.repository.interfaceRepo;

import java.util.List;

public interface IRepository <E>{
    List<E> showList();
    void addNew(E e);
}
