package vernon.ac.za.Services;

import java.util.List;

/**
 * Created by VERNON on 2016/08/27.
 */
public interface Service <E, ID>{

    E create(E entity);

    E readById(ID id);

    List<E> findAll();

    E update(E entity);

    void delete(E entity);

}
