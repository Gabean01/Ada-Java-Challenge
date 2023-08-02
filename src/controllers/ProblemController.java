import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import utils.Utils;

public class ProblemController implements ProblemRepository {
    private List<Integer> data = new ArrayList<Integer>();


    @Override
    public Integer findMin() {
        if (data == null || data.size() == 0){
            return Integer.MAX_VALUE;
        } 
        Collections.sort(data);

        return data.get(0);
    }

    @Override
    public Integer findMax() {
        if (data == null || data.size() == 0){
            return Integer.MIN_VALUE;
        } 

        Collections.sort(data);
        
        return data.get(data.size() - 1);
    }

    @Override
    public double avarage() {
        return Utils.getAverageFromList(data);
    }

    @Override
    public List<Integer> showData() {
        return data;
    }

    @Override
    public void setData() {
        data.add(15);
        data.add(12);
        data.add(54);
        data.add(8);
        data.add(6);
        data.add(78);
        data.add(78);
        data.add(16);
        data.add(23);
        data.add(15);
        data.add(1);
        data.add(5);
        data.add(5);
        data.add(8);
        data.add(4);
        data.add(6);
        data.add(2);
        data.add(56);
    }
}