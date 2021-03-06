import java.util.ArrayList;

public class CircularList<E> extends ArrayList<E> {

    private int getRotatingIndex(int index){
        index = (index % size());

        if(index < 0)
            index = index + size();

        return index;
    }
    

    @Override
    public E get(int index) {
        return super.get(getRotatingIndex(index));
    }
}

