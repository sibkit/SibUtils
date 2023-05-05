package sibutils.common;

public interface Child<T>
{
    T getParent();
    void setParent(T parent);
}
